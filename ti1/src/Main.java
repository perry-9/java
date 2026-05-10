import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main1(String[] args) {
        int a=0;
        for (int i = 1; i <= 100; i++) {
            if (i%10==9){
                a++;
            }
            if(i/10==9){
                a++;
            }
        }
        System.out.println(a);
    }

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        if (n<2){
            System.out.println("该数字不是素数");
            return;
        }
        int flag=1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0){
                flag=0;
                System.out.println("该数字不是素数");
                break;
            }
        }
        if (flag==1){
            System.out.println("该数字是素数");
        }
    }

    public static void main3(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n= scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int count=0;
            int j=1;
            while(j<=i){
                j*=10;
                count++;
            }
            int a=i%10;
            int b=i/10%10;
            int c=i/100%10;
            if ((Math.pow(a,count)+Math.pow(b,count)+Math.pow(c,count))==i){
                System.out.println(i);
            }
        }

    }

    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int i1 = 1; i1 <= n; i1++) {
                    if ((i1==i)||(i1==(n-i+1))){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main5(String[] args) {
        double sum=0;
        for (int i = 1; i < 100; i++) {
            sum+=Math.pow(-1,i+1)*(1.0/i);
        }
        System.out.println(sum);
    }

    public static void main6(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=1;
        while(c!=0){
            c=a%b;
            a=b;
            b=c;
        }
        System.out.println(a);
    }

    public static void main7(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int count=0;
        for (int i = 0; i < 32; i++) {
            if((n>>i&1)==1){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main8(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        System.out.println(str);
    }

    public static void main9(String[] args) {
        Random random=new Random();
        int n=random.nextInt(100);
        System.out.println(n);
    }
    public static double add(int a, int b) { return a+b; }
    public static void main10(String[] args) {
    int a=100;
    int b=200;
    double c=add(a,b);
        System.out.println(c);
    }

    public static void Print(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        Print(n-1);
        System.out.println(n);
    }
    public static void Print2(int n){
       if (n==0){
           return;
       }
       Print2(n/10);
        System.out.println(n%10);
    }
public static int Sum (int n){
    if (n==0){
        return 0;
    }
    else {
        return n+Sum(n-1);
    }
}
public static int sum2(int n){
        if (n==0){
            return 0;
        }
        return n%10+sum2(n/10);
}
public static int fib(int n){
        if(n==1||n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
}
public static int fib2(int n){
        int f1=1;
        int f2=1;
        int f3=0;
    for (int i = 3; i <=n; i++) {
        f3=f2+f1;
        f1=f2;
        f2=f3;
    }
    return f3;
}
    public static void main(String[] args) {
        int sum=fib(7);
        int sum2=fib2(7);
        System.out.println(sum);
        System.out.println(sum2);
    }
}
