package demo9;

public class Bicycle extends Vehicle{
    public Bicycle(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void run() {
        System.out.println(brand+"自行车正在骑行");
    }
}
