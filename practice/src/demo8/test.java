package demo8;

public class test {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("xiaohuang", "yellow");
        Dog dog3 = new Dog("xiaobai", "black");
        System.out.println(Dog.getCount());
    }
}
