package demo8;

public class Dog {
    public String name;
    public String color;
    private static int count=0;
    public Dog(){
        count++;
    }
    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
