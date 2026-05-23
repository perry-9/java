package demo13;

public class Circle extends Shape{
    int r;
    private double ti=3.14159;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    void area() {
        System.out.println(ti*r*r);
    }
}
