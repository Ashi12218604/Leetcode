/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        int l=0;
        ListNode temp=head;
        while(temp!=null)
        {
         l++;
         temp=temp.next;
        }
        int[] arr=new int[l];
        int j=l-1;
        double sum=0;
       for(int i=0;i<l;i++)
       {
        arr[i]=head.val;
        sum += arr[i] * (1 << j);
        head=head.next;
         j--;
       }
      
    return (int) sum;
    }
}