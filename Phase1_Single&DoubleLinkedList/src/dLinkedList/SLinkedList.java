package dLinkedList;

public class SLinkedList<T extends Comparable<T>> { //Class Single_Linked_List:

	private SNode<T> head;
	private SNode<T> dummy; //Dummy head for Single_Linked_List and its value=null.

	public SLinkedList() {

		this.dummy=new SNode<>();
		this.head=this.dummy;
		this.dummy.setNext(null);
	}

	public SNode<T> getHead() {
		return head;
	}

	public void setHead(SNode<T> head) {
		this.head = head;
	}

	public void insert(T data) {

		SNode<T> newNode=new SNode<>(data);

		if (find(data)==null) {

			SNode<T> prev=head;
			SNode<T>  curr=head.getNext();
			for( ; curr!=null && curr.getData().compareTo(data)<0 ;
					prev=curr, curr=curr.getNext());


			if (curr==null) {  // case 3 : insert last

				prev.setNext(newNode);
			}else {  // case 2 : insert between

				newNode.setNext(curr);
				prev.setNext(newNode);
			}
		}else {

			System.out.println("this node is already added !\n");
		}

	}

	public void traverse() {

		SNode<T> curr=head.getNext();
		System.out.print("Head --> ");
		while(curr!=null) {

			System.out.print(curr.getData()+" --> ");
			curr=curr.getNext();
		}
		System.out.print(" Null\n");
	}

	public SNode<T> find(T data) {

		if (head.getNext()!=null) {

			SNode<T> curr=head.getNext();
			while(curr!=null && curr.getData().compareTo(data)<=0) {

				if (curr.getData().equals(data)==true) {

					return curr;
				}
				curr=curr.getNext();
			}
		}
		return null;
	}

	public SNode<T> delete(T data){

		if (find(data)!=null) {

			SNode<T> prev=head;
			SNode<T>curr=head.getNext();
			for ( ; curr!=null && curr.getData().compareTo(data)<0 ;
					prev=curr, curr=curr.getNext());

			if (curr!=null && curr.getData().compareTo(data)==0) {


				if(curr.getNext()==null) { // case 3 : delete last item

					prev.setNext(null);
				}else { // case 2 : delete between

					prev.setNext(curr.getNext());
				}
				return curr;
			}

		}else {

			System.out.println("this node not found to delete !\n");
		}

		return null;
	}

	public int lengthI() {

		int length = 0;
		SNode<T> curr = head.getNext();
		while (curr != null) {

			length++;
			curr = curr.getNext();
		}
		return length;
	}

	public int lengthR() {

		return lengthR(head.getNext());
	}

	private int lengthR(SNode<T> node) {

		if (node == null) {

			return 0;
		}

		return 1 + lengthR(node.getNext());
	}

	public String toString() {

		String res = "Head--> ";
		SNode<T> curr = head.getNext();
		while (curr != null) {
			res += curr+"--> ";
			curr = curr.getNext();
		}
		return res + "NULL";
	}
}
