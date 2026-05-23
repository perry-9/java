package demo9;

public class Vehicle {
    public String brand;
    public int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void run(){
        System.out.println(brand+"正在行驶");
    }
}
