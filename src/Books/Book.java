package Books;

public class Book {
    private int id;
    private String title;
    private String author;
    private int price;

    public Book(int id, String title, String author, int price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public int computePrice() {
        return getPrice();
    }

    @Override
    public String toString() {
        return this.getId() + " " + this.getTitle() + " " + this.getAuthor() + " " + this.getPrice();
    }

}
