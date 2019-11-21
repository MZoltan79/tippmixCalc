package application.model.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import application.Odds;
import application.model.Ticket;

public class TicketTest {
	Ticket ticket;
	Odds odds;
	Odds zeroOdds;
	
	@Before
	public void setUp() throws Exception {
		ticket = new Ticket();
		odds = new Odds(2);
		zeroOdds = new Odds(0);
	}

	@Test
	public void testAllWon() {
		ticket.clearOdds();
		ticket.setBet(100);
		ticket.addOdds(odds);
		ticket.addOdds(odds);
		ticket.addOdds(odds);
		ticket.addOdds(odds);
		ticket.addOdds(odds);
		ticket.addOdds(odds);
		assertEquals((Integer)24000, ticket.calculate(4));
	}
	
	@Test
	public void test1failed() {
		ticket.clearOdds();
		ticket.setBet(100);
		ticket.addOdds(odds);
		ticket.addOdds(odds);
		ticket.addOdds(odds);
		ticket.addOdds(odds);
		ticket.addOdds(odds);
		ticket.addOdds(zeroOdds);
		assertEquals((Integer)8000, ticket.calculate(4));
	}
	

}
