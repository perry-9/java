package ioperations;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @Author 12629
 * @Description：
 */
public class DelOperation implements IOPeration{
    public void work(BookList bookList) {
        System.out.println("删除图书.....");

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你删除的书名：");
        String name = scanner.nextLine();
        int currentSize = bookList.getUsedSize();

        int pos = -1;
        //找到这本书
        int i = 0;
        for (; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)) {
                pos = i;
                break;
            }
        }

        if(i == currentSize) {
            System.out.println("没有你要删除的书！");
            return ;
        }

        //这里开始删除
        for (int j = pos; j < currentSize-1; j++) {
            //bookList[j] = bookList[j+1];
            Book book = bookList.getBook(j+1);

            bookList.setBook(j,book);
        }

        bookList.setBook(currentSize-1,null);

        bookList.setUsedSize(currentSize-1);
        System.out.println("删除成功！！！！");
    }
}