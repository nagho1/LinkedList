public class MyListNode {
    /**
     * They say a linked list has nodes that are linked.
     *This is The MyListNode class and the beginning node and next node after that for the for the linked List
     * Will use MyListNode class in another class called MyLinkedList
     */
    private String data;
    private MyListNode link;

    public MyListNode()

    {
        link = null;
        data = null;
    }
    public MyListNode(String newData, MyListNode linkValue )
    {
        data = newData;
        link = linkValue;
    }

    public String getData()
    {

        return data;
    }

    public MyListNode  getLink(){
        return link;
    }
}
