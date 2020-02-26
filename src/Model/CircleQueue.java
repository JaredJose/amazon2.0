package Model;

public class CircleQueue<T> {

	private Node<T> currentNode;

	public CircleQueue() {
		currentNode = null;
	}

	public String toString() {
		if (currentNode == null) {
			return "";
		} else {
			Node<T> node = currentNode;
			String result = "";
			do {
				result += node.getObject() + ",";
				node = node.next;
			} while (node != currentNode);
			return result;
		}
	}

	public void add(T element) {
		if (currentNode == null) {
			currentNode = new Node<T>(element);
			currentNode.next = currentNode;
			currentNode.prev = currentNode;
		} else {
			currentNode.add(element);
			currentNode = currentNode.next;
		}
	}

	public T getObject() {
		if (currentNode == null) {
			return null;
		} else {
			return currentNode.getObject();
		}
	}

	public void moveNext() {
		currentNode = currentNode.prev;
	}

	public void movePrev() {
		currentNode = currentNode.prev;
	}
}
