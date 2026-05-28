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
        String s="perry shiyigedashuaige";
        System.out.println(s.charAt(0));   //p   0位置的字符为p
        System.out.println(s.charAt(5));   //“空格”  5位置的字符为“空格”
        System.out.println(s.charAt(6));   //s      6位置的字符为s
        System.out.println(s.indexOf('a')); //14    从前往后找第一次出现字符‘a'的位置为14
        System.out.println(s.indexOf('a',2));   //14  从位置2开始从前往后找第一次出现字符’a‘的位置为14
        System.out.println(s.lastIndexOf('a',2)); //-1 从位置2开始从后往前找，没有找到字符’a'
        System.out.println(s.lastIndexOf('a',18));//18 从位置18开始从后往前找，第一次出现字符‘a'的位置为18
        System.out.println(s.lastIndexOf('a',17));//14 从位置17开始从后往前找，第一次出现字符‘a'的位置为17
        System.out.println(s.lastIndexOf('a'));            //18  从后往前找，第一次出现字符‘a'的位置为18

    }
//字符串转换
    public static void main2(String[] args) {
        //数值转字符串
        String s1=String.valueOf(123);
        String s2=String.valueOf(true);
        String s3=String.valueOf(123.456);
        System.out.println(s1);         //123
        System.out.println(s2);         //true
        System.out.println(s3);         //123.456
        //字符串转数值
        int a=Integer.parseInt("1234");
        double b=Double.parseDouble("3.1415");
        System.out.println(a);          //1234
        System.out.println(b);          //3.1415
    }

    //大小写转换
    public static void main3(String[] args) {
        String s1="who are you i am anna";
        String s2="HELLO";
        String s11=s1.toUpperCase();
        String s22=s2.toLowerCase();
        System.out.println(s11);        //WHO ARE YOU I AM ANNA
        System.out.println(s22);        //hello
    }

    //字符串转数组
    public static void main4(String[] args) {
        String p="perry shidashuaige";
        char[] pp=p.toCharArray();
        System.out.println(Arrays.toString(pp));
        //[p, e, r, r, y,  , s, h, i, d, a, s, h, u, a, i, g, e]
        for(char x:pp){
            System.out.print(x+" ");
        }       //p e r r y   s h i d a s h u a i g e
    }
    //格式化
    public static void main5(String[] args) {
        String p="perry shidashuaige";
        String pp=String.format("%d-%d-%d",2014,2,4);
        System.out.println(pp);   //2014-2-4
    }
//替换
    public static void main6(String[] args) {
        String i="hellooworld";
        String ii=i.replace("o"," ");
        String iii=i.replaceFirst("o"," ");
        String iiii=i.replaceAll("[lo]"," ");
        System.out.println(ii);         //hell  w rld
        System.out.println(iii);        //hell oworld
        System.out.println(iiii);
    }
    //拆分
    public static void main7(String[] args) {
        String o="hello,hello!world";
        String[] oo=o.split("o");
        String[] ooo=o.split("o",2);
        System.out.println(Arrays.toString(oo));    //[hell, ,hell, !w, rld]
        System.out.println(Arrays.toString(ooo));   //[hell, ,hello!world]
//        String original = "helloworld";
//        int start = 2;   // 索引2开始（l）
//        int end = 7;     // 索引7结束（r? 实际原字符串索引: h e l l o w o r l d，索引2='l', 索引7='r'）
//        String sub = original.substring(start, end);   // "llowor"
//        String[] parts = sub.split("o");               // ["ll", "w", "r"]
//        System.out.println(Arrays.toString(parts));
    }
    //截取
    public static void main8(String[] args) {
        String p="perry shidashuaige";
        System.out.println(p.substring(14)); //aige
        System.out.println(p.substring(0,10)); //perry shid
    }
    //去除两边的空白
    public static void main9(String[] args) {
        String p="            perry shi da shuai ge                      ";
        String pp=p.trim();
        System.out.println(pp);    //perry shi da shuai ge
    }
    //intern
    public static void main(String[] args) {
        String s1 = new String("hello");          // 堆中的新对象，常量池中已有 "hello"（来自字面量）
        String s2 = s1.intern();                   // 常量池中已有 "hello"，返回常量池中的引用
        System.out.println(s1 == s2);             // false（s1 在堆，s2 在常量池）

        String s3 = new String("world");
        String s4 = s3.intern();                  // 假设常量池中没有 "world"，则 s3 被添加到池中，并返回 s3 的引用
        String s5 = "world";                      // 直接使用常量池中的 "world"
        System.out.println(s4 == s5);             // true（s4 和 s5 指向同一常量池对象）
    }

    public static void main11(String[] args) {
//        int a=10;
//        int b=10;
//        int c=21;
//        System.out.println(a==b);       //true
//        System.out.println(a==c);       //false
        String s1=new String("hello");
        String s2=new String("hello");
        System.out.println(s1==s2);     //flase s1、s2分别指向堆中的不同对象
        System.out.println(s1.equals(s2)); //s1、s2 的内容相同


        String a = "abc";
        String b = "abd";
        System.out.println(a.compareTo(b)); // -1 (因为 'c' - 'd' = -1)
        System.out.println(a.equals(b));    //false
        String c = "abc";
        String d = "abcd";
        System.out.println(c.compareTo(d)); // -1 (长度差 3-4 = -1)
        System.out.println(c.equals(d));    //false
        String e = "abc";
        String f = "abc";
        System.out.println(e.compareTo(f)); // 0
        System.out.println(e.equals(f));  //false
    }

}