package problem_solving.leetcode_150;

public class RemoveLinkedListElements {
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) {	this.val = val;		}
		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static void main(String[] args) {

	}
	
	public  static ListNode  removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }

        while( head != null && head.val == val){
            head = head.next;
        }

        ListNode temp = head;
        ListNode onePlusNode = null;

        if(temp != null && temp.next != null){
            onePlusNode = temp.next;
        }

        while(onePlusNode != null){
            if(onePlusNode.val == val){
                //Removing Node
                temp.next = onePlusNode.next;
                onePlusNode.next = null;
                onePlusNode = temp.next;
            }else{
                temp = temp.next;
                onePlusNode = onePlusNode.next;
            }
        }
        return head;        
    }

}
