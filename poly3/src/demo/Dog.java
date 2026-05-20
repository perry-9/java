package demo;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }
    public void eat(){
        System.out.println(name+"吃狗粮");
    }
}
