package dLinkedList;

public class DLinkedList <T extends Comparable<T>>{ //Class Doubly_Linked_List:
	
	private DNode<T> head;
	private DNode<T> dummy; //Dummy head for Doubly_Linked_List and its value=null.

	public DLinkedList() {
		
		this.dummy=new DNode<>();
		this.head = this.dummy;
		this.dummy.setNext(null);
	}

	public DNode<T> getHead() {
		return head;
	}

	public void setHead(DNode<T> head) {
		this.head = head;
	}

	public void insert(T data) {

		DNode<T> newNode = new DNode<>(data);

		if (find(data)==null) {
			
			DNode<T> prevPtr = head;
			DNode<T> curr = head.getNext();
			for (; curr != null && curr.getData().compareTo(data) < 0;
					prevPtr = curr, curr = curr.getNext());

			
			if (curr == null) { // case 3 : insert last

				newNode.setNext(null);
				newNode.setPrev(prevPtr);
				prevPtr.setNext(newNode);
			} else { // case 2 : insert between

				newNode.setNext(curr);
				newNode.setPrev(curr.getPrev());
				curr.getPrev().setNext(newNode);
				curr.setPrev(newNode);
			}
		}else {
			
			System.out.println("This node is already exist !\n");
		}
	}

	public void delete(T data) {

		if (find(data)!=null) {

			DNode<T> prevPtr = head;
			DNode<T> curr = head.getNext();
			for (; curr != null && curr.getData().compareTo(data) < 0; 
					prevPtr = curr, curr = curr.getNext());

			if (curr != null && curr.getData().compareTo(data) == 0) {

				 if (curr.getNext() == null) { // case 3 : delete last item

					prevPtr.setPrev(null);
					prevPtr.setNext(null);
				} else { // case 2 : delete between

					curr.getPrev().setNext(curr.getNext());
					curr.getNext().setPrev(curr.getPrev());

				}
			}
		}else {
			
			System.out.println("This node is not found to delete !\n");
		}
	}

	public DNode<T> find(T data) {

		if (head.getNext() != null) {

			DNode<T> curr = head.getNext();
			while (curr != null && curr.getData().compareTo(data) <= 0) {

				if (curr.getData().equals(data) == true) {

					return curr;
				}
				curr = curr.getNext();
			}
		}
		return null;
	}

	public int lengthI() {

		int length = 0;
		DNode<T> curr = head.getNext();
		while (curr != null) {

			length++;
			curr = curr.getNext();
		}
		return length;
	}

	public int lengthR() {

		return lengthR(head.getNext());
	}

	private int lengthR(DNode<T> node) {

		if (node == null) {

			return 0;
		}

		return 1 + lengthR(node.getNext());
	}
	
	public void traverseI() {

		System.out.print("Head--> ");
		DNode<T> curr = head.getNext();
		while (curr != null) {

			System.out.print("[" + curr.getData() + "]");
			curr = curr.getNext();
			if (curr != null) {

				System.out.print("<=>");
			}else {
				
				System.out.print("-->");
			}
		}
		System.out.print(" Null");
	}

	public void traverseR() {

		System.out.print("Head--> ");
		traverseR(head.getNext());
		System.out.print(" Null");
	}

	private void traverseR(DNode<T> node) {

		if (node != null) {

			System.out.print("[" + node.getData() + "]");

			if (node.getNext() != null) {

				System.out.print("<=>");
			}else {
				
				System.out.print("-->");
			}
			traverseR(node.getNext());
		}
	}

	public void backTraverseI() {

		System.out.print("Null <--");
		DNode<T> curr = head;
		while (curr != null && curr.getNext() != null) {

			curr = curr.getNext();
		}

		while (curr != null) {

			System.out.print("[" + curr + "]");
			curr = curr.getPrev();
			if (curr != null) {

				System.out.print("<=>");
			}
		}
		System.out.print(" <--Head");
	}

	public void backTraverseR() {

		System.out.print("Null <--");
		backTraverseR(head);
		System.out.print(" <--Head");
	}

	private void backTraverseR(DNode<T> node) {

		if (node != null) {

			backTraverseR(node.getNext());

			if (node.getNext() != null) {

				System.out.print("<=>");
			}
			System.out.print("[" + node + "]");
		}
	}

	public String toString() {

		String res = "Head-->";
		DNode<T> curr = head.getNext();
		while (curr != null) {
			res += "[" + curr + "]";
			curr = curr.getNext();
			if (curr != null) {
				
				res += "<=>";
			}else {
				
				res +="--> ";
			}
				
		}
		return res + "NULL";
	}
}