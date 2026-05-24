package user;

import book.BookList;
import ioperations.IOPeration;

/**
 * @Author 12629
 * @Description：
 */
public abstract class User {
    protected String name;
    //此时这个数组 没有初始化
    public IOPeration[] ioPerations;

    //此时 这个里 为了 子类当中 帮我初始化 父类的成员
    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    public void doIoperation(int choice, BookList bookList) {
        ioPerations[choice].work(bookList);
    }
}
