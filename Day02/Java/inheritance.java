class p{
    void m1(){
        System.out.println("This is parent class method 1");
    }
}
class c extends p{
    void m2(){
        System.out.println("This is child class method");
    }
}

class inheritance{
    public static void main(String[] args){
        System.out.println("Hello this is Umanandan learning inheritance topic");
        c c = new c();
        c.m1();
        c.m2();
    }
}