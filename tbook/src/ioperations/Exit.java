package ioperations;

import book.Booklist;

public class Exit implements Ioperation{
    @Override
    public void work(Booklist booklist) {
        System.out.println("退出系统：");
        System.exit(0);
    }
}
