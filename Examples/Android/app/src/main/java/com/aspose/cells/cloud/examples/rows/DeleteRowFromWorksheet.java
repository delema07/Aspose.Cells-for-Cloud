package com.aspose.cells.cloud.examples.rows;


import java.io.IOException;
import java.io.File;
import com.aspose.cells.cloud.examples.R;
import android.content.Context;

import com.aspose.cells.api.CellsApi;
import com.aspose.cells.cloud.examples.Configuration;
import com.aspose.cells.cloud.examples.Utils;
import com.aspose.storage.api.StorageApi;


public class DeleteRowFromWorksheet {

	public static void execute(Context context) throws IOException {
		//ExStart: delete-row-from-worksheet
		try {
			// Instantiate Aspose Storage API SDK
			StorageApi storageApi = new StorageApi(Configuration.apiKey, Configuration.appSID, true);

			// Instantiate Aspose Words API SDK
			CellsApi cellsApi = new CellsApi(Configuration.apiKey, Configuration.appSID, true);
			String input = "Sample1.xlsx";
			String output = "Sample2.xlsx";


			File inputFile = Utils.stream2file("sample1","xlsx", context.getResources().openRawResource(R.raw.sample1));
			File outputFile = Utils.stream2file("sample2","xlsx", context.getResources().openRawResource(R.raw.sample2));

			String sheetName = "Sheet1";
			Integer rowIndex = 1;

			storageApi.PutCreate(input, null, Utils.STORAGE, inputFile);

			com.aspose.cells.model.SaaSposeResponse apiResponse = cellsApi.DeleteWorksheetRow(input, sheetName,
					rowIndex, Utils.STORAGE, null);

			com.aspose.storage.model.ResponseMessage sr = storageApi.GetDownload(input, null, Utils.STORAGE);

			Utils.copyInputStreamToFile(sr.getInputStream(),outputFile);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		//ExEnd: delete-row-from-worksheet

	}
}