package listbook;

public class ProgrammingBooK extends Book{
    private String language;
    private String framwork;

    public ProgrammingBooK(String bookCode, String name, double price, String author) {
        super(bookCode, name, price, author);
    }

    public ProgrammingBooK() {
    }

    public ProgrammingBooK(String language, String framwork) {
        this.language = language;
        this.framwork = framwork;
    }

    public ProgrammingBooK(String bookCode, String name, double price, String author, String language, String framwork) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framwork = framwork;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramwork() {
        return framwork;
    }

    public void setFramwork(String framwork) {
        this.framwork = framwork;
    }

    @Override
    public String toString() {
        return "ProgrammingBooK{" +
                "language='" + language + '\'' +
                ", framwork='" + framwork + '\'' +
                '}';
    }
}
