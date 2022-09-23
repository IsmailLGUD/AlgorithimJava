package SearchingAlgorithm;

public class BinarySearchAlgorithm {

	
		  public static void main(String[] args) {
			  int[] a = {1,2,3,4,5,6,7,8,9,12,13,14};
			    int item = 4;
			    
			    int left = 0, right = a.length-1;

			    
			    while(left<=right){
			    int middle = left + (right-left)/2;
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
