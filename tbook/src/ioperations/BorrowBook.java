package ioperations;

import book.Book;
import book.Booklist;

import java.util.Scanner;

public class BorrowBook implements Ioperation{
    @Override
    public void work(Booklist booklist) {
        System.out.println("请输入你想要借阅的书籍名：");
        Scanner scanner=new Scanner(System.in);
        String name= scanner.nextLine();
        int num =booklist.getNum();
        for (int i = 0; i < num; i++) {
            if(booklist.getBooks(i).getTitle().equals(name)){
                if (booklist.getBooks(i).isBorrowed()){
                    System.out.println("你想借的书已经被借走了");
                    return;
                }
                booklist.getBooks(i).setBorrowed(true);
                System.out.println("借阅成功");
                System.out.println("---------------------------------------------------------------------------------------------------------------------");
                System.out.println();
                return;
            }
        }
        System.out.println("没有找到你要借阅的书籍");
        System.out.println("返回操作系统");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println();
    }
}
