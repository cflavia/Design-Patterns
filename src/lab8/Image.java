package lab8;

import java.util.concurrent.TimeUnit;

public class Image implements Element, Visitee {
    String name;
    public Image(String name){
        this.name=name;
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Image{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
    public void print() {
        System.out.println("Image: "+name);
    }

    @Override
    public void accept(BookStatistics stats) {
            stats.visit(this);
    }
}
