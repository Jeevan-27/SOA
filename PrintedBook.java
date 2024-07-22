public class PrintedBook implements Book {
    private String title;
    private double price;

    public PrintedBook(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return title;
    }

    @Override
    public double getCost() {
        return price;
    }
}