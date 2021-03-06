package com.aspose.cells.model;

import com.aspose.cells.model.CellsDocumentProperty;
public class CellsDocumentPropertyResponse {
  private CellsDocumentProperty DocumentProperty = null;
  private String Code = null;
  private String Status = null;
  /**
	 * getDocumentProperty
	 * Gets CellsDocumentProperty
	 * @return DocumentProperty
	 */
  public CellsDocumentProperty getDocumentProperty() {
    return DocumentProperty;
  }

	/**
	 * setDocumentProperty
	 * Sets CellsDocumentProperty
	 * @param DocumentProperty CellsDocumentProperty
	 */
  public void setDocumentProperty(CellsDocumentProperty DocumentProperty) {
    this.DocumentProperty = DocumentProperty;
  }

  /**
	 * getCode
	 * Gets String
	 * @return Code
	 */
  public String getCode() {
    return Code;
  }

	/**
	 * setCode
	 * Sets String
	 * @param Code String
	 */
  public void setCode(String Code) {
    this.Code = Code;
  }

  /**
	 * getStatus
	 * Gets String
	 * @return Status
	 */
  public String getStatus() {
    return Status;
  }

	/**
	 * setStatus
	 * Sets String
	 * @param Status String
	 */
  public void setStatus(String Status) {
    this.Status = Status;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CellsDocumentPropertyResponse {\n");
    sb.append("  DocumentProperty: ").append(DocumentProperty).append("\n");
    sb.append("  Code: ").append(Code).append("\n");
    sb.append("  Status: ").append(Status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

