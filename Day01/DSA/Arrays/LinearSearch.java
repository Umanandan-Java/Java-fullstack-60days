import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={12,13,16,75,56};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter search element:");
        int search = sc.nextInt();
        for(int a: arr){
            if(a == search){
            System.out.println("Element found");
            }
        }

    }
}
