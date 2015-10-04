package com.aspose.cells.cloud.examples.cells;

import com.aspose.cells.cloud.examples.Common;
import java.io.IOException;
import java.nio.file.Path;

public class GetMaxRowWorksheet {

    public static void main(String... args) throws IOException {
        String input = "sample1.xlsx";
        Path inputFile = Common.getPath(GetMaxRowWorksheet.class, input);

        String sheetName = "Sheet1";
        String cellOrMethodName = "maxrow";

        Common.getStorageSdk().PutCreate(
                input,
                null,
                Common.STORAGE,
                inputFile.toFile()
        );

        Integer apiResponse
                = Common.getCellsSdk().GetWorksheetCellProperty(
                        input,
                        sheetName,
                        cellOrMethodName,
                        Common.STORAGE,
                        Common.FOLDER
                );
        System.out.println(" MaxRow :: " + apiResponse);

    }
}
