package Control;

import java.util.NoSuchElementException;

public class LinkedList<T> {
	
	private Node<T> firstNode;
	private Node<T> lastNode;
	
	public LinkedList() {
	}
	
	public T getFirst() {
		if (firstNode == null) {
			throw new NoSuchElementException();
		} else {
			return firstNode.element;
		}
	}

	public T getLast() {
		if (lastNode == null) {
			throw new NoSuchElementException();
		} else {
			return lastNode.element;
		}
	}

	public void add(T element) {
		if (firstNode == null) {
			firstNode = new Node<>(element);
			lastNode = firstNode;
		} else {
			lastNode = lastNode.add(element);
		}
	}

	public T removeFirst() {
		if (firstNode == null) {
			throw new NoSuchElementException();
		} else {
			Node<T> temp = firstNode;
			firstNode = firstNode.next;
			if (firstNode == null) {
				lastNode = null;
			}
			return temp.element;
		}

	}

	public T removeLast() {
		if (firstNode == null) {
			throw new NoSuchElementException();
		}
		if (firstNode == lastNode) {
			Node<T> temp = firstNode;
			firstNode = null;
			lastNode = null;
			return temp.element;
		} else {
			Node<T> secToLast = firstNode.findSecondToLast();
			Node<T> temp = lastNode;
			lastNode = secToLast;
			secToLast.next = null;
			return temp.element;
		}
	}

	public void remove(T element) {
		if (firstNode.element.equals(element)) {
			firstNode = firstNode.next;
			if (firstNode == null) {
				lastNode = null;
			}
		} else {
			Node<T> prevNode = firstNode.findPrevNode(element);
			if (prevNode == null) {
				throw new NoSuchElementException();
			} else {
				prevNode.next = prevNode.next.next;
				if (prevNode.next == null) {
					lastNode = prevNode;
				}
			}
		}
	}

	public int size() {
		return firstNode == null ? 0 : firstNode.size();
	}

	public String toString() {
		return "[" + (firstNode == null ? "" : firstNode.toString()) + "]";
	}
	
	public static void main(String[] args) {
		
	}

}
