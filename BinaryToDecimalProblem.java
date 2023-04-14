/*
Given head which is a reference node to a singly-linked list. 
The value of each node in the linked list is either 0 or 1. The 
linked list holds the binary representation of a number.
In this program, you need to
(1) read three binary number and put them in a linked list
(2) convert them to decimal and display it
Example 1:
input:1, 0, 1
output:5
Explanation: (101) in base 2 is (5) in base 10
Example 2:
input: 0, 0, 1
output: 1
Explanation: (001) in base 2 is (1) in base 10
Example 3:
input: 0, 0, 0
output: 0
Explanation: (000) in base 2 is (0) in base 10
Please complete the following program to fullfil the function.
*/
import java.util.*;
public class BinaryToDecimalProblem
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      ListNode l1 = new ListNode(input.nextInt());
      l1.next = new ListNode(input.nextInt());
      l1.next.next = new ListNode(input.nextInt());
      System.out.print(getDecimalValue(l1));
   }
   public static int getDecimalValue(ListNode head)
   {
      int value = head.value;
	   while(head.next != null) {
		   value = value*2 + head.next.value;
		   head = head.next;
	   }
	   return value;
   }

}
class ListNode
{
   int value;
   ListNode next;
   ListNode(int v){value = v;}
}
