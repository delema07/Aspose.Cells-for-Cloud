//ExStart:
<?php
require_once realpath(__DIR__ . '/..') . '/vendor/autoload.php';
require_once realpath(__DIR__ . '/..') . '/Utils.php';

use Aspose\Cells\CellsApi;
use Aspose\Cells\AsposeApp;

class PivotTable {

	public $cells;

	public function __construct() {
		AsposeApp::$appSID = Utils::appSID;
		AsposeApp::$apiKey = Utils::apiKey;
		$this->cells = new CellsApi();
	}

	public function deleteWorksheetPivotTable() {
    	// Upload file to Aspose Cloud Storage
		$fileName = "Sample_Pivot_Table_Example.xls";
		Utils::uploadFile($fileName);

        $result = $this->cells->DeleteWorksheetPivotTable($name=$fileName, $sheetName="Sheet2", $pivotTableIndex="0", $storage = null, $folder = null);
        print_r($result);
	}
}

$pivotTable = new PivotTable();
$pivotTable->deleteWorksheetPivotTable();

?>
//ExEnd:
