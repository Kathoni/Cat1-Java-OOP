class Book {
    private String title;
    private Author author; // Change to Author type
    private double price;
    private int qty = 0; // Default quantity to 0

    public Book(String title, Author author, double price, int qty) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author=" + author + ", price=" + price + ", qty=" + qty + "}";
    }
}