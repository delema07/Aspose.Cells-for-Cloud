package com.aspose.cells.cloud.examples.cells;

import com.aspose.cells.api.CellsApi;
import com.aspose.cells.cloud.examples.Configuration;
import com.aspose.cells.cloud.examples.Utils;
import com.aspose.storage.api.StorageApi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class MergeCellsWorksheet {

    public static void main(String... args) throws IOException {
        // ExStart: merge-cells-worksheet
        try {
            // Instantiate Aspose Storage API SDK
            StorageApi storageApi = new StorageApi(Configuration.apiKey, Configuration.appSID, true);

            // Instantiate Aspose Words API SDK
            CellsApi cellsApi = new CellsApi(Configuration.apiKey, Configuration.appSID, true);
            String input = "sample1.xlsx";
            Path inputFile = Utils.getPath(MergeCellsWorksheet.class, input);
            String output = "sample2.xlsx";
            Path outputFile = Utils.getPath(MergeCellsWorksheet.class, output);

            String sheetName = "Sheet1";
            Integer startRow = 1;
            Integer startColumn = 0;
            Integer totalRows = 1;
            Integer totalColumns = 5;

            storageApi.PutCreate(input, null, Utils.STORAGE, inputFile.toFile());

            cellsApi.PostWorksheetMerge(input, sheetName, startRow, startColumn, totalRows, totalColumns, Utils.STORAGE,
                    Utils.FOLDER);

            com.aspose.storage.model.ResponseMessage sr = storageApi.GetDownload(input, null, Utils.STORAGE);

            Files.copy(sr.getInputStream(), outputFile, StandardCopyOption.REPLACE_EXISTING);

        }

        catch (Exception e) {
            e.printStackTrace();
        }
        // ExEnd: merge-cells-worksheet
    }
}