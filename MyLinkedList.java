public class MyLinkedList {

    private MyListNode head; //Made the MyListNode class private
    private int studentCount = 0;
    public MyLinkedList()
    {
        head = null;
    }
    /**
     *
     *Shows data on the list
     */
    public void showList()
    {
        MyListNode next = head;
        while(next != null)
        {
        	String data = next.getData();
        	next = next.getLink();
        	if (next != null)
        	{
        		data += ",";
        	}
            System.out.println(data);
        }

    }
    /**
     *
     * Returns the number of nodes on the list
     */
    public int numberOfStudents(){
        //int count = 0;
        //MyListNode next = head;
        //while(next != null)
        //{
        //    count++;
        //    next = next.getLink();
        // }
        return  studentCount;
    }
    

    /**
     *
     * Adds a node to the linked list
     */
    public void addNode(String addData)
    {
    	studentCount++;
        head = new MyListNode(addData, head);
    }

    /**
     *
     * Deletes the first node on the linked list
     */
    public void deleteNode()
    {
        if(head != null)
        {
        	studentCount--;
            head = head.getLink();
        }
        else
        {
            System.out.println("Deleting from empty list.");
            System.exit(0);
        }
    }
    public static void main(String args[]) {

        System.out.println("Good morning class ");
        System.out.println("I am going to check attendance.");

        /**
         * A teacher is checking attendance.
         * Adding student first name and last name to linked list.
         *
         * The student names are listed this way so that they are called in alphabetical order.
         *
         */
        MyLinkedList list = new MyLinkedList();
        list.addNode("Lisa Williams");
        list.addNode("Amanda Roberts");
        list.addNode("Rick McNabb");
        list.addNode("Brian Linley");
        list.addNode("Zak Evans");
        list.addNode("Phylis Adeco");
        list.addNode("Mike D");
        System.out.println("There are " + list.numberOfStudents() + " students in the class."); //Gives you the length of the list
        System.out.println("The attendance is: ");
        //showList shows the student names in the class
        list.showList();
        System.out.println("But a student just called out sick. They have left the class for the day.");
        System.out.println("So I'm going to call attendance again.");
        //deleting student from the class.
        list.deleteNode();
        System.out.println("The new attendance is: ");

        //Shows the new attendance without the student. There are 5 students instead of 6 students.
        list.showList();
        System.out.println("There are " + list.numberOfStudents() + " students in the class.");
        System.out.println("\n"); //Uses the new line character and prints a blank space between students and "Let's Begin Class!"

        System.out.println("Let's begin class!"); //End of program.
    }

}
