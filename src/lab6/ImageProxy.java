package lab6;

public class ImageProxy implements Element{
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

}
