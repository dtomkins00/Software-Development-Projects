import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CollectionTest {

	Collection c;
	@Before
	public void setup(){
		c = new Collection();
	}
	
	//Test to check what happens when there is no maximum age element - will return -1
	
	@Test
	public void testEmptyMaxAge() {
		c.maxAge();
		assertEquals(-1, c.maxAge());
	}
	
    //Test to check what happens when there is one element featuring a maximum age
	
	@Test
	public void testOneElementMaxAge() {
		c.maxAge();
		c.addPerson("Alexis", "Kerib", 47);
		assertEquals(47, c.maxAge());
	}
	
	//Test to check what happens when there are three elements with an age, using the largest age to test
	
	@Test
	public void testThreeElementsMaxAge() {
		c.maxAge();
		c.addPerson("Alexis", "Kerib", 47);
		c.addPerson("Michael", "Ward", 38);
		c.addPerson("Catherine", "Wilson", 25);
		assertEquals(47, c.maxAge());
	}
}
