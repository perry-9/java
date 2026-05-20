package demo2;

import jdk.jshell.Snippet;

public class test {
    public static void main(String[] args) {
//        Shape shape1=new Circle();
//        Shape shape2=new Sanjiao();
//        Shape shape3 =new Juxing();
//        shape1.draw();
//        shape2.draw();
//        shape3.draw();
        Circle circle=new Circle();
        Sanjiao sanjiao=new Sanjiao();
        Juxing juxing=new Juxing();
        Shape[] shapes={circle,circle, sanjiao,juxing};
        for(Shape shape:shapes){
            shape.draw();
        }
    }

}
