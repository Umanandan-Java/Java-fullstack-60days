import java.util.LinkedList;
public class remove {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Apple");
        ll.add("Bananan");
        ll.add("Carrot");
        ll.add("Sample");
        System.out.println("Initial Linkedlist:"+ll);
        ll.remove(3);
        ll.remove("Bananan");
        ll.addFirst("Meaning");
        System.out.println("In between LinkedList"+ ll);
        ll.removeFirst();
        System.out.println("After removal Linkedlist:"+ll);
    }
}
