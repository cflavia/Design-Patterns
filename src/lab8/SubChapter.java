package lab8;

import java.util.ArrayList;

public class SubChapter {
    String subChapter;
    ArrayList<Paragraph>paragraphs=new ArrayList<Paragraph>();
    ArrayList<Image>images=new ArrayList<Image>();
    ArrayList<Table>tables=new ArrayList<Table>();

    public SubChapter(String subChapter) {
        this.subChapter=subChapter;
    }

    public SubChapter() {

    }

    @Override
    public String toString() {
        return "SubChapter{" +
                "subChapter='" + subChapter + '\'' +
                ", paragraphs=" + paragraphs +
                ", images=" + images +
                ", tables=" + tables +
                '}';
    }

    public void createNewParagraph(String p) {
        Paragraph paragraph=new Paragraph(p);
        paragraphs.add(paragraph);
    }

    public void print() {
        System.out.println("Subchapter: "+subChapter);
        for(Paragraph p:paragraphs){
            p.print();
        }
        for (Image i:images){
            i.print();
        }
        for (Table t:tables){
            t.print();
        }
    }

    public void createNewImage(String s) {
        Image image=new Image(s);
        images.add(image);
    }

    public void createNewTable(String s) {
        Table table=new Table(s);
        tables.add(table);
    }
}
