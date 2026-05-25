package user;

import ioperations.*;

import java.util.Scanner;

public class NormalUser extends User{
    public NormalUser() {
        this.ioperations=new Ioperation[]{
                new Exit(),
                new Openbooklist(),
                new SearchBook(),
                new BorrowBook(),
                new RebackBook()
        };
    }

    @Override
    public int menu() {
        System.out.println("学生借书操作系统：");
        System.out.println("0.退出系统");
        System.out.println("1.显示所有图书");
        System.out.println("2.查找图书");
        System.out.println("3.借阅图书");
        System.out.println("4.归还图书");
        System.out.println("****************************");
        System.out.println("请输入你的操作：");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        return choice;
    }
}
