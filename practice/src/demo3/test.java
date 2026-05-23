package demo3;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//            int n = scanner.nextInt();
//            Prime.isPrime(n);
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入数组的长度：");
        int n=scanner.nextInt();
        System.out.println("依次输入数组的元素：");
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=scanner.nextInt();
        }
        int sum=Sum.getsum(arr);
        System.out.println(sum);
        Print.print(arr);
    }
}
