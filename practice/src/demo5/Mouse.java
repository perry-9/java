package demo5;

public class Mouse implements USB {
    @Override
    public void start() {
        System.out.println("开始使用Mouse");
    }

    @Override
    public void stop() {
        System.out.println("停止使用Mouse");
    }
}
