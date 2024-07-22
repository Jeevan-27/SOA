public class DiscountDecorator extends BookDecorator {
    private double discount;

    public DiscountDecorator(Book book, double discount) {
        super(book);
        this.discount = discount;
    }

    @Override
    public String getDescription() {
        return decoratedBook.getDescription() + ", Discount Applied";
    }

    @Override
    public double getCost() {
        return decoratedBook.getCost() - discount;
    }
}