package book;

public class Book {
    private int bookid;   //书id
    private String title; //书名
    private String author; //作者
    private String category; //类别
    private int publishYear;  //出版年份
    private boolean isBorrowed; //借阅状态

    public Book(int bookid, String title, String author,
                String category, int publishYear) {
        this.bookid = bookid;
        this.title = title;
        this.author = author;
        this.category = category;
        this.publishYear = publishYear;
        this.isBorrowed = false;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    @Override
    public String toString() {
        return "book{" +
                "bookid=" + bookid +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", publishYear=" + publishYear +'\''+
                (isBorrowed ? "已借出":"未借出") +
                '}';
    }
}
