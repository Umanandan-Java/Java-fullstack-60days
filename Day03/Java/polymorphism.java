
class parent{
    void role(){
        System.out.println("Parent Mode");
    }
}
class child extends parent{
    void role(){
        System.out.println("Child mode");
    }
}
public class polymorphism {
        public static void main(String[] args) {
            child p = new child();
            p.role();
        }
}
