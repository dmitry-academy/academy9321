package by.academy.lesson11.linkedlist;

public class CustomLinkedList<T> {

	private Node last;
	private Node first;
	private int size;

	public int size() {
		return size;
	}

	public void add(T value) {
		Node next = null;
		Node prev = last;

		Node newNode = new Node(value, next, prev);
		if (prev == null) {
			last = newNode;
			first = newNode;
		} else {
			last.next = newNode;
			newNode.prev = last;
			last = newNode;
		}
		size++;
	}

	public void add(int index, T value) {
		if (index >= size) {
			System.err.println("Index больше size");
			return;
		}
		size++;

		if (size == index + 1) {
			add(value);
		} else {
			Node replaceNode_3 = getNode(index);
			Node prev_7 = replaceNode_3.prev;

			Node newNode_8 = new Node(value, prev_7, replaceNode_3);
			prev_7.next = newNode_8;
			replaceNode_3.prev = newNode_8;
		}

	}

	private Node getNode(int index) {
		if (index >= size) {
			System.err.println("Index больше size");
			return null;
		}
		int counter = 0;
		Node current = first;
		while (current != null && counter <= index) {
			if (index == counter) {
				return current;
			}
			current = current.next;
			counter++;
		}
		return null;
	}

	private Node getNode(T object) {
		Node current = first;
		while (current != null) {
			if (current.equals(object)) {
				return current;
			}
			current = current.next;
		}
		return null;
	}

	public T get(T object) {
		return getNode(object).value;
	}

	public T get(int index) {
		return getNode(index).value;
	}

	public void remove(int index) {

	}

	public void remove(T object) {

	}

	class Node {
		T value;
		Node next;
		Node prev;

		Node(T value, Node prev, Node next) {
			this.value = value;
			this.prev = prev;
			this.next = next;
		}
	}
}
