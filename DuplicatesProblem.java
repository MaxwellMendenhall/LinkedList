/*
Given a sorted linked list, delete all nodes that have duplicate
numbers, leaving only distinct numbers from the original list.In this 
program, you need to 
(1) read 5 numbers and set them in a linkedlist in order
(2) delete duplicate

Example 1:
input: 1,2,3,3,5
output: head-->1-->2-->3-->5-->null

Example 2:
input: 1,1,1,2,3
output: head-->1-->2-->3-->null

Please complete the following program to fullfil the function.
*/
import java.util.Scanner;
public class DuplicatesProblem
{
   public static void main(String[] args)
   {
      //add your code here
     //add your code here
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter duplicate list");
	  
	  
	  LinkedList list1 = new LinkedList();
	  list1.head = new ListNode(s.nextInt());
	  list1.head.next = new ListNode(s.nextInt());
	  list1.head.next.next = new ListNode(s.nextInt());
	  list1.head.next.next.next = new ListNode(s.nextInt());
	  list1.head.next.next.next.next = new ListNode(s.nextInt());
	  
	  System.out.println("input: " + list1);
	  
	  deleteDuplicates(list1);
	  
	  System.out.println("output: " + list1);
   
   }
   public static void deleteDuplicates(LinkedList llist)
   {
      //add your code here
	   
	   //makes new LinkedList currentList and set llist to new LinkedList
	   LinkedList currentList = llist;
	   
	   //copies list head to new current List Node
	   ListNode curr = currentList.head;
	   
	   //starts the iteration as long as head is not null
	   while(curr != null) {
		   
		   //makes a temporary list node object that copies the curr
		   ListNode temp = curr;
		   
		   //iterates through the rest of the linked list until it finds to values that are the same 
		   while(temp != null && temp.value == curr.value) {
			   temp = temp.next;
		   }
		   curr.next = temp;
           curr = curr.next;
	   }
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
