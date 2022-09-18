package SearchingAlgorithm;

public class LinearSearchingAlgorithm {

	public static void main(String[] args) {
		 int[] nums = { 3, 2, 15, 6, 7, 4, 5, 2 };
		    int searchItem = 2;

		    for (int i = 0; i < nums.length; i++) {
		      if (nums[i] == searchItem) {
		        System.out.println("Item found at index at: " + i);
		        return;
		      }
		    }
		    System.out.println("Search Item not found!");
	}

}
