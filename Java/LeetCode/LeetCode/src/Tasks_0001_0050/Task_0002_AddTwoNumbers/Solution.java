package Tasks_0001_0050.Task_0002_AddTwoNumbers;

public class Solution {
    public static void main(String[] args) {

    }

    /** @apiNote https://leetcode.com/problems/add-two-numbers/description/
     * You are given two non-empty linked lists representing two non-negative integers.
     * The digits are stored in reverse order, and each of their nodes contains a single digit.
     * Add the two numbers and return the sum as a linked list.
     *
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0, null); // create fiction (dummy) node for return
        ListNode curr = dummy; // init. variable carry for store "переноса" to next digit
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;    // init current sum variable
            if (l1 != null) {   // add value to sum and go to next node
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;   // calculate carry to next iteration
            curr.next = new ListNode(sum % 10, null); // create new node with result in current digit
            curr = curr.next;
        }
        return dummy.next;  // return node, next to fiction node (dummy)
    }
}
