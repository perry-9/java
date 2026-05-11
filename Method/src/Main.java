import java.util.Scanner;

public class Main {
public static int max2(int a,int b){
    return a>b?a:b;
}
public static int max3(int a,int b,int c){
    int d=max2(a,b);
    return d>c?d:c;
}

public static double add(double a,double b,double c){
    return a+b+c;
}
public static int add(int a,int b){
    return a+b;
}

public static int max(int a,int b){
    return a>b?a:b;
}
public static double max(double a,double b,double c){
        return a>c?a:b>c?b:c;
}

public static int hannuota(int num){
    if (num==0){
        return 0;
    }
    return 2*hannuota(num-1)+1;
}
    public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    int n=scanner.nextInt();
    int ret=hannuota(n);
        System.out.println(ret);
    }

    public static void main3(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        double c=scanner.nextDouble();
        double d=scanner.nextDouble();
        double e=scanner.nextDouble();
        int ret1=max(a,b);
        double ret2=max(c,d,e);
        System.out.println(ret1);
        System.out.println(ret2);
    }
    public static void main2(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        double c=scanner.nextDouble();
        double d=scanner.nextDouble();
        double e=scanner.nextDouble();
        int ret1=add(a,b);
        double ret2=add(c,d,e);
        System.out.println(ret1);
        System.out.println(ret2);
    }
    public static void main1(String[] args) {
        Scanner sca=new Scanner(System.in);
        int a=sca.nextInt();
        int b=sca.nextInt();
        int c=sca.nextInt();
        int ret =max3(a,b,c);
        System.out.println(ret);
    }


}
