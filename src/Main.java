public class Main {
    public static void main(String [] args){
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

    }

}
