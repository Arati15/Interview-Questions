//function for insert at randon data

void insertAtRandom (Node head, int data, int pos)
{
    Node temp = new Node (data);

    if(head == null){
        head = temp;
        return;
    }
    else{
        int count = 1;
        while (count < pos)
        {
            q = q.next;
            count ++;
        }
        temp.next = q.next;
        q.next = temp;
    }

}

// Time complexity = o(n)