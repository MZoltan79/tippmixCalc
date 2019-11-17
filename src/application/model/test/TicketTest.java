package application.model.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import application.model.Ticket;

public class TicketTest {
	Ticket ticket;

	@Before
	public void setUp() throws Exception {
		ticket = new Ticket();
	}

	@Test
	public void testAllWon() {
		ticket.clearOdds();
		ticket.setBet(100);
		ticket.addOdds(2);
		ticket.addOdds(2);
		ticket.addOdds(2);
		ticket.addOdds(2);
		ticket.addOdds(2);
		ticket.addOdds(2);
		assertEquals((Integer)24000, ticket.calculate(4));
	}
	
	@Test
	public void test1failed() {
		ticket.clearOdds();
		ticket.setBet(100);
		ticket.addOdds(2);
		ticket.addOdds(2);
		ticket.addOdds(2);
		ticket.addOdds(2);
		ticket.addOdds(2);
		ticket.addOdds(0);
		assertEquals((Integer)8000, ticket.calculate(4));
	}
	

}
