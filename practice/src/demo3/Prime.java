package demo3;

public class Prime {
    public static void isPrime(int n) {
        if (n <= 2) {
            System.out.println("该数字不是素数");
        } else if (n==2) {
            System.out.println("该数字是素数");
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    System.out.println("该数字不是素数");
                    return;
                }
            }
            System.out.println("该数字是素数");
        }
    }
}
