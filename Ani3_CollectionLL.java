import java.util.*;

public class Ani3_CollectionLL {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.addFirst("World");
        ll.addFirst("Helloooo");
        ll.addLast("Ani here");
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        for(int i=0; i<ll.size(); i++)
        {
            System.out.print(ll.get(i)+"->");
        }
        System.out.println("NULL");
    }
}
