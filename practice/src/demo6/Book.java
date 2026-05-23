package demo6;

public class Book {
    public String bookname;
    public String personname;
    public int money;

    @Override
    public String toString() {
        return "Book{" +
                "bookname='" + bookname + '\'' +
                ", personname='" + personname + '\'' +
                ", money=" + money +
                '}';
    }

    public Book(String bookname, String personname, int money) {
        this.bookname = bookname;
        this.personname = personname;
        this.money = money;

    }
}
