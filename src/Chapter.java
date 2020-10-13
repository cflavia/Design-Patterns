import java.util.*;

public class Chapter {
    public String name;
    private Book book;
    private ArrayList<SubChapter> subChapters=new ArrayList<SubChapter>();
    public Chapter(String name){
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
        return "Chapter{" +
                "name=" + name +
                '}';
    }
    public void print(){
        System.out.println(this.name);
        for (SubChapter s: subChapters) {
            s.print();
        }
    }

    public int createSubChapter(String s) {
        SubChapter sub=new SubChapter(s);
        subChapters.add(sub);
        return subChapters.indexOf(sub);
    }

    public SubChapter getSubChapter(int indexSubChapterOne) {
        return subChapters.get(indexSubChapterOne);
    }
}
