package demo3;

public class Sum {
    public static int getsum(int[] arr){
        int sum=0;
        for(int x:arr){
            sum+=x;
        }
        return sum;
    }
}
