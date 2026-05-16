package perry;
import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////        while (scanner.hasNextInt()) {
////            int x = scanner.nextInt();
////            int y = scanner.nextInt();
////            Data data = new Data(x, y);
////            System.out.println(data.getX() + data.getY());
////        }
//        petdog dog = new petdog();
//        petdog.name="马卡龙";
//        dog.age=22;
//        dog.color="yellow";
//        dog.barks();
//        dog.barks2();
//    }
//
//}
//
public class Main {
    public static void main(String[] args) {
        TestDemo test = new TestDemo(88);
        System.out.println(test.getCount()); // ✅ 正确，通过公开方法读取
        test.setCount(99); // ✅ 正确，通过公开方法修改
        System.out.println(test.getCount()); // 输出 99
    }
}
