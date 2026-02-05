import java.util.LinkedList;
import java.util.Scanner;
public class traverse {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        
            for(int i=0;i<5;i++){
                
                ll.add(sc.next());
            }
            sc.close();
            System.out.println("After taking the input:"+ll);

            for(int i=0; i<5;i++){
                System.out.println(ll.get(i));
                
            }
    }

    
}
