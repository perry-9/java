package demo3;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    public void bark(){
        System.out.println(name+"正在汪汪叫");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
