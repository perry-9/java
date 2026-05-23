package demo5;

public class Keyboard implements USB{
    @Override
    public void start() {
        System.out.println("开始使用Keyboard");
    }

    @Override
    public void stop() {
        System.out.println("结束使用Keyboard");
    }
}
