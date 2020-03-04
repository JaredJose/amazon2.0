package Model;

import java.util.NoSuchElementException;

public class LinkedList<T> {

	public Node<T> firstNode;
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

	public T getObject() {
		return firstNode.element;
	}

	public Node getNext() {
		return this.getNext();
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
			Node<T> found = firstNode.next.findNode(element);
			if (found == null) {
				throw new NoSuchElementException();
			}
			found.prev.next = found.next;
			found.next.prev = found.prev;
		}
	}

	public int size() {
		return firstNode == null ? 0 : firstNode.size();
	}

	// This toString method is not called. The toString method is called in the
	// Product class.
	public String toString() {
		return "[" + (firstNode == null ? "" : firstNode.toString()) + "]";
	}
}
