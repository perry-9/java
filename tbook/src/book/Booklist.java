package book;

import java.util.Arrays;

public class Booklist {
    private Book[] books=new Book[20];
    private int num;


    public Booklist(){
        this.books[0]=new Book(1,"被讨厌的勇气","阿德勒","xinli",2017);
        this.books[1]=new Book(2,"皮皮鲁与鲁西西","郑渊洁","tonghua",2010);
        this.books[2]=new Book(3,"我的重生日记","秋树","xiaoshuo",2024);
        this.num=3;
    }

    public Book getBooks(int pos) {
        return books[pos];
    }

    public void setBooks(int pos,Book book) {
        this.books[pos] = book;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Booklist{" +
                "books=" + Arrays.toString(books) +
                ", num=" + num +
                '}';
    }
}
