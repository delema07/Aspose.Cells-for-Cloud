// ExStart:1
var fs = require('fs');
var assert = require('assert');
var StorageApi = require('asposestoragecloud');
var CellsApi = require('asposecellscloud');
var configProps = require('../Config/config.json');
var data_path = '../../../../Data/';

var AppSID = configProps.app_sid;
var AppKey = configProps.api_key;
var config = {'appSid':AppSID,'apiKey':AppKey , 'debug' : true};

// Instantiate Aspose Storage API SDK
var storageApi = new StorageApi(config);
// Instantiate Aspose Cells API SDK
var cellsApi = new CellsApi(config);

// Set input file name
var name = "Sample_Test_Book.xls";
var sheetName = "Sheet1";
var row = 0;
var column = 1;
var freezedRows = 1;
var freezedColumns = 2;

try {
// Upload source file to aspose cloud storage
storageApi.PutCreate(name, null, null, data_path + name , function(responseMessage) {
	assert.equal(responseMessage.status, 'OK');
	
	// Invoke Aspose.Cells Cloud SDK API to freeze panes in a worksheet
	cellsApi.PutWorksheetFreezePanes(name, sheetName, row, column, freezedRows, freezedColumns, null, null, function(responseMessage) {
			assert.equal(responseMessage.status, 'OK');
			
			// Download updated Workbook from storage server
			storageApi.GetDownload(name, null, null, function(responseMessage) {
				assert.equal(responseMessage.status, 'OK');
				var outfilename = name;
				var writeStream = fs.createWriteStream(data_path + "_out_" + outfilename);
				writeStream.write(responseMessage.body);
				});
			});
	});

}catch (e) {
  console.log("exception in example");
  console.log(e);
}
//ExEnd:1