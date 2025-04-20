public class PdfDocument implements Document {
  public String fileName;
  public String author;
  public int pageCount;
  public String name;

  public PdfDocument(String fileName, String author, int pageCount, String name) {
      this.fileName = fileName;
      this.author = author;
      this.pageCount = pageCount;
      this.name = name;
  }

  @Override
  public Document clone() {
      return new PdfDocument(fileName, author, pageCount, name);
  }

  @Override
  public void open() {
      System.out.println("Opening PDF Document: " + fileName + " by " + author + " (" + pageCount + " pages)");
  }

  @Override
  public String getType() {
      return "Type: PDF, File: " + fileName + ", Author: " + author + ", Pages: " + pageCount;
  }
}
