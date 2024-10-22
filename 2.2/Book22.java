public class Book22 {
    private String name;
    private Author22[] authors;
    private double price;
    private int qty = 0;

    public Book22(String name, Author22[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book22(String name, Author22[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author22[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getAuthorNames() {
        StringBuilder names = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            names.append(authors[i].getName());
            if (i != authors.length - 1) {
                names.append(", ");
            }
        }
        return names.toString();
    }
    public String toString() {
        StringBuilder authorsString = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            authorsString.append(authors[i].toString());
            if (i != authors.length - 1) {
                authorsString.append(", ");
            }
        }
        return "Book[name=" + name + ", authors={" + authorsString + "}, price=" + price + ", qty=" + qty + "]";
    }
}
