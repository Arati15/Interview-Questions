

// insert_at_start 

//fuction insert data at first 

//Time complexity = o(n)
    void start (Node head){
        Node temp = new Node(data);

        if (head == null)
        {
            head = temp;
            return;
        }
        else{
            temp.next = head;
            head = temp;
        }

    }
    

