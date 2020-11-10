package lab6;

public class ImageProxy implements Element,Visitee{
    private String url;
    Image realImage=null;
    ImageProxy(String url){
        this.url=url;
    }
    public void print() {
        if(realImage==null){
            realImage = new Image(this.url);
        }
        realImage.print();
    }
    public Image loadImage(){
        if(realImage==null){
            realImage=new Image(url);
        }
        return realImage;
    }
    public void accept(BookStatistics stats) {
        stats.visit(this);
    }
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
