import java.util.LinkedList;
class insert{
    public static void main(String[] args){
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Apple");
        ll.add("Banana");
        ll.add("Carrot");
        ll.add("PineApple");
        ll.add(2,"Mango");
        System.out.println(ll);
    }
}