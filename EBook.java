public class EBook implements Book {
    private String title;
    private double price;

    public EBook(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return title + " (eBook)";
    }

    @Override
    public double getCost() {
        return price;
    }
}