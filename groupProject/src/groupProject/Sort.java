package groupProject;
import java.util.*;

public class Sort {
	// insertion sort is O(n^2) w/ arrayList
    public static SortReturn insertionArr (ArrayList<String> data) {
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
        SortReturn sr = new SortReturn("ArrayList Insertion Sort",comparisons,swaps,totalTime,elements);
        return sr;
    }
    
    // insertion sort w/ linkedList (node)
    public static SortReturn insertionLinkNode (CharList data) {
        long elements = data.size();
        long comparisons = 0;
        long swaps = 0;
        int[] result = new int[2];
        
        // begin algorithm sort and analysis
        long startTime = System.nanoTime();
        result = data.sort();
        long totalTime = (System.nanoTime() - startTime);
        
        // map results
        comparisons = result[0];
        swaps = result[1];

        // fetch results as a string
        SortReturn sr = new SortReturn("LinkedList (Node) Insertion Sort",comparisons,swaps,totalTime,elements);
        return sr;
    }
    
    // insertion sort w/ linkedList
    public static SortReturn insertionLink (LinkedList data) {
    	long elements = data.size();
        long comparisons = 0;
        long swaps = 0;
        
        // initiate temp arr @ index 0
        int[] temp = new int[data.size()];
        temp[0] = Integer.parseInt((String) data.get(0));
        
        // begin algorithm sort and analysis
        long startTime = System.nanoTime();
        for (int idx = 1; idx < data.size(); idx++) {
        	temp[idx] = Integer.parseInt((String) data.get(idx));
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
        
    	SortReturn sr = new SortReturn("LinkedList Insertion Sort",comparisons,swaps,totalTime,elements);
    	return sr;
    }
    
    // collection sort w/ arrayList
    public static SortReturn collectionArr (ArrayList<String> data) {
    	long elements = data.size();
        long comparisons = 0;
        long swaps = 0;
        
        // begin algorithm sort and analysis
        long startTime = System.nanoTime();
        Collections.sort(data);
        long totalTime = (System.nanoTime() - startTime);
        
    	SortReturn sr = new SortReturn("ArrayList Collection Sort",comparisons,swaps,totalTime,elements);
    	return sr;
    }
    
    // collection sort w/ linkedList
    public static SortReturn collectionLink (LinkedList data) {
    	long elements = data.size();
        long comparisons = 0;
        long swaps = 0;
        
        // begin algorithm sort and analysis
        long startTime = System.nanoTime();
        Collections.sort(data);
        long totalTime = (System.nanoTime() - startTime);
        
    	SortReturn sr = new SortReturn("LinkedList Collection Sort",comparisons,swaps,totalTime,elements);
    	return sr;
    }
}
