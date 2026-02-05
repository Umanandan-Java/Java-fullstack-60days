abstract class Sample{
     abstract void ex();
    public void ex2(){
        System.out.println("This is Umanandan");
    }
}
class child extends Sample{
     void ex(){
        System.out.println("This is Sample Example");
    }
    
}

interface car{
    public void bmw();
    public void volvo();

}
class vehicle implements car{
    public void bmw(){
        System.out.println("Bmw");
    }
    public void volvo(){
        System.out.println("this is volovo");
    }
}
public class abstraction {
    public static void main(String[] args) {
        child c = new child();
    c.ex();

    vehicle v = new vehicle();
    v.bmw();

    }
    
    
}
