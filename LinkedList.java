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

    // Insert at the end
    public void insertAtEnd(int data) {
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

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert after a given node
    public void insertAfterNode(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    // Delete by key
    public void deleteNode(int key) {
        Node temp = head, prev = null;

        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) return;

        prev.next = temp.next;
    }

    // Delete at position
    public void deleteNodeAtPosition(int position) {
        if (head == null) return;
        Node temp = head;
        if (position == 0) {
            head = temp.next;
            return;
        }
        for (int i = 0; temp != null && i  < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) return;

        Node next = temp.next.next ;
        temp.next = next;
    }
    // Print the list
    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList(); 
        
        llist.insertAtEnd(1);
        llist.insertAtEnd(2);
        llist.insertAtEnd(3);
        llist.insertAtBeginning(0);
        llist.insertAfterNode(llist.head.next, 1);
        
        llist.printList();  

        llist.deleteNode(1);
        llist.printList();  

        llist.deleteNodeAtPosition(0);
        llist.printList();  
    }
}
