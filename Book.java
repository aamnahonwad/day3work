public class Book {

    private String title;
    private String author;
    private double price;

    Book(String title) {
        this.title = title;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java");
        Book b2 = new Book("Python", "Guido");
        Book b3 = new Book("C++", "Bjarne", 500);

        b1.display();
        b2.display();
        b3.display();
    }
}