public class SLL
{
    private Node head;
    private Node tail;
    private int size;

    public SLL()
    {
        this.size = 0;
    }

    public void insertFirst(int val)
    {
        Node node = new Node(val); //Create a new Node at the start
        node.next = head; // Creating connection between new node and existing first node
        head = node; // Assign head = new node we created ie the new first value

        if(tail == null)
        {
            tail = head; // Tail and head will have the same value if its the first value being added i.e tail == null
        } 
        size += 1;
    }

    public void insertEnd(int val)
    {
        if(tail == null)
        {
            insertFirst(val);
            return;
        }
        Node node = new Node(val); // Same logic as insertFirst 
        tail.next = node;
        tail = node;
        size++;
    }

    public void indexInsert(int val, int index)
    {
        if(index == 0)
        {
            insertFirst(val);
            return;
        }
        if(index == size)
        {
            insertEnd(val);
            return;
        }

        Node temp = head;
        for(int i = 1; i < index; i++)
        {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next); 
        temp.next = node;
        size++;    
    }

    public int deleteFirst()
    {
        int val = head.value;
        head = head.next;
        if(head == null)
        {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast()
    {
        if(size <= 1)
        {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public Node get(int index)
    {
        Node node = head;
        for(int i = 0 ;i < index; i++)
        {
            node = node.next;
        }
        return node;
    }

    public void display()
    {
        Node temp = head;
        while(temp != null) // If temp is not null we print the temp value and then push it to the next value
        {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");  
    }
    
    
    private class Node
    {
        private int value;
        private Node next;

        public Node(int value) 
        {
            this.value = value;
        }

        public Node(int value, Node next)
        {
            this.value = value;
            this.next = next;
        }
    }
}

