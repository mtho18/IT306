package groupProject;

public class CharList implements CharListable {

    private Node head;
    private Node tail;
    private int count = 0;
    
    public void addToHead(String data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        count++;
    }

    public void addToTail(String data) {
    	Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
        	tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        count++;
    }

    public String remove() {
        if (this.isEmpty()) {
        	throw new IllegalStateException("Empty");
        }
        else {
        	Node del = head;
        	String removeChar = del.data;
        	if (head.next != null) {
        		head = head.next;
        	}
        	head.prev = null;
        	del.next = null;
        	count--;
        	return removeChar;
        }
    }

    public boolean isEmpty() {
    	return (this.size() == 0);
    }

    public int size() {
    	return count;
    }

    public int[] sort() {
    	int[] result = {0,0};
    	result = insertSort(result);
    	return result;
    }
    
    public int[] insertSort(int[] result) {
    	if (this.size() > 1) {
	    	CharList left = new CharList();
			CharList right = new CharList();
			int mid = size() / 2;
			while (this.size() > mid) {
				left.addToHead(this.remove());
				result[0]++;
			}
			while (!this.isEmpty()) {
				right.addToHead(this.remove());
				result[0]++;
			}
			left.insertSort(result);
			right.insertSort(result);
			while(!left.isEmpty() && !right.isEmpty()) {
				if (Integer.parseInt(left.head.data) < Integer.parseInt(right.head.data)) {
					this.addToTail(left.remove());
				}
				else {
					this.addToTail(right.remove());
				}
			}
			while (!left.isEmpty()) {
				this.addToTail(left.remove());
			}
			while (!right.isEmpty()) {
				this.addToTail(right.remove());
			}
    	}
    	return result;
    }

    public String toString() {
        if (isEmpty()) return "{}";
        else {
            Node currentNode = head;
            String returnValue = "{" + currentNode.data;
            while (currentNode.next != null) { 
                currentNode = currentNode.next;
                returnValue += "," + currentNode.data;
            }
            returnValue += "}";
            return returnValue;
        } 
    }

    /** Node class definition (inner class) **/

    private class Node {

        private Node prev;
        private Node next;
        private String data;

        private Node(String data) {
            this.data = data;
        }
    }
}
