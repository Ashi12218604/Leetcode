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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<lists.length;i++)
        {
            pq.addAll(values(lists[i]));
        }
        ListNode temp=new ListNode();
        ListNode dummy=temp;
        while(!pq.isEmpty())
        {
            dummy.next=new ListNode(pq.poll());
            dummy=dummy.next;
        }
        return temp.next;
        
    }
    public List values(ListNode list)
    {
        ArrayList<Integer> al=new ArrayList<>();
        while(list!=null)
        {
            al.add(list.val);
            list=list.next;
        }
        return al;
    }

}