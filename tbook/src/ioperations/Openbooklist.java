package ioperations;

import book.Book;
import book.Booklist;

public class Openbooklist implements Ioperation {
    @Override
    public void work(Booklist booklist) {
        System.out.println("显示所有图书:");
        int num=booklist.getNum();
        for (int i = 0; i < num; i++) {
            Book book=booklist.getBooks(i);
            System.out.println(book);
        }
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println();
    }
}
