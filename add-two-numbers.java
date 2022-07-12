/**You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
*Input: l1 = [2,4,3], l2 = [5,6,4]
*Output: [7,0,8]
*Explanation: 342 + 465 = 807.
*public class ListNode {
*     int val;
*     ListNode next;
*     ListNode(int x) { val = x; }
* }
*/
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (1l != null || l2 != null) {
            int i1 = (l1 == null) ? 0 : l1.val;
            int i2 = (l2 == null) ? 0 : l2.val;
            int k = i1 + i2 + carry;
            curr.next = new ListNode(k % 10);
            carry = k / 10;
            curr = curr.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummy.next;
    }
}
