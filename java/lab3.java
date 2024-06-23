import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    // Method to insert a node at the nth position
    public void insertNode(int data, int position) {
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            for (int i = 1; i < position - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Invalid position");
            } else {
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }
    }

    // Method to delete the first node
    public void deleteFirstNode() {
        if (head != null) {
            head = head.next;
        } else {
            System.out.println("List is empty.");
        }
    }

    // Method to replace the value of nth node with given value
    public void replaceNthNodeValue(int position, int value) {
        Node temp = head;
        for (int i = 1; i < position && temp != null; i++) {
            temp = temp.next;
        }
        if (temp != null) {
            temp.data = value;
        } else {
            System.out.println("Invalid position");
        }
    }

    // Method to display the linked list
    public void displayList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();

        while (true) {
            System.out.println("Menu:\n" +
                    "1. Create linked list by inserting values\n" +
                    "2. Insert node in nth position\n" +
                    "3. Delete the first node\n" +
                    "4. Replace the value of nth node with given value\n" +
                    "5. Display the list\n" +
                    "6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of values to insert: ");
                    int count = scanner.nextInt();
                    for (int i = 0; i < count; i++) {
                        System.out.print("Enter value " + (i + 1) + ": ");
                        int value = scanner.nextInt();
                        list.insertNode(value, i + 1);
                    }
                    break;
                case 2:
                    System.out.print("Enter the value to insert: ");
                    int value = scanner.nextInt();
                    System.out.print("Enter the position: ");
                    int position = scanner.nextInt();
                    list.insertNode(value, position);
                    break;
                case 3:
                    list.deleteFirstNode();
                    break;
                case 4:
                    System.out.print("Enter the position of the node: ");
                    int pos = scanner.nextInt();
                    System.out.print("Enter the new value: ");
                    int newValue = scanner.nextInt();
                    list.replaceNthNodeValue(pos, newValue);
                    break;
                case 5:
                    list.displayList();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}