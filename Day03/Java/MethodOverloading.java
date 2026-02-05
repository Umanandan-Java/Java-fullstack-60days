class measurement{
    void box(int l,int b){
        System.out.println("Length X Breadth:"+l*b);
    }
    void box(int l, int b, int h){
        System.out.println("cuboid= length X Breadth X Height:"+ (l*b*h));
    }
}
public class MethodOverloading{
    public static void main(String[] args){
        measurement m = new measurement();
        m.box(2,3,4);
        m.box(1,2);
    }
}