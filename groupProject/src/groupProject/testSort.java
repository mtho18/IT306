package groupProject;
import java.util.Random;
import java.util.*;

public class testSort {

    public static void main (String[] args) {
    	// initialize and iterate through test with different sizes
        int size = 10;
        for (int i = 0; i < 4; i++) {
        	
        	// create array and populate it with random numbers
	        Random rndm = new Random();
	        String[] testData = new String[size]; // util linked list
	        ArrayList<String> arr = new ArrayList<String>(); // util arrayList
	        String[] testData2 = new String[size]; // util linked list
	        ArrayList<String> arr2 = new ArrayList<String>(); // util arrayList
	        
	        //named CharList but actually holds int not char
	        CharList arrLink = new CharList(); // node linked list
	        CharList arrLink2 = new CharList(); // node linked list
	        
	        //creating data set
	        String rndmInt;
	        for (int idx = 0; idx < size; idx++) {
	        	rndmInt = Integer.toString(rndm.nextInt(1000));
	        	if (idx % 2 == 0) {
	        		rndmInt = Integer.toString(idx);
	        	}
	        	testData[idx] = rndmInt; // util linked list
	        	arr.add(rndmInt); // util arrayList
	        	arrLink.addToHead(rndmInt); // node linked list
	        	testData2[idx] = rndmInt; // util linked list
	        	arr2.add(rndmInt); // util arrayList
	        	arrLink2.addToHead(rndmInt); // node linked list
	        }
	        
	        // created a linkedList with use of util since collection would not cast CharList
	        LinkedList<String> arrLinkUtil = new LinkedList(Arrays.asList(testData));
	        LinkedList<String> arrLinkUtil2 = new LinkedList(Arrays.asList(testData2));
        	
	        // loop through each sort
        	SortReturn sr = null;
        	System.out.println("Array Size: " + size);
	        for (int j = 0; j < 8; j++) {
	        	
	        	// Sort the array with different algorithms and print results
	        	switch (j) {
	        	// insertion w/ arrayList
	        	case 0:
	        		System.out.println("Random Data Set");
	        		sr = Sort.insertionArr(arr);
	        		break;
//	        	case 1:
//	        		sr = Sort.insertionLinkNode(arrLink);
//	        		break;
	        	case 1:
	        		sr = Sort.insertionLink(arrLinkUtil);
	        		break;
	        	case 2:
	        		sr = Sort.collectionArr(arr);
	        		break;
	        	case 3:
	        		sr = Sort.collectionLink(arrLinkUtil);
	        		break;
	        	case 4:
	        		System.out.println("Almost Sorted Data Set");
	        		sr = Sort.insertionArr(arr2);
	        		break;
	        	case 5:
	        		sr = Sort.insertionLink(arrLinkUtil2);
	        		break;
	        	case 6:
	        		sr = Sort.collectionArr(arr2);
	        		break;
	        	case 7:
	        		sr = Sort.collectionLink(arrLinkUtil2);
	        		break;
	        	}
		        System.out.println(sr.toString());
	        }
	        size *= 10;
        }
    }
}
