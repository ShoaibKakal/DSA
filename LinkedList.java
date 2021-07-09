class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class LinkedList {

    static Node head;

    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();
        int ar[] = { 1, 3, 5, 7, 2 };

        for (int i = 0; i < ar.length; i++) {
            linkedlist.add(ar[i]);
        }
        linkedlist.add(32);
        linkedlist.remove(3);
        linkedlist.removeAtIndex(1);
        linkedlist.addFirst(20);
        linkedlist.print();
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void remove(int data) {
        Node current = head;
        Node prev = head;
        while (current != null) {
            if (current.data == data) {
                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public void addAtIndex(int index, int data) {
        int counter = 0;
        Node current = head;
        Node prev = head;
        Node newNode = new Node(data);
        while (current != null) {
            if (index == counter && index > 0) {
                prev.next = newNode;
                newNode.next = current;
                return;
            } else if (index == 0) {
                newNode.next = current;
                head = newNode;
                return;
            }

            counter++;
            prev = current;
            current = current.next;

        }
    }

    public void removeAtIndex(int index) {
        int counter = 0;
        Node current = head;
        Node prev = head;

        while (current != null) {
            if (index == 0) {
                head = current.next;
                return;
            } else if (index == counter) {
                prev.next = current.next;
                return;
            }

            prev = current;
            current = current.next;
            counter++;
        }

    }

    public void addFirst(int data)
    {
       
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
            return;
        }
        
        newNode.next = head;
        head = newNode;
    }
    public void addAll(int array[]) {
        Node newNode = new Node(array[0]);
        head = newNode;
        Node last = head;
        for (int i = 1; i < array.length; i++) {
            newNode = new Node(array[i]);
            last.next = newNode;
            last = newNode;
        }
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

}