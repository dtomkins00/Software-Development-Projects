import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TrieTest {

	/*
	 * Part 1: complete
	 */
	
	Trie trie;
	
	@Before
	public void setup(){
		trie = new Trie();
	}
	
	
	@Test
	public void countAllWordsEmptyTest() {
		// test countAllWords() for an empty trie
		assertEquals(0, trie.countAllWords());
	}
	
	@Test
	public void countAllWordsTest() {
		// add some words to the trie
		trie.insertString("apple");
		trie.insertString("apricot");
		trie.insertString("bear");
		
		// test countAllWords() for the trie
		assertEquals(3, trie.countAllWords());
	}
	
	/*
	 * Optional part
	 */
	
//	@Test
//	public void  areWordsWithPrefixTestTrue() {
//		trie.insertString("balls");
//		trie.insertString("balloon");
//		trie.insertString("ball");
//		trie.insertString("football");
//		assertTrue(trie.areWordsWithPrefix("ball"));
//	}
	
//	@Test
//	public void  areWordsWithPrefixTestFalse() {
//		trie.insertString("balls");
//		trie.insertString("balloon");
//		trie.insertString("ball");
//		trie.insertString("football");
//		assertFalse(trie.areWordsWithPrefix("baboon"));
//	}
	
	/*
	 * More trie tests
	 */
	
	@Test
	public void containsWordTrue() {
		trie.insertString("balls");
		trie.insertString("a");
		trie.insertString("balloon");
		assertTrue(trie.containsString("balls"));
		assertTrue(trie.containsString("balloon"));
		assertTrue(trie.containsString("a"));
	}
	
	@Test
	public void containsWordFalse() {
		trie.insertString("balls");
		assertFalse(trie.containsString("bug"));
	}

}
