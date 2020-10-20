import java.util.ArrayList;

public class Paragraph implements Element{
    public String text;
    public Paragraph(String text){
        this.text=text;
    }
    ArrayList<Element>content=new ArrayList<>();
    @Override
    public String toString() {
        return "Paragraph{" +
                "text='" + text + '\'' +
                '}';
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
    public void print(){
        System.out.println(this.text);
        for (Element e:content){
            e.print();
        }
    }
}
