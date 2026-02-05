class parent{
    void p(){
            System.out.println("This is parent method");
    }
}
class child extends parent{
    @Override
    void p(){
        System.out.println("This is child method");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        parent p = new child();
        p.p();
    }
}
