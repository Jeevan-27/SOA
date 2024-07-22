public class BookStore {
    public static void main(String[] args) {
        Book printedBook = new PrintedBook("Effective Java", 45.0);
        System.out.println(printedBook.getDescription() + " $" + printedBook.getCost());

        Book ebook = new EBook("Clean Code", 30.0);
        System.out.println(ebook.getDescription() + " $" + ebook.getCost());

        Book giftWrappedBook = new GiftWrapDecorator(new PrintedBook("Design Patterns", 40.0));
        System.out.println(giftWrappedBook.getDescription() + " $" + giftWrappedBook.getCost());

        Book personalizedEbook = new PersonalMessageDecorator(new EBook("Refactoring", 35.0), "Happy Birthday!");
        System.out.println(personalizedEbook.getDescription() + " $" + personalizedEbook.getCost());

        Book discountedPrintedBook = new DiscountDecorator(new PrintedBook("The Pragmatic Programmer", 50.0), 5.0);
        System.out.println(discountedPrintedBook.getDescription() + " $" + discountedPrintedBook.getCost());

        Book fullyLoadedBook = new GiftWrapDecorator(
                new PersonalMessageDecorator(
                        new DiscountDecorator(
                                new PrintedBook("Introduction to Algorithms", 60.0), 10.0), "Congratulations!"));
        System.out.println(fullyLoadedBook.getDescription() + " $" + fullyLoadedBook.getCost());
    }
}