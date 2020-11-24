package test;


public interface Visitor {
    public abstract void visit(WindowsPhone windowsPhone);
    public abstract void visit(Android paragraph);
    public abstract void visit(IoS ioS);
    public abstract void visit(Product product);
    public abstract void visit(HeadPhones headPhones);
    public abstract void visit(Charger charger);
    public abstract void visit(Box box);
}
