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
    	Node temp = null;
    	Node currentNode = head;
    	Node hold;
    	while (currentNode != null) {
    		Node next = currentNode.next;
    		currentNode.prev = currentNode.next = null;
    		if (head == null) {
    			head = currentNode;
    		}
    		else if (Integer.parseInt(head.data) >= Integer.parseInt(currentNode.data)) {
    			currentNode.next = head;
    			currentNode.next.prev = currentNode;
    			head = currentNode;
    		}
    		else {
    			hold = head;
    			while (hold.next != null && Integer.parseInt(hold.next.data) < Integer.parseInt(currentNode.data)) {
    				hold.next = hold.next;
    			}
    			currentNode.next = hold.next;
    			if (hold.next != null) {
    				currentNode.next.prev = currentNode;
    			}
    			hold.next = currentNode;
    			currentNode.prev = hold;
    		}
    		temp = head;
    		currentNode = next;
    	}
    	head = temp;
//    	CharList temp = new CharList();
//    	Node currentNode = head;
//    	Node holdNode = head;
//    	temp.addToHead(this.remove());
//    	while (!this.isEmpty()) {
//    		temp.addToHead(this.remove());
//    		while (currentNode.next != null) {
//    			if (currentNode.next != null) {
//	    			if (Integer.parseInt(currentNode.next.data) < Integer.parseInt(currentNode.data)) {
//	    				result[0]++;
//	    				result[1]++;
//	    				holdNode = currentNode;
//	    				currentNode = currentNode.next;
//	    				currentNode.next = holdNode;
//	    				temp.addToHead(currentNode.data);
//	    			}
//	    			else if (Integer.parseInt(currentNode.next.data) >= Integer.parseInt(currentNode.data)) {
//	    				result[0]++;
//	    				break;
//	    			}
//    			}
//    		}
//    	}
//    	while (!temp.isEmpty()) {
//    		this.addToHead(temp.remove());
//    	}
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
