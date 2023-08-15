package AddTwoLinkList;

import java.util.LinkedList;

import AddTwoLinkList.AddTwoLinkedList.ListNode;

public class AddTwoLinkedList {
    
 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
          ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummyHead.next;
    }
    public static void main (String [] args){
     
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        list1.add(2);
        list1.add(5);
        list1.add(9);

        list2.add(4);
        list2.add(6);
        list2.add(8);

          Object adder;
        AddTwoLinkedList.ListNode l1 = adder.new ListNode(0);
        AddTwoLinkedList.ListNode l2 = adder.new ListNode(0);

        AddTwoLinkedList.ListNode l1Current = l1;
        for (int num : list1) {
            l1Current.next = adder.new ListNode(num);
            l1Current = l1Current.next;
        }




    }
}
 