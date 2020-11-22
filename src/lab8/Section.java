package lab8;

import java.util.ArrayList;

public class Section implements Element, Visitee {
    String sectionTitle;
    ArrayList<Element> content=new ArrayList<>();
    public Section(String sectionTitle, ArrayList<Element>content){
        this.sectionTitle=sectionTitle;
        this.content=content;
    }

    public Section(String sectionTitle) {
        this.sectionTitle=sectionTitle;
    }

    public int add( Element elm){
        content.add(elm);
        return 1;
    }
    public void remove(Element elm){
        if(content.contains(elm)){
            content.remove(elm);
        }

    }

    public Element getElement(int index){
        return content.get(index);
    }
    @Override
    public void print() {
        System.out.println(sectionTitle);
        for(Element e:content){
            e.print();
        }
    }

    public void accept(BookStatistics stats) {
        stats.visit(this);
        for(Element i : content){
            i.accept(stats);
        }
    }
}
