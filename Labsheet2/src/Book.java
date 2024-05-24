public class Book {
    private String title, author;
    private double price;
    private static int count;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        count++;
    }

    public static void main(String[] args) {
        Book firstBook = new Book("No Longer Human", "Osamu Dazai", 700);
        Book secondBook = new Book("Kafka on the shore", "Haruki Murakami", 800);

        System.out.println("No. of books in the shelf: " + count);
        System.out.println("1.\tTitle: " + firstBook.title + "\n\tAuthor: " + firstBook.author + "\n\tPrice: " + firstBook.price);
        System.out.println("\n2.\tTitle: "+ secondBook.title + "\n\tAuthor: " + secondBook.author + "\n\tPrice: " + secondBook.price);
    }
}
