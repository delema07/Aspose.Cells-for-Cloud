import asposecellscloud
from asposecellscloud.CellsApi import CellsApi
from asposecellscloud.CellsApi import ApiException

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
sheetName="Sheet2"
oldValue = "aspose"
newValue = "aspose.com"

#upload file to aspose cloud storage
storageApi.PutCreate(Path=filename, file=data_folder + filename)

try:
    #invoke Aspose.Cells Cloud SDK API to replace text in a worksheet
    response = cellsApi.PostWorsheetTextReplace(name=filename, sheetName=sheetName, oldValue=oldValue, newValue=newValue)

    if response.Status == "OK":
        print "Matches: " + str(response.Matches)

except ApiException as ex:
            print "ApiException:"
            print "Code:" + str(ex.code)
            print "Message:" + ex.message
