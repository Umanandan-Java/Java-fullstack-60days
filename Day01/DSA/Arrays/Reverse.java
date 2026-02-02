import java.util.Scanner;
import java.util.Arrays;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter "+arr.length+" elements into the array: ");
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(reverse(arr)));
    }
    static int[] reverse(int a[]){
        int start=0;
        int end=a.length-1;
        for(int i = start; i<end;i++){
            swap(a, start,end);
            start++;
            end--;
        }
        return a;
    }
    private static void swap(int[] a, int start, int end) {
        int temp = a[start];
        a[start]=a[end];
        a[end]=temp;
    }
    
}
