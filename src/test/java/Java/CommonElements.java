package Java;

import java.util.HashSet;

public class CommonElements {
	//Method to find and print common elements between two arrays
	public static void findCommonElements(int[] array1, int[] array2) {
		HashSet<Integer> set1 = new HashSet<>(); //Store unique elements of array1
		HashSet<Integer> commonSet = new HashSet<>(); // Store common elements
		
		//Add all elements of array1 to the HashSet
		for (int num : array1) {
			set1.add(num);
		}
		
		//Check if elements in array2 exist in set1 9which contains array1's elements)
		for (int num : array2) {
			if (set1.contains(num)) {
				commonSet.add(num); //Add common elements to the result set
			}
		}
		
		//Print the common elements
		System.out.print("Common Elements: ");
		System.out.println(commonSet);
	}
	
	public static void main (String[] args) {
		//Define two input arrays (given in the question)
		int[] array1 = {1, 4, 5, 9, 2};
		int[] array2 = {1, 7, 3, 4, 5};
		
		//call the function to find common elements
		findCommonElements(array1, array2);
	}

}

