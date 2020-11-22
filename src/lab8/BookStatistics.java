package lab8;

public class BookStatistics {
    private int imagesCounter=0;
    private int tablesCounter=0;
    private int paragraphsCounter=0;
    private int sectionsCounter=0;

    public void visit(Image image) {
        imagesCounter++;
    }


    public void visit(ImageProxy imageProxy) {
        imagesCounter++;
    }


    public void visit(Paragraph paragraph) {
        paragraphsCounter++;
    }


    public void visit(Table table) {
        tablesCounter++;
    }

    public void visit(Section section) {
        sectionsCounter++;
    }
    public void printStatistics(){
        System.out.println("Book Statistics: ");
        System.out.println("+++ Number of images: "+imagesCounter);
        System.out.println("+++ Number of tables: "+tablesCounter);
        System.out.println("+++ Number pf paragraphs: "+paragraphsCounter);
        System.out.println("+++ Number of sections: "+sectionsCounter);
    }
    public BookStatistics() {
    }

}
