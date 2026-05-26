import book.Booklist;
import user.Adminuser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class Main {
    public static int shenfen(User user){
        return user.menu();
    }
    public static User login(){
        System.out.println("——————————————————欢迎来到图书管理系统——————————————————");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请选择你的身份：1.图书管理员  2.学生");
        int n=scanner.nextInt();
        if(n==1){
            return new Adminuser();
        }
        else if (n==2){
            return new NormalUser();
        }
        else{
            System.out.println("无效输入，退出系统");
            return null;
        }
}
    public static void main(String[] args) {
        Booklist booklist=new Booklist();
        User user=login();
        while(true){
            int choice=user.menu();
            if (choice==0){
                System.out.println("感谢使用");
                break;
            }
            user.caozuo(choice, booklist);
        }
    }

}