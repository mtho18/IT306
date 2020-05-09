package groupProject;
import java.util.Collections;
import java.util.Random;
import java.util.*;

public class testSort {

    public static void main (String[] args) {
    	// initialize and iterate through test with different sizes
        int size = 100;
        for (int i = 0; i < 3; i++) {
        	
        	// create array and populate it with random numbers
	        int[] tempData = new int[size];
	        int[] testData = new int[size];
	        Random rndm = new Random();
	        ArrayList<String> arr = new ArrayList<String>();
	        for (int idx = 0; idx < size; idx++) {
	        	tempData[idx] = rndm.nextInt(1000);
	        	arr.add(Integer.toString(rndm.nextInt(1000)));
	        }
        	
	        // loop through each sort
        	SortReturn sr = null;
        	System.out.println("Array Size: " + size);
	        for (int j = 0; j < 1; j++) {
	        	for (int idx = 0; idx < size; idx++) {
		        	testData[idx] = tempData[idx];
		        }
	        	
	        	// Sort the array with different algorithms and print results
	        	switch (j) {
	        	// insertion w/ arrayList
	        	case 0:
	        		sr = Sort.insertion(arr);
	        		break;
	        	case 1:
	        		//sr = Sort.collection(testData);
	        		//Collections.sort(arr);
	        		break;
	        	}
		        System.out.println(sr.toString());
	        }
	        size *= 10;
        }
    }
}
