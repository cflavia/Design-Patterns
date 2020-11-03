package lab;

import java.util.concurrent.TimeUnit;

public class Image implements Element {
    String imageName;

    Image(String name) {
        imageName = name;
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void Image(String imageName){
        this.imageName=imageName;
    }

    public String getImageNameName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public String toString() {
        return "Image{" +
                "imageName=" + imageName +
                '}';
    }
    public void print(){
        System.out.println(this.imageName);
    }
}
