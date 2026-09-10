
package linkedlist;

public class InsertAtBeginning {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;

    // Insert at beginning
    void insertAtBeginning(int data) {

        // Create a new node
        Node newNode = new Node(data);

        // Connect new node to current head
        newNode.next = head;

        // Make new node the new head
        head = newNode;
    }

    // Display linked list
    void display() {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        InsertAtBeginning list = new InsertAtBeginning();

        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);
        list.insertAtBeginning(5);

        list.display();
    }
}

