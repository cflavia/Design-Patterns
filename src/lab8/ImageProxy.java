package lab8;

public class ImageProxy implements Element, Visitee {
    String name;
    public ImageProxy(String name){
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ImageProxy{" +
                "name='" + name + '\'' +
                '}';
    }
    public  void print(){
        System.out.println(name);
    }

    @Override
    public void accept(BookStatistics stats) {
        stats.visit(this);
    }
}
