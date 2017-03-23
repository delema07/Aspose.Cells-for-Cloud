//ExStart:
<?php
require_once realpath(__DIR__ . '/..') . '/vendor/autoload.php';
require_once realpath(__DIR__ . '/..') . '/Utils.php';

use Aspose\Cells\CellsApi;
use Aspose\Cells\AsposeApp;

class OLEObject {

	public $cells;

	public function __construct() {
		AsposeApp::$appSID = Utils::appSID;
		AsposeApp::$apiKey = Utils::apiKey;
		$this->cells = new CellsApi();
	}

	public function deleteWorksheetOleObject() {
    	// Upload file to Aspose Cloud Storage
		$fileName = "Embeded_OleObject_Sample_Book1.xlsx";
		Utils::uploadFile($fileName);

        $result = $this->cells->DeleteWorksheetOleObject($name=$fileName, $sheetName="Sheet1", $oleObjectIndex="0", $storage = null, $folder = null);
        print_r($result);
	}
}

$oLEObject = new OLEObject();
$oLEObject->deleteWorksheetOleObject();

?>
//ExEnd:
