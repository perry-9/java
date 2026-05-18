//class dog{
//    public String name;
//    public int age;
//    public String color;
//    public dog(String name){
//        System.out.println(name + "汪汪汪");
//    }
//    public dog(String name,int age,String color){
//        this.name=name;
//        this.age=age;
//        this.color=color;
//    }
//    public dog (){
//        this("xiaobai",21,"yellow");
//    }
//    public String toString(){
//        return name+" "+age+" "+color;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        dog dog=new dog();
//        System.out.println(dog);
//    }
//}

//class student{
//    private String name;
//    private int age;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        student student = new student();
//        student.setName("lisi");
//        System.out.println(student.getName());
//    }
//}

//class student{
//    static String name="wangwu";
//    static int age;
//}
//public class Main {
//    public static void main(String[] args) {
//        System.out.println(student.name);
//        student student1 = new student();
//        student student2 = new student();
//        student student3 = new student();
//        System.out.println(student1.name);
//        System.out.println(student2.name);
//        System.out.println(student3.name);
//    }
//}

//class student{
//    static String name="wangxiaoer";
//    public static String getName(){
//        return name;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        System.out.println(student.getName());
//    }
//}


class student{
    private String name;
    private int age;
    public student (){
        System.out.println("构造函数执行");
    }
    {
        System.out.println("示例代码块执行");
    }
    static{
        System.out.println("静态代码块执行");
    }
}
public class Main {
    public static void main(String[] args) {
        new student();
    }
}