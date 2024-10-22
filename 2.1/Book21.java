public class Book21 {
    private String name;
    private Author21 author;
    private double price;
    private int qty = 0;
    public Book21(String name, Author21 author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book21(String name, Author21 author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author21 getAuthor() {
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
    public String toString(){
        return "Book[name= " + name + ", " + author + "], price= " + price + "' qty= " + qty + "]";
    }
}
