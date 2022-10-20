package Merge_two_sorted_lists_21;

/**
 * Created by Assylbek on 18.10.2022.
 */
public class Solution {
     static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {

        ListNode List1 = new ListNode(1, new ListNode(2, new ListNode(2)));
        ListNode List2 = new ListNode(0, List1);

//        System.out.println(mergeTwoLists();
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newList = new ListNode(0);
        ListNode head = newList;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                head.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                head.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            head = head.next;
        }
        if (l1 == null && l2 != null) {
            head.next = l2;
        }
        if (l2 == null && l1 != null) {
            head.next = l1;
        }
        return newList.next;
    }


}
