public class Book23 {
    private String isbn;
    private String name;
    private Author23 author;
    private double price;
    private int qty = 0;

    public Book23(String isbn, String name, Author23 author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book23(String isbn, String name, Author23 author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author23 getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName() {
        return author.getName();
    }

    public String toString() {
        return "Book[isbn=" + isbn + ",name=" + name + "," + author.toString() + ",price=" + price + ",qty=" + qty + "]";
    }
}
