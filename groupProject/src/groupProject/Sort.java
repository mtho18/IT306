package groupProject;
import java.util.*;

public class Sort {
	// Insertion sort is O(n^2)
    public static SortReturn insertion(ArrayList<String> data) {
        long elements = data.size();
        long comparisons = 0;
        long swaps = 0;
        
        // initiate temp arr @ index 0
        int[] temp = new int[data.size()];
        temp[0] = Integer.parseInt(data.get(0));
        
        // begin algorithm sort and analysis
        long startTime = System.nanoTime();
        for (int idx = 1; idx < data.size(); idx++) {
        	temp[idx] = Integer.parseInt(data.get(idx));
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
        
        // replace original data with temp data
        for (int idx = 0; idx < data.size(); idx++) {
        	data.set(idx, Integer.toString(temp[idx]));
        }

        // fetch results as a string
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
