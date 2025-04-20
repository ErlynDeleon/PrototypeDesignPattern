public class TextDocument implements Document {
  public String filePath;
  public String encoding;
  public int wordCount;

  public TextDocument(String filePath, String encoding, int wordCount) {
      this.filePath = filePath;
      this.encoding = encoding;
      this.wordCount = wordCount;
  }

  @Override
  public Document clone() {
      return new TextDocument(filePath, encoding, wordCount);
  }

  @Override
  public void open() {
      System.out.println("Opening Text Document: " + filePath + " with encoding: " + encoding + " (" + wordCount + " words)");
  }

  @Override
  public String getType() {
      return "Type: Text, Path: " + filePath + ", Encoding: " + encoding + ", Words: " + wordCount;
  }
}
