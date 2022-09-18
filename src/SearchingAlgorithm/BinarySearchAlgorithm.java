package SearchingAlgorithm;

public class BinarySearchAlgorithm {

	
		  public static void main(String[] args) {
		    int[] a = {1,2,3,4,5,6,7,8,9,12,13,14};
		    int item = 4;
		    
		    int left = 0, right = a.length-1, middle;

		    middle = (left+right)/2;
		    while(left<=right){
		    if(a[middle] == item){
		      System.out.println("Item found at index: " + middle);
		        return;
		    }else if(a[middle]<item){
		      left = middle +1;
		    }else{
		      right = middle -1;
		    }
		    
		  }

		    System.out.println("System not found!!!!");
		  
		}

}
