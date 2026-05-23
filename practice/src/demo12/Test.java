package demo12;

class B {
    public B() {
        func();   // 构造方法中调用了可重写的方法
    }
    public void func() {
        System.out.println("B.func()");
    }
}

class D extends B {
    private int num = 1;
    @Override
    public void func() {
        System.out.println("D.func() " + num);
    }
}

public class Test {
    public static void main(String[] args) {
        D d = new D();
    }
}
