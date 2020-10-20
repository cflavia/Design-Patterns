import java.util.*;

public class Book implements Element{
    public String title;
    public ArrayList<Element> content=new ArrayList<>();
    private TableOfContents tableOfContents;
    private List <Author> authors=new ArrayList<>();
    public Book(String title){
        this.title=title;
    }
    @Override
    public String toString() {
        return "Book{" +
                "title=" + title +
                '}';
    }

    public String getTitle() {
        return title;
    }





    public void setTitle(String title) {
        this.title = title;
    }
    public void print(){
        System.out.println(this.title);
        for (Element e:content){
            e.print();
        }
    }

    public void addAuthor(Author rpGheo) {
        authors.add(rpGheo);
    }



    public void addContent(Element e) {
        content.add(e);
    }
}
