package lab8;

public class DocumentManager {
    private static DocumentManager singleton; // = new DocumentManager();
    private static Book book;


    public static Book getBook() {
        return book;
    }

    public static DocumentManager getInstance(){
        if(singleton == null)
            singleton = new DocumentManager();
        return singleton;

    }

    public void setBook(Book book) {
        getInstance();
        if(this.book == null){
            this.book = book;
        }
    }
}
