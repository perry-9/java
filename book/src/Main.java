import book.BookList;
import ioperations.IOPeration;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

/**
 * @Author 12629
 * @Description：
 */
public class Main {

    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name = scanner.nextLine();

        System.out.println("请输入你的身份，1：管理员   2：普通用户");

        int choice = scanner.nextInt();//1   2

        //问题：如果是1 管理员对象，如果是2 普通用户对象
        if(choice == 1) {
            return new AdminUser(name);
        }else {
            return new NormalUser(name);
        }
    }

    public static void main(String[] args) {
        BookList bookList = new BookList();

        User user = login();

        while (true) {
            int choice = user.menu();
            //要根据这个返回值 来看 调用哪个对象的 哪个方法
            /**
             * 1. 哪个对象
             *   已经做了：User user = login();
             * 2. 哪个方法
             *  2.1 确定当前对象 已经包含了 这些方法？
             *    在调用子类对象的时候，构造方法会初始化好对应的操作对象
             *  2.2 怎么具体调用
             */
            user.doIoperation(choice, bookList);

            //user.ioPerations[choice].work(bookList);
        }
    }


    public static void main1(String[] args) {
        String str = "hello";
        System.out.println(str);
    }
}
