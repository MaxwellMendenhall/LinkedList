/*
Given a linked list, remove the n-th node from the end of the list
and return its head. In this program, you need to 
(1) read 6 numbers, add the first 5 numbers in the linkedlist
the last one is the index of the element that you need to remove
(2) display the new linkedlist after removal

Example 1:
input:1,2,3,4,5,2
output:head-->1-->2-->3-->5-->null
Explanation: The original linkedlist is 1-->2-->3-->4-->5.
The second node from the end is 4.
After removing the second node from the end, the 
linkedlist is 1->2->3->5 

Please complete the following program to fullfil the function.
*/
import java.util.*;
public class IndexRemoveProblem
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
	  System.out.println("Enter list, last number is the position you want removed");
		  
      LinkedList removal = new LinkedList();
      removal.head = new ListNode(s.nextInt());
      removal.head.next = new ListNode(s.nextInt());
      removal.head.next.next = new ListNode(s.nextInt());
      removal.head.next.next.next = new ListNode(s.nextInt());
      removal.head.next.next.next.next = new ListNode(s.nextInt());
      int position = s.nextInt();
      
      System.out.println(removal);
      
      removeNthFromEnd(removal, position);
      
      System.out.println(removal);
   }
   public static void removeNthFromEnd(LinkedList llist, int n)
   {
      ListNode first = llist.head;
	   ListNode second = llist.head;
	   
	   ListNode removeHead = llist.head;
	   
	   for(int i = 0; i < n; i++) {	
		   /*
		    * See's if the end of the LinkedList has been reached
		    */
		   if(second.next == null) {
			   /*
			    * If the end of the LinkedList has been reached, see's if 
			    * the for loop is equal to the Nth node passed in
			    * 
			    * If it is equal remove the head of the LinkedList
			    */
			   if(i == n - 1) {
				   	llist.head = removeHead.next;
				   	return;
					}
			   }
		   second = second.next; //allows the list to move forward every time the for loop does a cycle 
		   }
	   while(second.next != null) {
		   first = first.next;
		   second = second.next;
	   }
	   first.next = first.next.next;
	   
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
