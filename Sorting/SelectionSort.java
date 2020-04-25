import java.util.*;
class SelectionSort{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		//Taking input for size of an array

		System.out.println("Enter the size of an array");
		int n = sc.nextInt();

		// Taking input elements in array

		int []arr = new int[n];		
		System.out.println("Enter "+n+" element");
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();

		selectionSorting(arr);
	}
	public static void selectionSorting(int [] arr){
		
		int temp = 0;


		// Run the loop form 0 to less than  n-1 times

		for(int i=0; i<arr.length-1; i++){


			//setting minimum index to starting index

			int min = i;


			//Inner Loop for finding minimum elements index  loop will start  from i+1 to less than n

			for(int j=i+1; j<arr.length; j++){
				if(arr[j] < arr[min]){
					min = j;
				}
			}


			/*
				if min index is changed from i to something else 
				that is minimum element is not present at i index
			  	then swap the elements 
			*/

			if(min != i){
				temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
		// Printing the elements of the array
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + ", ");
	}	
}