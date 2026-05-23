package demo5;

public class test {
    public static void main(String[] args) {
        Mouse mouse =new Mouse();
        Keyboard keyboard =new Keyboard();
        Computer computer=new Computer();
        computer.useUSB(mouse);
        computer.useUSB(keyboard);
    }
}
