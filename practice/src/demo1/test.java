package demo1;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入数组长度：");
        n=scanner.nextInt();
        System.out.println("请依次输入数组的值：");
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }
        Sort.sort(arr);
        System.out.println(Arrays.toString(arr));
        int ret1=MaxOrMin.max(arr);
        int ret2=MaxOrMin.min(arr);
        System.out.println("max="+ret1);
        System.out.println("min="+ret2);
        Chengfabiao.biao();
        int ret3=Sum.sum(arr);
        System.out.println("sum="+ret3);
    }
}
