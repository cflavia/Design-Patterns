package lab8;

import java.util.ArrayList;

public class Book implements Element, Visitee {
    String name;
    ArrayList<Author>authors=new ArrayList<Author>();
    ArrayList<Chapter>chapters=new ArrayList<Chapter>();
    ArrayList<Paragraph>paragraphs=new ArrayList<Paragraph>();
    ArrayList<Element>content=new ArrayList<Element>();
    Chapter chapter;
    public Book(String name){
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
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
    public void print(){
        System.out.println("Book name: "+this.name);
        printAuthors();
        for(Element i:content){
            i.print();
        }
    }

    private void printAuthors() {
        for (Author i: authors){
            i.print();
        }
    }

    public void addAuthor(Author a) {
        authors.add(a);
    }

    public int createChapter(String c) {
        Chapter chapter=new Chapter(c);
        chapters.add(chapter);
        return chapters.indexOf(chapter);
    }

    public Chapter getChapter(int indexChapterOne) {
        return chapters.get(indexChapterOne);
    }


    public void addContent(Element elm){
        content.add(elm);
    }

    @Override
    public void accept(BookStatistics stats) {

    }

    public void add(Section cap1) {
    }
}
