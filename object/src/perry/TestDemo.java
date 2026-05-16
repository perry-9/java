package perry;

public class TestDemo {
    private int count;

    public TestDemo(int a) {
        count = a;
    }

    // 公开的 getter 方法：让外面能读取 count
    public int getCount() {
        return count;
    }

    // （可选）公开的 setter 方法：让外面能修改 count
    public void setCount(int count) {
        this.count = count;
    }
}
