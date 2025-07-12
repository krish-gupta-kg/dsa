public class DLL
{
    private class Node{
        int val;
        Node prev;
        Node next;

        public Node(int val)
        {
            this.val = val;
        }
        public Node(int val, Node prev, Node next)
        {
            this.val =  val;
            this.prev =  prev;
            this.next =  next;
        }
    }

    private Node head;
    public void insertFirst(int val)
    {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null) // To prevent null pointer exeception incase head is 0
        {
            head.prev = node;
        }
        head = node;
    }

    public void display()
    {
        Node node = head;
        Node last = null;
        while(node != null)
        {
            System.out.print(node.val + " -> " );
            last = node;
            node = node.next;
        }
        System.out.println("END");
        
        System.out.println("Printing in reverse");
        
        while(last != null)
        {
            System.out.print(last.val + " -> ");
            last =last.prev;
        }
        System.out.println("START");
    }

    

}