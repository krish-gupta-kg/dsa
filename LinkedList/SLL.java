import java.util.LinkedList;

public class SLL{

    private Node head;
    private Node tail;

    private int size;

    public SLL()
    {
        this.size = 0;
    }

    public void insertAtFirst(int val)
    {
        Node node = new Node(val); // Creates a new data entry
        node.next = head;
        head = node;

        if(tail == null)
        {
            tail = head;
        }
        size += 1;
    }

    public Node display()
    {
        
    }


    private class Node
    {
        private int value;
        private Node next;
        private Node node;

        public Node(int value)
        {
            this.value = value;
        }
    }
}