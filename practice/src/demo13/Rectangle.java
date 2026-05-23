package demo13;

public class Rectangle extends Shape{
    public int length;
    public int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void area() {
        System.out.println(length*width);
    }
}
