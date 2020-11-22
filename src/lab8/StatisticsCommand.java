package lab8;

public class StatisticsCommand implements Command {
    public void execute() {
        System.out.println("Getting book statistics...");

        if (DocumentManager.getInstance().getBook() != null) {
            BookStatistics s = new BookStatistics();
            DocumentManager.getInstance().getBook().accept(s);
            s.printStatistics();
        }
        else
            System.out.println("There is no book");
    }
}
