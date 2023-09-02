public class Ani2_LinkedList {
    
    class Node{
        String data;
        Node next;
        
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void addFirst(String data){
        Node newNode = new Node(data);
        
        if(head == null)
        {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        Node currentNode = head;
        
        if(head == null)
        {
            head = newNode;
            return;
        }

        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void deleteFirst(){
        //Node currentNode = head;
        if(head == null)
        {
            System.out.println("Empty list");
            return;
        }
        head = head.next;
    }

    public void deleteLast(){
        Node lastNode = head.next;
        Node secondlast = head;
        if(head == null)
        {
            System.out.println("Empty list");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        while(lastNode.next != null)
        {
            lastNode = lastNode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }

    public void traverse(){
        Node currentNode = head;
        while(currentNode!= null){
            System.out.print(currentNode.data+"->");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Ani2_LinkedList ll = new Ani2_LinkedList();

        ll.addFirst("Anindya");
        ll.addFirst("I'm");
        ll.traverse();
        ll.addLast("wassup?");
        ll.traverse();
        ll.deleteLast();
        ll.traverse();
        ll.deleteFirst();
    }
}
