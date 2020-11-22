package lab8;

public class AlignCenter implements AlignStrategy {
    public AlignCenter(){

    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void render(Paragraph p) {
        System.out.println("+++"+p+"+++");
    }
}
