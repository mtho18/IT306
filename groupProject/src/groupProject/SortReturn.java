package groupProject;

public class SortReturn {
	private String description;
    private long comparisons = 0;
    private long swaps = 0;
    private long time = 0;
    private long elements = 0;

    public SortReturn (String description, long comparisons, long swaps, long time, long elements) {
        this.description = description;
        this.comparisons = comparisons;
        this.swaps = swaps;
        this.time = time;
        this.elements = elements;
    }

    public String toString() {
        return "	" + this.description + ":\n" +
               "	Elements: " + this.elements + "\n" +
               "	Comparisons: " + this.comparisons + "\n" +
               "	Swaps: " + this.swaps + "\n" +
               "	Time: " + this.time + "\n";
    }    
}
