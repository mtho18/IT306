package groupProject;
import java.util.Random;

public class testSort {

    public static void main (String[] args) {

        // Initialize and iterate through test with different sizes
        int size = 100;
        for (int i = 0; i < 3; i++) {
        	
        	// create array and populate it with random numbers
	        int[] tempData = new int[size];
	        int[] testData = new int[size];
	        Random rndm = new Random();
	        for (int idx = 0; idx < size; idx++) {
	        	tempData[idx] = rndm.nextInt(1000);
	        }
        	
        	SortReturn sr = null;
        	System.out.println("Array Size: " + size);
	        for (int j = 0; j < 1; j++) {
	        	
	        	for (int idx = 0; idx < size; idx++) {
		        	testData[idx] = tempData[idx];
		        }
	        	
	        	// Sort the array with different algorithms and print results
	        	if (j == 0) {
	        		sr = Sort.insertion(testData);
	        	}
	        	else {
	        		sr = Sort.collection(testData);
	        	}
		        System.out.println(sr.toString());
	        }
	        size *= 10;
        }
    }

    private static void displayArray(int[] testData) {
        for (int theInt: testData) {
            System.out.print(theInt + ",");
        } System.out.println();
    }
}
