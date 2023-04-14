/*
Given a linked list, remove all elements from a linkedlist of 
integers that have value val. In this program, you need to 
(1) read 6 numbers, add the first 5 numbers in the linkedlist
the last one is the value of the element that you need to remove
(2) display the new linkedlist after removal

Example 1:
input:1,2,3,4,5,2
output:head-->1-->3-->4-->5-->null
Explanation: The original linkedlist is 1-->2-->3-->4-->5.
The value to remove is 2.
After removing all the nodes that value equals 2, the linkedlist is 1->3->4->5 

Please complete the following program to fullfil the function.
*/
import java.util.*;
public class RemoveElementsProblem
{
   public static void main(String[] args)
   {
      LinkedList elements = new LinkedList();
      System.out.println("Enter list, last number is the values you want deleted:");
      Scanner s = new Scanner(System.in);
      elements.head = new ListNode(s.nextInt());
      elements.head.next = new ListNode(s.nextInt());
      elements.head.next.next = new ListNode(s.nextInt());
      elements.head.next.next.next = new ListNode(s.nextInt());
      elements.head.next.next.next.next = new ListNode(s.nextInt());
      int val = s.nextInt();
      
      System.out.println(elements);
      
      removeElements(elements, val);
      
      System.out.println(elements);
   }
   public static void removeElements(LinkedList llist, int val)
   {
      ListNode head = llist.head;
	      
      /*
       * if curr(head of list) is not null and is equal to the val input
       * remove head of list
       */
      while (llist.head != null && llist.head.value == val) {
         llist.head = llist.head.next;
      }
      
      ListNode currNode = llist.head;
      
      while(currNode != null && currNode.next != null) {
         if(currNode.next.value == val) {
            currNode.next = currNode.next.next;
         }else {
            currNode = currNode.next;
         }
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
