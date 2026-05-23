package demo9;

public class Car extends Vehicle{
    public int oilMass;

    public Car(String brand, int speed, int oilMass) {
        super(brand, speed);
        this.oilMass = oilMass;
    }

    @Override
    public void run() {
        System.out.println(brand+"汽车正在行驶");
    }
}
