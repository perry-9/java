package ioperations;

import book.Booklist;

import java.util.Scanner;

public class SearchBook implements Ioperation{
    @Override
    public void work(Booklist booklist) {
        System.out.println("请输入你想要查找的书名");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        int num=booklist.getNum();
        for (int i = 0; i < num; i++) {
            if(booklist.getBooks(i).getTitle().equals(name)){
                System.out.println("找到这本书啦！");
                System.out.println(booklist.getBooks(i));
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println();
            }
        }
        System.out.println("没有找到你查找的书籍");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println();
    }
}
