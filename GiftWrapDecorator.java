public class GiftWrapDecorator extends BookDecorator {
    public GiftWrapDecorator(Book book) {
        super(book);
    }

    @Override
    public String getDescription() {
        return decoratedBook.getDescription() + ", Gift Wrapped";
    }

    @Override
    public double getCost() {
        return decoratedBook.getCost() + 3.0;
    }
}