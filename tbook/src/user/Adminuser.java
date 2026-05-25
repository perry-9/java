package user;

import ioperations.*;

import java.util.Scanner;

public class Adminuser extends User{
    public Adminuser() {
        this.ioperations=new Ioperation[]{
                new Exit(),
                new Openbooklist(),
                new SearchBook(),
                new Addbook(),
                new DeleteBook()
        };
    }

    @Override
    public int menu() {
        System.out.println("图书管理员操作系统：");
        System.out.println("0.退出系统");
        System.out.println("1.显示所有图书");
        System.out.println("2.查找图书");
        System.out.println("3.新增图书");
        System.out.println("4.删除图书");
        System.out.println("****************************");
        System.out.println("请输入你的操作：");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        return choice;
    }
}
