import java.util.*;
class BubbleSort{
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

		bubbleSorting(arr);
		
		// Printing the elements of the array
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + ", ");	
	}
	public static void bubbleSorting(int [] arr){
		
		int temp = 0;
		int n = arr.length;
		// Run the loop form 0 to less than  n-1 times

		for(int i=0; i<arr.length-1; i++){
			for(int j = 0; j<n-1-i; j++){
				if(arr[j]> arr[j+1]){
					temp = arr[j];
					arr [j] = arr [j+1];
					arr[j+1] = temp;	
				}
			}
		}

	}	
}