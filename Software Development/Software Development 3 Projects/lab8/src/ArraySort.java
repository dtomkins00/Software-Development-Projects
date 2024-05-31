import java.util.ArrayList;
import java.util.Iterator;

public class ArraySort {

	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int cur = arr[i];
			int j = i -1;
			while (j >= 0 && arr[j] > cur) {
				arr[j+1] = arr[j--];
				arr[j+1] = cur;
			}
		}
	}

	// Part 3: complete implementation
	public static void bubbleSort(int[] arr){
		int n = arr.length;
		for (int i = 0; i < n-1; i++)
			for (int j = 0; j < n-i-1; j++)
				if (arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}

	}

	// Part 5 : complete implementation
	public static void quickSort(ArrayList<Integer> S){
		//If the size of (input) S is less than or equal to one, then S is sorted so you can return (i.e. base case)
		if (S.size() <= 1) 
			return;

		//Selects the last element of S to be the pivot and creates 3 new ArrayLists of type Integer.
		int pivot = S.get(S.size()-1); 
		int curr;
		ArrayList<Integer> L = new ArrayList<Integer>(); //Stores elements of S less than the pivot
		ArrayList<Integer> E = new ArrayList<Integer>(); //Stores elements of S equal to the pivot
		ArrayList<Integer> G = new ArrayList<Integer>(); //Stores elements of S greater than the pivot

		//While S isn't empty, get and delete the first element and add it to one of L, E and G,
		//according to how it compares with the pivot.
		while (!S.isEmpty()){
			curr = S.remove(0);
			if (curr < pivot)
				L.add(curr); 
			else if (curr == pivot)
				E.add(curr);
			else
				G.add(curr);

		}

		//After the while loop, recursively call quicksort(L) and quicksort(G)
		quickSort(L);
		quickSort(G);

		//Add all elements back to S in this order: L, E and G. (elements are in the same order in the 3 ArrayLists).
//		L.add(pivot);
		S.addAll(L);
		S.addAll(E);
		S.addAll(G);
	}

	// predicate to check if array is sorted
	public static boolean isSorted(int[] arr){
		for(int i = 0; i < arr.length-1;i++)
			if(arr[i] > arr[i+1])
				return false;
		return true;
	}

	// predicate to check if arrayList is sorted
	public static boolean isSorted(ArrayList<Integer> arr){
		Iterator i = arr.iterator();
		int val;
		if(i.hasNext())
			val = (int) i.next();
		else
			return true;
		while(i.hasNext()){
			int nv = (int) i.next();
			if(val > nv)
				return false;
			val = nv;
		}
		return true;
	}


	/*
	 * Helper printing methods for testing
	 */
	private static void printIntArray(int[] arr){
		System.out.print("[ ");
		for(Integer i : arr){
			System.out.print(i + " ");
		}
		System.out.println(" ]");
	}

	private static void printIntArrayList(ArrayList<Integer> arr){
		System.out.print("[ ");
		for(Integer i : arr){
			System.out.print(i + " ");
		}
		System.out.println(" ]");
	}


	public static void main(String[] args){
		// testing part1
		int[] arr1 = {5,4,3,2,1};
		bubbleSort(arr1);
		printIntArray(arr1);

		// testing part2
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(3);
		arr2.add(1);
		arr2.add(6);
		arr2.add(5);
		quickSort(arr2);		
		printIntArrayList(arr2);
		// {5,4,3,5,1};

	}
}