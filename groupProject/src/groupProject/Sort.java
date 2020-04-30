package groupProject;

public class Sort {
	// Insertion sort is O(n^2)
    public static SortReturn insertion(int[] data) {
        long elements = data.length;
        long comparisons = 0;
        long swaps = 0;
        
        int[] temp = new int[data.length];
        temp[0] = data[0];

        long startTime = System.nanoTime();
        for (int idx = 1; idx < data.length; idx++) {
        	temp[idx] = data[idx];
        	for (int x = idx - 1; x >= 0; x--) {
            	if (temp[x+1] < temp[x]) {
            		comparisons++;
            		swaps++;
            		int tmpData = temp[x];
            		temp[x] = temp[x+1];
            		temp[x+1] = tmpData;
            	}
            	else if (temp[x+1] >= temp[x]) {
            		comparisons++;
            		break;
            	}
        	}
        }
        long totalTime = (System.nanoTime() - startTime);
        for (int idx = 0; idx < data.length; idx++) {
        	data[idx] = temp[idx];
        }

        SortReturn sr = new SortReturn("Insertion Sort",comparisons,swaps,totalTime,elements);
        return sr;
    }
    
    //Collection sort
    public static SortReturn collection (int[] data) {
    	long elements = data.length;
        long comparisons = 0;
        long swaps = 0;
//        long totalTime = (System.nanoTime() - startTime);
        long totalTime = 0;
    	SortReturn sr = new SortReturn("Collection Sort",comparisons,swaps,totalTime,elements);
    	return sr;
    }
}
