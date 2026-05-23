package demo13;

public class Test {
    public static void sum(Shape shape){
        shape.area();
    }
    public static void main(String[] args) {
        Circle circle=new Circle(4);
        Rectangle rectangle=new Rectangle(4,5);
        Shape[] arr={circle,rectangle};
        for(Shape x:arr){
            sum(x);
        }
    }
}
