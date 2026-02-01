import java.util.*;
class first{
    public static void main(String[] args){
        System.out.println("Hello!!! World");
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter age:");
        a = sc.nextInt();
        sc.close();
        System.out.println("Your entered age is:"+a);
        if(a>=18){
            System.out.println("You are eligible!");
        }
        else{
            class1 c1 = new class1();
            c1.method_1();
        }
    }
}
class class1{
    public  void method_1(){
        System.out.println("This message is from method 1!!!\n You are not eligible");
    }
}