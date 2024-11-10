public class AuthorBook {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public AuthorBook(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public AuthorBook(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public void setQty(int newQty) {
        this.qty = newQty;
    }

    @Override
    public String toString() {
        StringBuilder authorNames = new StringBuilder();
        for (Author author : authors) {
            authorNames.append(author.toString()).append(", ");
        }
        return "AuthorBook{name='" + name + "', authors=[" + authorNames + "], price=" + price + ", qty=" + qty + "}";
    }
}