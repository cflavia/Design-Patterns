package lab6;

import java.util.concurrent.TimeUnit;

public class Image implements Element,Visitee {
    private String url;
    Image content;
    Image(String url){
        this.url=url;
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void print(){
        System.out.println("Image name: "+this.url);
    }
    public Image content(){
        return this.content;
    }
    public void accept(BookStatistics stats) {
        stats.visit(this);
    }
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
