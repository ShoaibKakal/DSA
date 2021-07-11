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

       while(current != null)
       {

            

            current = current.next;
       }
        
    }
}