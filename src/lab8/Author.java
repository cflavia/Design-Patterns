package lab8;

public class Author implements Element, Visitee {
    String name;
    public Author(String name){
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
        return "Author{" +
                "name='" + name + '\'' +
                '}';
    }
    public void print(){
        System.out.println(this.name);
    }

    @Override
    public void accept(BookStatistics stats) {

    }
}
