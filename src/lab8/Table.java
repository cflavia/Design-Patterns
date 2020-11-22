package lab8;


public class Table implements Element, Visitee {
    String table;
    public Table(String table){
        this.table=table;
    }

    @Override
    public String toString() {
        return "Table " +table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getTable() {
        return table;
    }

    @Override
    public void print() {
        System.out.println("Table: "+table);
    }

    @Override
    public void accept(BookStatistics stats) {
        stats.visit(this);
    }

}
