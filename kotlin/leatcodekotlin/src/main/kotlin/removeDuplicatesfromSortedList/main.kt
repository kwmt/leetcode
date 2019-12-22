package removeDuplicatesfromSortedList

/**
 * Given a sorted linked list,
 * delete all duplicates such that each element appear only once.

Example 1:
Input: 1->1->2
Output: 1->2

Example 2:
Input: 1->1->2->3->3
Output: 1->2->3
 *
 */


var li = ListNode(5)
var v = li.value

//Definition for singly-linked list.
class ListNode(var value: Int) {
    var next: ListNode? = null
}

class Solution {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var current = head
        while (current?.next != null) {
            if (current.value == current.next?.value) {
                current.next = current.next?.next
            } else {
                current = current.next
            }
        }
        return head
    }
}