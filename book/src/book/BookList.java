package book;

/**
 * @Author 12629
 * @Description：
 */
public class BookList {

    private Book[] books = new Book[10];
    private int usedSize;//有效的数据个数【实际放的书的个数】


    public BookList() {
        this.books[0] = new Book("三国演义","罗贯中",10,"小说");
        this.books[1] = new Book("西游记","吴承恩",59,"小说");
        this.books[2] = new Book("红楼梦","曹雪芹",16,"小说");

        this.usedSize = 3;
    }

    //有其他方法？  有
    public int getUsedSize() {
        return usedSize;
    }
    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
    public Book getBook(int pos) {
        return books[pos];
    }

    public void setBook(int pos,Book book) {
        this.books[pos] = book;
    }
    public Book[] getBooks() {
        return books;
    }
}
