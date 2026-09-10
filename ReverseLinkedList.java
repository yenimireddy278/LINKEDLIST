
package linkedlist;

public class ReverseLinkedList {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    // Insert at end
    void insertAtEnd(int data) {

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

    // Reverse linked list
    void reverse() {

        Node previous = null;
        Node current = head;

        while (current != null) {

            Node next = current.next;

            current.next = previous;

            previous = current;
            current = next;
        }

        head = previous;
    }

    // Display
    void display() {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        ReverseLinkedList list = new ReverseLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        System.out.println("Before reverse:");
        list.display();

        list.reverse();

        System.out.println("After reverse:");
        list.display();
    }
}

