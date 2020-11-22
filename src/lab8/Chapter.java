package lab8;

import java.util.ArrayList;

public class Chapter {
    String chapter;
    ArrayList<SubChapter>subChapters=new ArrayList<SubChapter>();
    public Chapter(String chapter){
        this.chapter=chapter;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "chapter='" + chapter + '\'' +
                '}';
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public int createSubChapter(String s) {
        SubChapter subChapter=new SubChapter(s);
        subChapters.add(subChapter);
        return subChapters.indexOf(subChapter);
    }

    public SubChapter getSubChapter(int indexSubChapterOneOne) {
        return subChapters.get(indexSubChapterOneOne);
    }
}
