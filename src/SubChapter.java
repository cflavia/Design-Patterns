import javafx.scene.control.Tab;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    public String name;
    public ArrayList<Paragraph> paragraphs=new ArrayList<>();
    public ArrayList<Table> tables=new ArrayList<>();
    public ArrayList<Image> images=new ArrayList<>();
    public SubChapter(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SubChapter{" +
                "name=" + name +
                '}';
    }
    public void print(){
        System.out.println("Subchapter: "+this.name);
        for (Paragraph p: paragraphs){
            p.print();
        }
        for (Table t: tables){
            t.print();
        }
        for (Image i: images){
            i.print();
        }
    }

    public void createNewParagraph(String s) {
        Paragraph p=new Paragraph(s);
        paragraphs.add(p);
    }
    public void createNewTable(String t){
        Table ta=new Table(t);
        tables.add(ta);
    }
    public void createNewImage(String i){
        Image img=new Image(i);
        images.add(img);
    }
}
