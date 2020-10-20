public class Main {
    public static void main(String [] args) throws Exception{
        Book discoTitanic =new Book("Disco Titanic");
        Author rpGheo=new Author("Radu Pavel Gheo");
        discoTitanic.addAuthor(rpGheo);
        int indexChapterOne=discoTitanic.createChapter("Capitolul 1");
        Chapter chp1=discoTitanic.getChapter(indexChapterOne);
        int indexSubChapterOne=chp1.createSubChapter("Subcapitolul 1.1");
        SubChapter scOneOne=chp1.getSubChapter(indexSubChapterOne);
        scOneOne.createNewParagraph("Paragraph 1");
        scOneOne.createNewParagraph("Paragraph 2");
        scOneOne.createNewImage("Image 1");
        scOneOne.createNewImage("Image 2");
        scOneOne.createNewTable("Table 1");
        scOneOne.createNewTable("Table 2");
        scOneOne.print();
        Book noapteBuna = new Book("Noapte buna, copii!");noapteBuna.addAuthor(rpGheo);
        Section cap1 = new Section("Capitolul 1");
        Section cap11 = new Section("Capitolul 1.1");
        Section cap111 = new Section("Capitolul 1.1.1");
        Section cap1111 = new Section("Subchapter 1.1.1.1");
        noapteBuna.addContent(new Paragraph("Multumesc celor care au facut posibila......"));
        noapteBuna.addContent(cap1);

        cap1.add(new Paragraph("Moto capitol"));
        cap1.add(cap11);
        cap11.add(new Paragraph("Text from subchapter 1.1"));
        cap11.add(cap111);
        cap111.add(new Paragraph("Text from subchapter 1.1.1"));
        cap111.add(cap1111);
        cap1111.add(new Image("Image subchapter 1.1.1.1"));
        noapteBuna.print();
    }

}
