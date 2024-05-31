/**
 * @author dt52
 *
 */
public class ASearch {


	private Entry[] catalogue;
	private int current;

	/*
	 * Assume 10 entries
	 */
	public ASearch(){
		catalogue = new Entry[10];
		current = 0;
	}

	/*
	 * Ignores adding if full (should really be handled by exception...)
	 */
	public void addEntry(Entry e){
		if(current < 10){
			catalogue[current++] = e;
		}
	}

	/*
	 * Part 2: complete implementation
	 */
	public int linearSearch(String name){
		for(int i = 0; i < current; i++) 
		{ 
			if(catalogue[i].getName().equals(name)) 
				return catalogue[i].getNumber(); 
		}
		return -1;
	}

	/*
	 * Part 4: complete implementation
	 */
	public int binarySearch(int first,int last,String name){
		System.out.println(first + "," + last);
		if (first > last) {
			return -1;
		}
		else {
			int middle = (first + last)/2;
			String middleName = catalogue[middle].getName();
			if (middleName.equals(name))
				return catalogue[middle].getNumber();
			else if (catalogue[middle].getName().compareTo(name) > 0)
				return binarySearch(first, middle - 1, name);
			else 
				return binarySearch(middle + 1, last, name);
		}
	}

	// helper method
	public int bSearch(String name){
		return binarySearch(0,current,name);
	}


}
