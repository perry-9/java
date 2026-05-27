////public class Main {
////    public static void main(String[] args) {
////        String s = "aaabbbcccaaabbbccc";
////        System.out.println(s.indexOf('c', 10));
////        System.out.println(s.lastIndexOf('c', 10));
////    }
////}
////import java.util.Scanner;
////
////// 注意类名必须为 Main, 不要有任何 package xxx 信息
////public class Main {
////    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////        String str=scanner.nextLine();
////        String[] ret=str.split(" ");
////        System.out.println(ret[ret.length-1].length());
////    }
////}
//
//import java.util.Scanner;
//

import java.util.Arrays;
import java.util.Scanner;

//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str=scanner.nextLine();
//        int n=str.lastIndexOf(' ');
//        if(n==-1){
//            n=0;
//        }
//        String ret=str.substring(n);
//        System.out.println(ret.length());
//    }
//}
//public class Main {
//    public static boolean isAdmin(String userId){
//        return userId.toLowerCase()=="admin";
//    }
//    public static void main1(String[] args){
//        System.out.println(isAdmin("Admin"));
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        String str=scanner.nextLine();
//        String[] s=str.split(" ");
//        System.out.println(s.length);
//    }
//}
public class Main {
    //字符串查找
    public static void main1(String[] args) {
        String s="pangzheruishiyigedashuaige";
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf('a',2));
        System.out.println(s.lastIndexOf('a',2));
        System.out.println(s.lastIndexOf('a',18));
        System.out.println(s.lastIndexOf('a',17));

    }
//字符串转换
    public static void main2(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        String s1=String.valueOf(123);
        String s2=String.valueOf(true);
        String s3=String.valueOf(123.456);
        String s4=String.valueOf(arr);
        String s5= Arrays.toString(arr);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }

    //大小写转换
    public static void main3(String[] args) {
        String s1="who are you";
        String s2="i am anna";
        String s11=s1.toUpperCase();
        String s22=s2.toUpperCase();
        System.out.println(s11);
        System.out.println(s22);
    }

    //字符串转数组
    public static void main4(String[] args) {
        String p="pangzherui shidashuaige";
        char[] pp=p.toCharArray();
        System.out.println(Arrays.toString(pp));
        for(char x:pp){
            System.out.print(x+" ");
        }
    }
    //格式化
    public static void main5(String[] args) {
        String p="pangzherui shidashuaige";
        String pp=String.format("%d-%d-%d",2014,2,4);
        System.out.println(pp);
    }
//替换
    public static void main6(String[] args) {
        String i="hellooworld";
        String ii=i.replace("o"," ");
        String iii=i.replaceFirst("o"," ");
        System.out.println(ii);
        System.out.println(iii);
    }
    //拆分
    public static void main7(String[] args) {
        String o="helloworld";
        String[] oo=o.split("o");
        String[] ooo=o.split("o",2);
        System.out.println(Arrays.toString(oo));
        System.out.println(Arrays.toString(ooo));
        String original = "helloworld";
        int start = 2;   // 索引2开始（l）
        int end = 7;     // 索引7结束（r? 实际原字符串索引: h e l l o w o r l d，索引2='l', 索引7='r'）
        String sub = original.substring(start, end);   // "llowor"
        String[] parts = sub.split("o");               // ["ll", "w", "r"]
        System.out.println(Arrays.toString(parts));
    }
    //截取
    public static void main8(String[] args) {
        String p="pangzherui shidashuaige";
        System.out.println(p.substring(14));
        System.out.println(p.substring(0,10));
    }
    //去除两边的空白
    public static void main9(String[] args) {
        String p="            pangzherui shi da shuai ge                      ";
        String pp=p.trim();
        System.out.println(pp);
    }
    //intern
    public static void main(String[] args) {
        String s1 = new String("hello");          // 堆中的新对象，常量池中已有 "hello"（来自字面量）
        String s2 = s1.intern();                  // 常量池中已有 "hello"，返回常量池中的引用
        System.out.println(s1 == s2);             // false（s1 在堆，s2 在常量池）

        String s3 = new String("world");
        String s4 = s3.intern();                  // 假设常量池中没有 "world"，则 s3 被添加到池中，并返回 s3 的引用
        String s5 = "world";                      // 直接使用常量池中的 "world"
        System.out.println(s4 == s5);             // true（s4 和 s5 指向同一常量池对象）
        System.out.println(s3 == s5);
    }
}