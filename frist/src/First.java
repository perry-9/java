import java.util.Scanner;

public class First {
    public static void main(String[] args) {
//        int a=10;
//        int b=20;
//        System.out.println((a>b)&(a<0));
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        while (i <= n) {
            if (i % 15==0) {
                System.out.println(i);
            }
            i++;
        }

    }

}
