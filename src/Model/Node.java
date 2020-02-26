package Model;

public class Node<T> {

	T element;
	Node<T> next;
	Node<T> prev;

	public Node(T element) {
		this.element = element;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public void setPrev(Node<T> prev) {
		this.prev = prev;
	}

	public Node<T> add(T element) {
		Node<T> node = new Node<T>(element);
		node.next = this.next;
		this.next = node;
		node.prev = this;
		if (node.next != null) {
			node.next.prev = node;
		}
		return node;
	}

	public Node<T> findNode(T element) {
		if (this.element.equals(element)) {
			return this;
		} else {
			return next.findNode(element);
		}
	}

//		public Node<T> findPrevNode(T element) {
//		if (next == null) {
//			return null;
//		}
//		if (next.element.equals(element)) {
//			return this;
//		} else {
//			return next.findPrevNode(element);
//		}
//	}
	public Node<T> findSecondToLast() {
		if (next == null) {
			return null;
		}
		if (next.next == null) {
			return this;
		} else {
			return next.findSecondToLast();
		}
	}

	public T getObject() {
		return this.element;
	}

	public Node getNext() {
		return this.next;
	}

	public Node getPrevious() {
		return this.prev;
	}

	public int size() {
		return next == null ? 1 : 1 + next.size();
	}

	@Override
	public String toString() {
		return element.toString() + (next == null ? "" : ", " + next.toString());
	}

	public static void main(String[] args) {
	}
}
