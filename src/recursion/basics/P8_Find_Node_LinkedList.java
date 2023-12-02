/**
 * 
 */
package recursion.basics;

/**
 * 
 * CodingNinjas: Find a Node in Linked List
 * 
 * Link:
 * https://www.codingninjas.com/studio/problems/find-a-node-in-linked-list_625049
 * 
 * TC: O(n)
 * SC: O(1)
 * 
 */
public class P8_Find_Node_LinkedList {

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
		int[] nums = { 3, 4, 5, 2, 6, 1, 9, -1 };
		LinkedList list = new LinkedList();
		Node head = list.addItems(nums);
		list.printList(head);
		int n = 6;
		int findNodeIndex = findNode(head, n);
		System.out.println("Index of " + n + " in LinkedList : " + findNodeIndex);
	}

	public static int findNode(Node head, int n) {
		if (head == null) {
			return -1;
		}
		Node currentNode = head;
		int count = 0;
		while (currentNode.next != null) {
			if (currentNode.data == n) {
				return count;
			}
			currentNode = currentNode.next;
			count++;
		}
		return -1;
	}

}
