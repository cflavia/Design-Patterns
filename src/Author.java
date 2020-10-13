public class Author {
    public String name;
    private Book book;

    public Author(String name) {
        this.name=name;
    }

    public void Author(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name=" + name +
                '}';
    }
    public void print(){
        System.out.println(this.name);
    }

}
