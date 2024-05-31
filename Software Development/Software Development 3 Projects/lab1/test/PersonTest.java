import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PersonTest {

	Person p;
	
	@Before
	public void testMakePerson() {
		p = new Person("john","bla",10);
	}
	
	@Test
	public void testSetFirstName() {
		assertNotNull(p);
		p.setFirstName("andrew");
		assertEquals("andrew",p.getFirstName());
	}

	@Test
	public void testSetLastName() {
		p.setLastName("Jones");
		assertEquals("Jones",p.getLastName());
	}
	
	//Test to check that setAge(int age) sets the age field of the object to the provided value

	@Test
	public void testSetAge() {
		// set the age for person p
		p.setAge(42);
		assertEquals(42, p.getAge());
		// test the returned value of p.getAge()
	}
}
