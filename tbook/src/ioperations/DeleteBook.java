package ioperations;

import book.Book;
import book.Booklist;

import java.util.Scanner;

public class DeleteBook implements Ioperation{
    @Override
    public void work(Booklist booklist) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你想要删除的书籍名：");
        String name=scanner.nextLine();
        int num=booklist.getNum();
        int flg=-1;
        int i=0;
        for (; i < num; i++) {
            if(booklist.getBooks(i).getTitle().equals(name)){
                flg=i;
                break;
            }
        }
        if (i==num){
            System.out.println("没有找到你要删除的书");
            System.out.println("返回操作系统");
            System.out.println("---------------------------------------------------------------------------------------------------------------------");
            return;
        }
        //开始删除
        for (int j = flg; j <num-1 ; j++) {
            Book book=booklist.getBooks(j+1);
            booklist.setBooks(j,book);
        }
        booklist.setBooks(num-1,null);
        booklist.setNum(num-1);
        System.out.println("删除成功");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println();
    }
}
