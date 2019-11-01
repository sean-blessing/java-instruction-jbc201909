package business;

import static org.junit.Assert.*;

import org.junit.Test;

public class PirateCreateTest {

	@Test
	public void testPirateCreate() {
		Pirate p = new Pirate("Captain Hook");
		// assert - expected, actual
		assertEquals("Captain Hook", p.getName());
		assertEquals(4, p.getLimbsRemaining());
	}
	
	@Test
	public void testOctoPirate() {
		Pirate p = new Pirate("Octo Pete",8);
		assertEquals("Octo Pete", p.getName());
		assertEquals(8, p.getLimbsRemaining());
	}

	@Test
	public void testPeglegPirate() {
		Pirate p = new Pirate("Stubby",3);
		assertEquals("Stubby", p.getName());
		assertEquals(3, p.getLimbsRemaining());
	}

}
