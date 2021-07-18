import javax.xml.namespace.QName;

public class PreviewCodePilot {

    // Created By Shoaib on 17/07/2021
    
    public static void main(String[] args) {


    }


    //insert into linked list
    public static void insert(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    //delete from linked list
    public static void delete(Node head, int data) {
        Node current = head;
        if (current.data == data) {
            head = current.next;
            return;
        }
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
    //search in linked list
    public static boolean search(Node head, int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;

            }
            current = current.next;
        }
        return false;
    }
    //print linked list
    // this is crazy huhuhu :)))
}

