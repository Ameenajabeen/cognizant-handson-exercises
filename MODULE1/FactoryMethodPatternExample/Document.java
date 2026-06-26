//Product Interface 
interface Document{
    String getDocumentType();
}
class WordDocument implements Document{
    @Override
    public String getDocumentType() {
        return "Word Document";
    }
}
class PdfDocument implements Document{
    @Override
    public String getDocumentType() {
        return "PDF Document";
    }
}
class ExcelDocument implements Document{
    @Override
    public String getDocumentType() {
        return "Excel Document";
    }
}
//Factory Class
abstract class DocumentFactory{
    abstract Document createDocument();
}
//concrete Factory Classes
class WordDocumentFactory extends DocumentFactory{
    @Override
    Document createDocument() {
        return new WordDocument();
    }
}

class PdfDocumentFactory extends DocumentFactory{
    @Override
    Document createDocument() {
        return new PdfDocument();
    }
}
class ExcelDocumentFactory extends DocumentFactory{
    @Override
    Document createDocument() {
        return new ExcelDocument();
    }
}
