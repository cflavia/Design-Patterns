package test;

public interface Element {
    public void print();
    void accept(Visitor visitor);
}
