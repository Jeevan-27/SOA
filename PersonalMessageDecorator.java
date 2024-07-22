public class PersonalMessageDecorator extends BookDecorator {
    private String message;

    public PersonalMessageDecorator(Book book, String message) {
        super(book);
        this.message = message;
    }

    @Override
    public String getDescription() {
        return decoratedBook.getDescription() + ", Personal Message: \"" + message + "\"";
    }

    @Override
    public double getCost() {
        return decoratedBook.getCost() + 2.0;
    }
}