public class LinkedListCreator
{
    Node head;

    public void add(int data)
    {
        Node newNode = new Node(data);
        if (head == null)
        {
            head = newNode;
        } else
        {
            Node current = head;
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void changeLastNodeValue()
    {
        if(head == null)
        {
            System.out.println("list is empty");
            return;
        }

        Node current = head;
        while(current.next != null)
        {
            current = current.next;
        }
        current.data = 42;
    }

    public void updateAllNodes()
    {
        Node current = head;
        while (current != null)
        {
            current.data = 42;
            current = current.next;

        }
    }

    public int min()
    {
        if(head == null)
        {
            throw new IllegalStateException("List is empty");
        }

        int min = head.data;
        Node current = head.next;

        while(current != null)
        {
            if (current.data < min)
            {
                min = current.data;
            }
            current = current.next;
        }
        return min;
    }


    public int max()
    {
        if(head == null)
        {
            throw new IllegalStateException("List is empty");
        }

        int max = head.data;
        Node current = head.next;

        while(current != null)
        {
            if (current.data > max)
            {
                max = current.data;
            }
            current = current.next;
        }
        return max;
    }








        @Override
    public String toString()
    {
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null)
        {
            result.append(current.data).append(" -> ");
            current = current.next;
        }
        result.append("null");
        return result.toString();
    }

}
