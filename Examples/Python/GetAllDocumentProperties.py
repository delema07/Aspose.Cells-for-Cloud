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
filename = "Sample_Book1.xlsx"

#upload file to aspose cloud storage
storageApi.PutCreate(Path=filename, file=data_folder + filename)


try:
    #invoke Aspose.Cells Cloud SDK API to get all document properties of a workbook
    response = cellsApi.GetDocumentProperties(name=filename)

    if response.Status == "OK":
        for docProperty in response.DocumentProperties.DocumentPropertyList:
            print "Name: " + docProperty.Name
            print "Value: " + docProperty.Value
            print "BuiltIn: " + docProperty.BuiltIn
            print "--"
except ApiException as ex:
            print "ApiException:"
            print "Code:" + str(ex.code)
            print "Message:" + ex.message
