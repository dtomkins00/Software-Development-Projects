import static org.junit.Assert.*;

import org.junit.Test;

public class HanoiTest {

	/* test for moving one ring */
	
	@Test
	public void playMoveOneRing() {
		int Rings = 2;
    	Move m;
    	Stack moves;
    	Hanoi game = new Hanoi(Rings);
    	/* check tower sizes */
    	assertEquals(2, game.getTowers()[0].size()); // tower A
    	assertEquals(0, game.getTowers()[2].size()); // tower C
    	game.moveOneRing( 0, 2);
    	assertEquals(1, game.getTowers()[0].size()); // tower A
    	assertEquals(1, game.getTowers()[2].size()); // tower C
    	
    	/* check move was recorded */
    	moves = game.getMoves();
    	m = (Move) moves.pop();
    	assertEquals(m.getFrom(), 0);
    	assertEquals(m.getTo(), 2);
	}
	
	/* tests for moving a pile of rings */
	
    @Test
    public void playTwoRings() {
    	int rings = 2;
    	Move m;
    	Hanoi game = new Hanoi(rings);
    	game.playHanoiMoves();
    	Stack moves = game.getMoves();
    	// Ring moved from A to C
    	m = (Move) moves.pop();
    	assertEquals(0, m.getFrom());
    	assertEquals(2, m.getTo());
    	// Ring moved from A to B
    	m = (Move) moves.pop();
    	assertEquals(0, m.getFrom());
    	assertEquals(1, m.getTo());
    	// Ring moved from C to B
    	m = (Move) moves.pop();
    	assertEquals(2, m.getFrom());
    	assertEquals(1, m.getTo());

    	// ensure tower 1 is empty
    	assertEquals(0,game.getTowers()[0].size());
    	// ensure tower 2 is full
    	assertEquals(rings,game.getTowers()[1].size());
    	// ensure tower 3 is empty
    	assertEquals(0,game.getTowers()[2].size());
    }
    
    @Test
    public void playFiveRings() {
    	int rings = 5;
    	Move m;
    	Hanoi game = new Hanoi(rings);
    	game.playHanoiMoves();
    	Stack moves = game.getMoves();
    	// Ring moved from A to B
    	m = (Move) moves.pop();
    	assertEquals(0, m.getFrom());
    	assertEquals(1, m.getTo());
    	// Ring moved from A to C
    	m = (Move) moves.pop();
    	assertEquals(0, m.getFrom());
    	assertEquals(2, m.getTo());
    	// Ring moved from B to C
    	m = (Move) moves.pop();
    	assertEquals(1, m.getFrom());
    	assertEquals(2, m.getTo());
    	// Ring moved from A to B
    	m = (Move) moves.pop();
    	assertEquals(0, m.getFrom());
    	assertEquals(1, m.getTo());
    	// Ring moved from C to A
    	m = (Move) moves.pop();
    	assertEquals(2, m.getFrom());
    	assertEquals(0, m.getTo());
    	// Ring moved from C to B
    	m = (Move) moves.pop();
    	assertEquals(2, m.getFrom());
    	assertEquals(1, m.getTo());
    	// Ring moved from A to B
    	m = (Move) moves.pop();
    	assertEquals(0, m.getFrom());
    	assertEquals(1, m.getTo());
    	// Ring moved from A to C
    	m = (Move) moves.pop();
    	assertEquals(0, m.getFrom());
    	assertEquals(2, m.getTo());
    	// Ring moved from B to C
    	m = (Move) moves.pop();
    	assertEquals(1, m.getFrom());
    	assertEquals(2, m.getTo());
    	// Ring moved from B to A
    	m = (Move) moves.pop();
    	assertEquals(1, m.getFrom());
    	assertEquals(0, m.getTo());
    	// Ring moved from C to A
    	m = (Move) moves.pop();
    	assertEquals(2, m.getFrom());
    	assertEquals(0, m.getTo());
    	// Ring moved from B to C
    	m = (Move) moves.pop();
    	assertEquals(1, m.getFrom());
    	assertEquals(2, m.getTo());
    	// Ring moved from A to B
    	m = (Move) moves.pop();
    	assertEquals(0, m.getFrom());
    	assertEquals(1, m.getTo());
    	// Ring moved from A to C
    	m = (Move) moves.pop();
    	assertEquals(0, m.getFrom());
    	assertEquals(2, m.getTo());
    	// Ring moved from B to C
    	m = (Move) moves.pop();
    	assertEquals(1, m.getFrom());
    	assertEquals(2, m.getTo());
    	// Ring moved from A to B
    	m = (Move) moves.pop();
    	assertEquals(0, m.getFrom());
    	assertEquals(1, m.getTo());
    	// Ring moved from C to A
    	m = (Move) moves.pop();
    	assertEquals(2, m.getFrom());
    	assertEquals(0, m.getTo());
    	// Ring moved from C to B
    	m = (Move) moves.pop();
    	assertEquals(2, m.getFrom());
    	assertEquals(1, m.getTo());
    	// Ring moved from A to B
    	m = (Move) moves.pop();
    	assertEquals(0, m.getFrom());
    	assertEquals(1, m.getTo());
    	// Ring moved from C to A
    	m = (Move) moves.pop();
    	assertEquals(2, m.getFrom());
    	assertEquals(0, m.getTo());
    	// Ring moved from B to C
    	m = (Move) moves.pop();
    	assertEquals(1, m.getFrom());
    	assertEquals(2, m.getTo());
    	// Ring moved from B to A
    	m = (Move) moves.pop();
    	assertEquals(1, m.getFrom());
    	assertEquals(0, m.getTo());
    	// Ring moved from C to A
    	m = (Move) moves.pop();
    	assertEquals(2, m.getFrom());
    	assertEquals(0, m.getTo());
    	// Ring moved from C to B
    	m = (Move) moves.pop();
    	assertEquals(2, m.getFrom());
    	assertEquals(1, m.getTo());
    	// Ring moved from A to B
    	m = (Move) moves.pop();
    	assertEquals(0, m.getFrom());
    	assertEquals(1, m.getTo());
    	// Ring moved from A to C
    	m = (Move) moves.pop();
    	assertEquals(0, m.getFrom());
    	assertEquals(2, m.getTo());
    	// Ring moved from B to C
    	m = (Move) moves.pop();
    	assertEquals(1, m.getFrom());
    	assertEquals(2, m.getTo());
    	// Ring moved from A to B
    	m = (Move) moves.pop();
    	assertEquals(0, m.getFrom());
    	assertEquals(1, m.getTo());
    	// Ring moved from C to A
    	m = (Move) moves.pop();
    	assertEquals(2, m.getFrom());
    	assertEquals(0, m.getTo());
    	// Ring moved from C to B
    	m = (Move) moves.pop();
    	assertEquals(2, m.getFrom());
    	assertEquals(1, m.getTo());
    	// Ring moved from A to B
    	m = (Move) moves.pop();
    	assertEquals(0, m.getFrom());
    	assertEquals(1, m.getTo());

    	// ensure tower 1 is empty
    	assertEquals(0,game.getTowers()[0].size());
    	// ensure tower 2 is full
    	assertEquals(rings,game.getTowers()[1].size());
    	// ensure tower 3 is empty
    	assertEquals(0,game.getTowers()[2].size());
    }
    
    @Test
    public void playTenRings() {
    	int rings = 10;
    	Hanoi game = new Hanoi(rings);
    	game.playHanoiMoves();
    	assertEquals(0,game.getTowers()[0].size());
    	assertEquals(rings,game.getTowers()[1].size());
    	assertEquals(0,game.getTowers()[2].size());
    }
}
