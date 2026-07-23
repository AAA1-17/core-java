package test3;

public class Book {
    private String title;
    private double price;
    private String author;

    public Book(String title, double price, String author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "书名：" + title + "，价格：" + price + "元，作者：" + author;
    }
}
