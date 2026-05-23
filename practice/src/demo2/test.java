package demo2;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Student student1=new Student(9,"zhangsan",99);
        Student student2=new Student(3,"lisi",90);
        Student student3=new Student(12,"wangwu",98);
        Student[] arr={student1,student2,student3};
        System.out.println(Arrays.toString(arr));
        for(Student s:arr){
            System.out.println(s);
        }
    }
}
