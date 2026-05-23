package demo15;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Student student1=new Student(12,"zhangsan",99);
        Student student2=new Student(9,"lisi",98);
        Student student3=new Student(2,"wangwu",120);
        Student student4=new Student(5,"wanger",99);
        Student student5=new Student(7,"wangcong",110);
        Student[] arr={student1,student2,student3,student4,student5};
        Arrays.sort(arr);
        for(Student a:arr){
            System.out.println(a);
        }
    }
}
