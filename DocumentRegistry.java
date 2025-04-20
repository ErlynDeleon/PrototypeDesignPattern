class DocumentRegistry {
    private PdfDocument pdfPrototype;
    private TextDocument textDocumentPrototype;
    private SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        pdfPrototype = new PdfDocument("annual_report_2024.pdf", "Acme Corp", 150, "Annual Report");
        textDocumentPrototype = new TextDocument("meeting_notes.txt", "UTF-8", 250);
        spreadsheetPrototype = new SpreadsheetDocument("sales_data_q1.xlsx", 1000, 20);
    }

    public PdfDocument createPdf(String fileName, int pageCount) {
        PdfDocument clone = (PdfDocument) pdfPrototype.clone();
        clone.fileName = fileName;
        clone.pageCount = pageCount;
        return clone;
    }

    public TextDocument createTextDoc() {
        return (TextDocument) textDocumentPrototype.clone();
    }

    public SpreadsheetDocument createSpreadsheet() {
        return (SpreadsheetDocument) spreadsheetPrototype.clone();
    }
}