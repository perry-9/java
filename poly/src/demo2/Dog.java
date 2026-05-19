package demo2;



public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    public void bark() {
        System.out.println(this.name +" 正在汪汪汪叫.....");
    }

    public void eat() {
        System.out.println(this.name +" 正在吃狗粮....");
    }
}

