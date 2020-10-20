

public class Image implements Element {
    String imageName;

    public Image(String imageName) {
        this.imageName=imageName;
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
