//function for traverse linked list and find length

//Time complexity = o(n)

class LinkedList {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    void traverse(Node head) {
        Node q = head;
        int count = 0;

        while (q != null) {
            System.out.println(q.data);
            count++;
            q = q.next;

        }

        System.out.print(count);
    }
}
