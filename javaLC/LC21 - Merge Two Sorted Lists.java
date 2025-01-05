
/**
 * AUTHOR: <Aziz Ashy> aziz.ashy@gmail.com
 * 
 * Runtime: 0 ms (> 100%)
 * Space: 42 mb (> 36%)
 * Tests: 100%
 */

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newHead = new ListNode();
        ListNode current = newHead;
        int counter = 0;

        if (list1 == null && list2 == null) {
            return null;
        }

        while (list1 != null || list2 != null) {
            if (counter == 0) {
                if (list1 == null) {
                    newHead = list2;
                    return newHead;
                } else if (list2 == null) {
                    newHead = list1;
                    return newHead;
                } else {
                    if (list1.val <= list2.val) {
                        current.val = list1.val;
                        list1 = list1.next;
                    } else {
                        current.val = list2.val;
                        list2 = list2.next;
                    }
                }
                counter+=1;
            }

            if (list1 == null) {
                current.next = list2;
                return newHead;
            } else if (list2 == null) {
                current.next = list1;
                return newHead;
            }

            if (list1.val <= list2.val) {
                ListNode nextHead = new ListNode(list1.val);
                current.next = nextHead;
                current = current.next;
                list1 = list1.next;
            } else {
                ListNode nextHead = new ListNode(list2.val);
                current.next = nextHead;
                current = current.next;
                list2 = list2.next;
            }

        }
        return newHead;
    }
}