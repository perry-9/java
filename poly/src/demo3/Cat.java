package demo3;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }
    public void mimi(){
        System.out.println(name+"正在咪咪");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
