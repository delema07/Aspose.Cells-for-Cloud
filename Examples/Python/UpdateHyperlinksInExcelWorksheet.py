import asposecellscloud
from asposecellscloud.CellsApi import CellsApi
from asposecellscloud.CellsApi import ApiException
from asposecellscloud.models import Hyperlink

import asposestoragecloud
from asposestoragecloud.StorageApi import StorageApi

apiKey = "XXXXX" #sepcify App Key
appSid = "XXXXX" #sepcify App SID
apiServer = "http://api.aspose.com/v1.1"
data_folder = "../../data/"

#Instantiate Aspose Storage API SDK
storage_apiClient = asposestoragecloud.ApiClient.ApiClient(apiKey, appSid, True)
storageApi = StorageApi(storage_apiClient)
#Instantiate Aspose Cells API SDK
api_client = asposecellscloud.ApiClient.ApiClient(apiKey, appSid, True)
cellsApi = CellsApi(api_client);

#set input file name
filename = "Sample_Test_Book.xls"
sheetName = "Sheet2"
hyperlinkIndex = 0;

body = Hyperlink.Hyperlink()
body.Address ="http://www.aspose.com/cloud/total-api.aspx"
body.TextToDisplay ="Aspose Cloud APIs"


#upload file to aspose cloud storage
storageApi.PutCreate(Path=filename, file=data_folder + filename)


try:
    #invoke Aspose.Cells Cloud SDK API to add a hyperlink to a worksheet
    response = cellsApi.PostWorkSheetHyperlink(name=filename, sheetName=sheetName, hyperlinkIndex=hyperlinkIndex, body=body)

    if response.Status == "OK":
        hyperlink = response.Hyperlink
        print "Hyperlink Address : " + hyperlink.Address
        #download Workbook from storage server
        response = storageApi.GetDownload(Path=filename)
        outfilename = "c:/temp/" + filename
        with open(outfilename, 'wb') as f:
                    for chunk in response.InputStream:
                        f.write(chunk)

except ApiException as ex:
            print "ApiException:"
            print "Code:" + str(ex.code)
            print "Message:" + ex.message
