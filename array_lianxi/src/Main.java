import java.util.Arrays;

public class Main {
    public static void transform (int[] array){
        for (int i = 0; i <array.length ; i++) {
            array[i]=array[i]*2;
        }
    }
    public static void sort(int[] array){
        int left=0;
        int right=array.length-1;
       while(left<right){
           while(left<right){
               if (array[left]%2==0){
                   break;
               }
               left++;
           }
           while(left<right){
               if(array[right]%2==1){
                   break;
               }
               right--;
           }
           int temp=0;
           temp=array[left];
           array[left]=array[right];
           array[right]=temp;
       }
    }
    public static int my_dinarysearch(int[] arr,int data){
        int left =0;
        int right=arr.length-1;
        int mid=0;
        while(left<=right){
            mid=(left+right)/2;
            if(data>arr[mid]){
                left=mid+1;
            } else if (data<arr[mid]) {
                right=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void bubble (int[] array){
        for (int i = 0; i < array.length-1; i++) {
            int flg=0;
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flg=1;
                }
            }
            if(flg==0){
                break;
            }
        }
    }
    public static String add_puls(int[] arr,int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length - 1; j++) {
                if (arr[i] + arr[j] == target)  {
                    String a="["+i+","+j+"]";
                    return a;
                }
            }
        }
        return "没有找到";
    }
    public static int one (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int j=0;
            int count=0;
            while(j<arr.length){
               if (arr[i]==arr[j]){
                   count++;
                }
               j++;
            }
            if (count==1){
                return arr[i];
            }
        }
        return -1;
    }
    public static int one2(int[] arr){
        int a=0;
        for(int num:arr) a^=num;
        return a;
    }
    public static int duoshu (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int j=0;
            int count=0;
            while(j<arr.length){
                if (arr[i]==arr[j]){
                    count++;
                }
                j++;
            }
            if (count>arr.length/2){
                return arr[i];
            }
        }
        return -1;
    }
    public static boolean lianxuji(int[] arr){
        for (int i = 0; i < arr.length-2; i++) {
            if (arr[i]%2==1&&arr[i+1]%2==1&&arr[i+2]%2==1){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1={2,6,4,1};
        int[] arr2={1,2,34,3,4,5,7,23,12};
        System.out.println(lianxuji(arr1));
        System.out.println(lianxuji(arr2));
    }

    public static void main7(String[] args) {
        int[] arr1={3,2,3};
        int[] arr2={2,2,1,1,1,2,2};
        System.out.println(duoshu(arr1));
        System.out.println(duoshu(arr2));
    }
    public static void main6(String[] args) {
        int[] arr1={2,2,1};
        int[] arr2={4,1,2,1,2};
        int ret1=one(arr1);
        if (ret1==-1){
            System.out.println("没找到");
        }
        else {
            System.out.println(ret1);
        }
        int ret2=one(arr2);
        if (ret2==-1){
            System.out.println("没找到");
        }
        else {
            System.out.println(ret2);
        }
        System.out.println(one2(arr1));
        System.out.println(one2(arr2));
    }
    public static void main5(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        String ret =add_puls(arr,10);
        System.out.println(ret);
    }
    public static void main4(String[] args) {
        int[] arr={2,21,31,12,412,532,5,539,2580,825,35,53,21,53,256,12};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void main3(String[] args) {
        int[] arr={2,4,6,7,8,9,12,35,75,87,98,102};
        int ret1=my_dinarysearch(arr,55);
        if (ret1!=-1){
            System.out.println(ret1);
        }
        else {
            System.out.println("没找到");
        }
        int ret2=my_dinarysearch(arr,75);
        if (ret2!=-1){
            System.out.println(ret2);
        }
        else {
            System.out.println("没找到");
        }
    }
    public static void main2(String[] args) {
        int[] arr={1,2,3,4,5,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void main1(String[] args){
        int[] arr={1,2,3};
        transform(arr);
        System.out.println(Arrays.toString(arr));
    }
}