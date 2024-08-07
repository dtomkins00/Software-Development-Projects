import static org.junit.Assert.*;

import org.junit.Test;

public class SortTest {

	public boolean isSorted(int[] arr){
		for(int i = 0; i < arr.length-1;i++)
			if(arr[i] > arr[i+1])
				return false;
		return true;
	}

	@Test
	public void testQ2Empty() {
		int[] arr = {};
		Sort.sort(arr);
		assertTrue(isSorted(arr));		

	}
	
	@Test
	public void testQ2() {
		int[] arr = {1,5,2,4};
		Sort.sort(arr);
		assertTrue(isSorted(arr));		

	}

	@Test
	public void testpreSortedQ2() {
		int[] arr = {1,2,3,4,5};
		Sort.sort(arr);
		assertTrue(isSorted(arr));		

	}
	
}
