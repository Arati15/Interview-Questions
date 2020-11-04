// function for data insert_at_end 

void insert_at_end (Node head, int data){

    Node temp = new Node (data);
    if (head == null)
    {
        head = temp;
        return;
    }

    else{
        Node q = head;

        while(q.next != null){
            q = q.next;
        }
        q.next = temp;
    }


}

//Time complexity = o(n)
    

