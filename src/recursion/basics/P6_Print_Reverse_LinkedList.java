/**
 * 
 */
package recursion.basics;

/**
 * 
 * CodingNinjas: Print Reversed Linked List
 * 
 * Link:
 * https://www.codingninjas.com/studio/problems/print-reverse-linkedlist_564
 * 
 * TC: O(n)
 * SC: O(1)
 * 
 */
public class P6_Print_Reverse_LinkedList {

	static class Node {
		Integer data;
		Node next;

		public Node(Integer data) {
			this.data = data;
		}
	}

	static class LinkedList {
		Node head;

		public void appendItem(Integer data) {
			Node newNode = new Node(data);
			if (head == null) {
				head = newNode;
				return;
			}
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}

		public Node addItems(int[] nums) {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] != -1) {
					appendItem(nums[i]);
				}
			}
			return head;
		}

		public void printList(Node head) {
			if (head == null) {
				System.out.println("NULL");
				return;
			}
			Node current = head;
			while (current != null) {
				System.out.print(current.data + " --> ");
				current = current.next;
			}
			System.out.println("NULL");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = { 10, 20, 30, 40, 50, -1 };
		LinkedList list = new LinkedList();
		Node root = list.addItems(nums);
		list.printList(root);
		printReverse(root);
	}

	private static void printReverse(Node root) {
		if (root == null) {
			return;
		}
		printReverse(root.next);
		System.out.print(root.data + " ");
	}

}
