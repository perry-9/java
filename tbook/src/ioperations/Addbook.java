package ioperations;

import book.Book;
import book.Booklist;

import java.util.Scanner;

public class Addbook implements Ioperation{
    @Override
    public void work(Booklist booklist) {
        System.out.println("新增图书");
        int num=booklist.getNum();
        if (num==booklist.getBooks().length){
            System.out.println("书放满了，存不下了");
            return;
        }
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入你要存书的id");
        int id=scanner.nextInt();
        scanner.nextLine();
        System.out.println("请输入你要存书的名字");
        String title=scanner.nextLine();

        System.out.println("请输入你要存书的作者");
        String author=scanner.nextLine();

        System.out.println("请输入你要存书的类别");
        String category=scanner.nextLine();

        System.out.println("请输入你要存书的出版年份");
        int publishYear=scanner.nextInt();
        Book book=new Book(id,title,author,category,publishYear);
//判断书架中是否已经存过这本书了
        for (int i = 0; i < num; i++) {
            Book oldbook=booklist.getBooks(i);
            if (oldbook.getTitle().equals(book.getTitle())){
                System.out.println("这本书已经存过啦！不能再存了");
                return;
            }
        }
        //存书
        booklist.setBooks(num,book);
        booklist.setNum(num+1);
        System.out.println("存书成功");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println();
    }
}
