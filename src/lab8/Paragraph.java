package lab8;

public class Paragraph implements Element, Visitee {
    String paragraph;
    AlignStrategy alignStrategy;
    public Paragraph(String paragraph) {
        super();
        this.paragraph=paragraph;
    }

    @Override
    public String toString() {
        return paragraph;
    }

    public String getParagraph() {
        return paragraph;
    }

    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
    }
    public void print() {
        if(this.alignStrategy==null)
            System.out.println(paragraph);
        else
            alignStrategy.render(this);
    }

    public void setAlignStrategy(AlignStrategy s) {
        this.alignStrategy=s;
    }

    @Override
    public void accept(BookStatistics stats) {
        stats.visit(this);
    }
}
