/*
In this program, you need to merge two sorted linked lists 
and return it as a new list. The new list should be made by
splicing together the nodes of the first two lists.

Example 1:
input:1->2->4, 1->3->4
output:head-->1-->1-->2-->3-->4-->4-->null

Please complete the following program to fullfil the function.
*/
import java.util.*;
public class MergeProblem
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      //first list
      System.out.println("First list");
      LinkedList llist1 = new LinkedList();
      llist1.head = new ListNode(input.nextInt());
      llist1.head.next = new ListNode(input.nextInt());
      llist1.head.next.next = new ListNode(input.nextInt());
      //second list
      System.out.println("Second list");
      LinkedList llist2 = new LinkedList();
      llist2.head = new ListNode(input.nextInt());
      llist2.head.next = new ListNode(input.nextInt());
      llist2.head.next.next = new ListNode(input.nextInt());
      
      LinkedList sortedList = new LinkedList();
      sortedList.head = mergeTwoLists(llist1,llist2);
      System.out.println(sortedList);
   }
   public static ListNode mergeTwoLists(LinkedList llist1, LinkedList llist2)
   {
      ListNode currNode1 = llist1.head;	   
	   ListNode currNode2 = llist2.head;
	   
	   /*
	    * dummy node to hold the results of the lists
	    * dummy node is allocated in the stack and is efficient 
	    * Because it is only temporary
	    */
	   ListNode dummyNode = new ListNode(0);
	   
	   //Temporary ListNode that copies dummyNode 
	   ListNode tail = dummyNode;
	   
	   while(true) {
		   /*
		    * If one list runs out and becomes empty
		    * sets the tail of the dummyNode to 
		    * the other list
		    */
		   if(currNode1 == null) {
			   tail.next = currNode2;
			   break;
		   }
		   if(currNode2 == null) {
			   tail.next = currNode1;
			   break;
		   }
		   /*
		    * Compares the values of nodes of the lists, and whatever list 
		    * has a smaller value add it to dummyNode tail and continue
		    * to the next node in the lists 
		    */
		   if(currNode1.value <= currNode2.value ) {
			   tail.next = currNode1;
			   currNode1 = currNode1.next;
		   }else {
			   tail.next = currNode2;
			   currNode2 = currNode2.next;
		   }
		   //advances tail through the nodes
		   tail = tail.next;
	   }
	   
	   
	   return dummyNode.next;
   }

}
class ListNode
{
   int value;
   ListNode next;
   ListNode(int v){value = v;}
}
class LinkedList
{
   ListNode head;
   public String toString()
   {
      String nodeData = "";
      ListNode ref = head;
      while(ref != null)
      {
         nodeData += ref.value + "-->";
         ref = ref.next;
      }
      return "head-->"+nodeData+"null";
   }
}
