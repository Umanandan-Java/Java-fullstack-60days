import java.util.Scanner;
import java.util.Arrays;
public class MaxMin {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array:"+Arrays.toString(arr));
        System.out.println("Maximum Element in the array is:"+max(arr));
        System.out.println("Minimum Element in the array is:"+min(arr));

    }
    static int max(int arr[]){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    static int min(int arr[]){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
