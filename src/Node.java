public class Node
{
    int data;
    Node next;

    public Node (int data)
    {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString()
    {
        StringBuilder result = new StringBuilder();
        Node current = this;
        while (current != null)
        {
            result.append(current.data).append(" -> ");
            current = current.next;
        }
        result.append("null");
        return result.toString();
    }

}
