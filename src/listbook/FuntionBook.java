package listbook;

public class FuntionBook extends Book{
    private String category;

    public FuntionBook(String bookCode, String name, double price, String author) {
        super(bookCode, name, price, author);
    }

    public FuntionBook() {
    }

    public FuntionBook(String category) {
        this.category = category;
    }

    public FuntionBook(String bookCode, String name, double price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "FuntionBook{" +
                "category='" + category + '\'' +
                super.toString() +
                "thu duoc" + super.getPrice() +
                '}';
    }
}
