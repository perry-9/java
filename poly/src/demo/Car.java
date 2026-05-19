package demo;

// 汽车类，组合了 Engine 和 Tire
class Car {
    private Engine engine;
    private Tire tire;

    // 初始化组件
    public Car() {
        this.engine = new Engine();
        this.tire = new Tire();
    }

    // 通过成员对象调用功能
    public void drive() {
        engine.start();
        tire.roll();
    }
}
