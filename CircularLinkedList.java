class Node{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList{

    Node head;
    Node tail;

    public static void main(String[] args)
    {
        CircularLinkedList circularLinkedList = new CircularLinkedList();

        circularLinkedList.add(10); 
        circularLinkedList.add(5); 
        circularLinkedList.add(8); 

        circularLinkedList.display();
    }

    void add(int data)
    {
        Node newNode = new Node(data);
        Node current = head;
        
        if(head == null)
        {
            head = newNode;
            tail = newNode;
            newNode.next = tail;
            return;
        }

       while(true)
       {

            if(current==tail)
            {
                current.next = newNode;
                newNode.next = head;
                tail = newNode;
                return;
            }
            current = current.next;
       }
        
    }

    void display()
    {
        Node current = head;


        while(current!=tail)
        {
            System.out.print(current.data + " ");        
            current = current.next; 
        }
        System.out.print(current.data + " ");

    }
}