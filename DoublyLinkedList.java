class Node {

  Node prev;
  int data;
  Node next;

  Node(int d) {
    prev = null;
    data = d;
    next = null;
  }
}

public class DoublyLinkedList {

  Node head;

  public static void main(String[] args) {
    DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
    doublyLinkedList.add(10);
    doublyLinkedList.add(15);
    doublyLinkedList.add(86);

    doublyLinkedList.remove(10);
    doublyLinkedList.display();
  }

  void add(int data) {
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
    newNode.prev = current;
  }

  void display() {
    Node current = head;
    while (current != null) {
      System.out.print(current.data + " ");
      current = current.next;
    }
  }

  void remove(int data) {
    Node current = head;
    Node prev = head;

    if (current.data == data) {
      head = current.next;
      current.next.prev = null;
      return;
    }

    while (current != null) {
      if (current.data == data) {
        if (current.next != null) {
          prev.next = current.next;
          current.next.prev = prev;
          return;
        }
        prev.next = null;
        return;
      }
      prev = current;
      current = current.next;
    }
  }
}
