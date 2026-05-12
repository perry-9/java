import java.util.Arrays;

public class Main {
    public static void mytostring(int[] array){
        System.out.print("[");
        for (int i = 0; i <array.length ; i++) {
            if (i==array.length-1){
                System.out.print(array[i]);
            }
            else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("]");
    }
    public static String mytostring2(int[]array){
        String a="[";
        for (int i = 0; i < array.length; i++) {
            a+=array[i];
            if (i== array.length-1){
               a+="]";
            }
            else {
                a+=", ";
            }
        }
        return a;
    }
    public static double avg(int[] array){
        double sum=0;
        for(int i:array){
            sum+=i;
        }
        return sum/array.length;
    }
    public static int find (int[] array,int data){
        for (int i = 0; i <array.length; i++) {
            if(data==array[i]){
                return i;
            }
        }
        return -1;
    }
    public static int find2 (int[] array,int data){
        int left=0;
        int right=array.length-1;
        int mid = 0;
        while(left<=right) {
            mid=left+(right-left)/2;
            if (data<array[mid]){
                right=mid-1;
            } else if (data>array[mid]) {
                left=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void bubblesort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j =0; j < array.length-1-i; j++) {

            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,321,242,42,42,532,36,21,35,24};
        int[] arr2={1,2,3,4,5,6,7,8,9,10};
        int ret1=find(arr,321);
        if(ret1!=-1){
            System.out.println(ret1);
        }
        else{
            System.out.println("没找到");
        }
        int ret2=find(arr,11);
        if(ret2!=-1){
            System.out.println(ret2);
        }
        else{
            System.out.println("没找到");
        }
        int ret3=find2(arr2,123);
        if(ret3!=-1){
            System.out.println(ret3);
        }
        else{
            System.out.println("没找到");
        }int ret4=find2(arr2,5);
        if(ret4!=-1){
            System.out.println(ret4);
        }
        else{
            System.out.println("没找到");
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int ret5=find2(arr,321);
        if(ret1!=-1){
            System.out.println(ret5);
        }
        else{
            System.out.println("没找到");
        }
        int ret6=find(arr,11);
        if(ret2!=-1){
            System.out.println(ret6);
        }
        else{
            System.out.println("没找到");
        }
        int num=Arrays.binarySearch(arr,321);
        if(num>=0){
            System.out.println(num);
        }
        else{
            System.out.println("没找到");
        }int num2=Arrays.binarySearch(arr,999);
        if(num2>=0){
            System.out.println(num2);
        }
        else{
            System.out.println("没找到");
        }
        boolean o=Arrays.equals(arr,arr2);
        System.out.println(o);
    }
    public static void main3(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        double ret=avg(arr);
        System.out.println(ret);
    }
    public static void main2(String[] args) {
        int[] arr={1,2,3,4};
        String a=Arrays.toString(arr);
        System.out.println(a);
        mytostring(arr);
        String c=mytostring2(arr);
        System.out.println(c);
    }
    public static void main1(String[] args) {
//        int[] arr={1,2,3,4,5};
//        int[] arr2=new int[]{1,2,3,4,5};
//        int[] arr3=new int [5];
//        arr3[0]=1;
//        int [] arr4;
//        arr4 =new int[100];

        int[] arr={12,3,45,43};
        int[] arr2=new int[]{1,2,3,53,5};
        int[] arr3=new int[2421];
        int[] arr4;
        arr4=new int[24];
        System.out.println(Arrays.toString(arr));
    }
}





