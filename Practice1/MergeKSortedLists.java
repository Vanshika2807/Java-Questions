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


    public ListNode mergeKLists(ListNode[] lists) { //this is the main function

        if(lists == null || lists.length==0){
            return null;
        }

        return mergeLists(lists,0,lists.length-1);



        // ArrayList<Integer> arr = new ArrayList<> ();
        // for(int i=0; i<lists.length; i++){
        //     ListNode head = lists[i];
        //     while(head!=null){
        //         arr.add(head.val);
        //         head = head.next;
        //     }
        // }

        // Collections.sort(arr);
        // // System.out.println(arr);

        // ListNode head = new ListNode(-1);
        // ListNode head2 = head;
        // for(int i=0; i<arr.size(); i++){
        //     ListNode temp = new ListNode(arr.get(i));
        //     head2.next = temp;
        //     head2=temp;
        // }

        // return head.next;
    }

     private ListNode mergeLists(ListNode []lists, int start, int end){
        if(start == end){
            return lists[start];
        }

        if(start+1 == end){
            return merge(lists[start],lists[end]);
        }

        int mid= (start+end)/2;
        ListNode left = mergeLists(lists,start,mid);
        ListNode right  = mergeLists(lists,mid+1,end);

        return merge(left,right);
    }

    private ListNode merge(ListNode a, ListNode b){
        ListNode head = new ListNode();
        ListNode temp = head;
        while(a!=null && b!=null){
            if(a.val<b.val){
                temp.next = a;
                temp = a;
                a=a.next;
            }
            else{
                temp.next = b;
                temp = b;
                b=b.next;
            }
        }

        if(a!=null){
            temp.next = a;
        }
        if(b!=null){
            temp.next = b;
        }

        return head.next;
    }


}