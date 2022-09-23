package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortingAlgorithm {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		    int a[], n, temp;
		    System.out.print("Please enter the limit: ");
		    n = sc.nextInt();
		    a = new int[n];


		    for(int i =0; i<n; i++){
		      System.out.print("Please Enter the Data: ");
		      a[i]= sc.nextInt();
		    }

		    System.out.print("Given Elements are: ");
		    System.out.println(Arrays.toString(a));

		    for(int i=0; i<n; i++){
		      for(int j=0; j<n-1-i; j++){
		        if(a[j]>a[j+1]){
		          temp = a[j];
		          a[j] = a[j+1];
		          a[j+1]= temp;
		        }
		      }
		    }
		    System.out.print("After Sorting: ");
		    System.out.println(Arrays.toString(a));
	}

}
