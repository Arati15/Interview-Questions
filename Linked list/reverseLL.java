//reverse linked list

Node reverseList (Node head)
{
    Node temp = head;
    Node prev = null;
    Node curr = head;

    while (curr != null)
    {
        temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;
    }
    return prev;
}

//Time complexity = o(n)