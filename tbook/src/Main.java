import book.Booklist;
import user.Adminuser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class Main {
    public static int shenfen(User user){
        return user.menu();
    }
    public static int neum(){
        System.out.println("——————————————————欢迎来到图书管理系统——————————————————");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请选择你的身份：1.图书管理员  2.学生");
        int n=scanner.nextInt();
        Adminuser a=new Adminuser();
        NormalUser b=new NormalUser();
        if(n==1){
            return shenfen(a);
        }
        else if (n==2){
            return shenfen(b);
        }
        else{
            System.out.println("无效输入，退出系统");
            return 0;
        }
}
    public static void main(String[] args) {
        int ret=neum();

        Scanner scanner =new Scanner(System.in);
        Booklist booklist=new Booklist();
    }

}