public class ProcessedDocument {
  public static void main(String[] args) {
      System.out.println("Creating a PDF Document prototype.");
      System.out.println("Creating a Text Document prototype.");
      System.out.println("Creating a Spreadsheet Document prototype.");
      
      DocumentRegistry registry = new DocumentRegistry();

      PdfDocument pdf = registry.createPdf("annual_report_2024.pdf", 150);
      pdf.open();
      System.out.println(pdf.getType());

      TextDocument textDoc = registry.createTextDoc();
      textDoc.open();
      System.out.println(textDoc.getType());

      SpreadsheetDocument sheet = registry.createSpreadsheet();
      sheet.open();
      System.out.println(sheet.getType());

      PdfDocument summaryPdf = registry.createPdf("summary_report.pdf", 30);
      summaryPdf.open();
  }
}
