package ioperations;

import book.Booklist;

import java.util.Scanner;

public class RebackBook implements Ioperation{
    @Override
    public void work(Booklist booklist) {
        System.out.println("请输入你想要归还的书籍名：");
        Scanner scanner=new Scanner(System.in);
        String name= scanner.nextLine();
        int num =booklist.getNum();
        for (int i = 0; i < num; i++) {
            if(booklist.getBooks(i).getTitle().equals(name)){
                if (booklist.getBooks(i).isBorrowed()==false){
                    System.out.println("你想要归还的书还未被借走");
                    return;
                }
                booklist.getBooks(i).setBorrowed(false);
                System.out.println("归还成功");
                System.out.println("---------------------------------------------------------------------------------------------------------------------");
                System.out.println();
                return;
            }
        }
        System.out.println("该图书系统未录入该书籍");
        System.out.println("返回操作系统");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println();
    }
}
