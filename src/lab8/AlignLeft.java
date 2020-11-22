package lab8;

public class AlignLeft implements AlignStrategy {
    public AlignLeft(){

    }
    @Override
    public void render(Paragraph p) {
        System.out.println("+++"+p);
    }
}
