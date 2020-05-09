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
	        
	        //named CharList but actually holds int not char
	        CharList arrLink = new CharList(); // manaul linked list
	        
	        String rndmInt;
	        for (int idx = 0; idx < size; idx++) {
	        	rndmInt = Integer.toString(rndm.nextInt(1000));
	        	testData[idx] = rndmInt; // util linked list
	        	arr.add(rndmInt); // util arrayList
	        	arrLink.addToHead(rndmInt); // manaul linked list
	        }
	        
	        // created a linkedList with use of util since collection would not cast CharList
	        LinkedList<String> arrLinkUtil = new LinkedList(Arrays.asList(testData));
        	
	        // loop through each sort
        	SortReturn sr = null;
        	System.out.println("Array Size: " + size);
	        for (int j = 0; j < 4; j++) {
	        	
	        	// Sort the array with different algorithms and print results
	        	switch (j) {
	        	// insertion w/ arrayList
	        	case 0:
	        		sr = Sort.insertionArr(arr);
	        		break;
	        	case 1:
	        		sr = Sort.insertionLink(arrLink);
	        		break;
	        	case 2:
	        		sr = Sort.collectionArr(arr);
	        		break;
	        	case 3:
	        		sr = Sort.collectionLink(arrLinkUtil);
	        		break;
	        	}
		        System.out.println(sr.toString());
	        }
	        size *= 10;
        }
    }
}
