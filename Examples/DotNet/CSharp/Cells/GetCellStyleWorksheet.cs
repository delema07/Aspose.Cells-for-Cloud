﻿using System;
using Com.Aspose.Cells.Api;
using Com.Aspose.Cells.Model;
using Com.Aspose.Storage.Api;

namespace Cells
{
    class GetCellStyleWorksheet
    {
        public static void Run()
        {
            // ExStart:1
            CellsApi cellsApi = new CellsApi(Common.APP_KEY, Common.APP_SID, Common.BASEPATH);
            StorageApi storageApi = new StorageApi(Common.APP_KEY, Common.APP_SID, Common.BASEPATH);

            String fileName = "Sample_Test_Book.xls";
            String sheetName = "Sheet1";
            String cellName = "a1";
            String storage = "";
            String folder = "";

            try
            {
                // Upload source file to aspose cloud storage
                storageApi.PutCreate(fileName, "", "", System.IO.File.ReadAllBytes(Common.GetDataDir() + fileName));

                // Invoke Aspose.Cells Cloud SDK API to get cell style from worksheet
                StyleResponse apiResponse = cellsApi.GetWorksheetCellStyle(fileName, sheetName, cellName, storage, folder);

                if (apiResponse != null && apiResponse.Status.Equals("OK"))
                {
                    Console.WriteLine("Cell Font Name :: " + apiResponse.Style.Font.Name);
                    Console.ReadKey();
                }
            }
            catch (Exception ex)
            {
                System.Diagnostics.Debug.WriteLine("error:" + ex.Message + "\n" + ex.StackTrace);
            }
            // ExEnd:1
        }
    }
}
