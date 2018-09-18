package pucrs.s2b.pong;

import static org.junit.Assert.*;

import org.junit.Test;

public class PongTest {

	@Test
	public void GivenGameStartWhenGetIsEndGameThenEndIsFalse() {
		Pong p = new Pong(Player.CPU_EASY, Player.CPU_EASY);
		boolean expected = false;
		boolean actual = p.isEndGame();
		assertEquals(expected, actual);
	}
	
	@Test
	public void GivenGameStartAndPlayer1With15PointsWhenGetIsEndGameThenEndIsTrue() {
		Pong p = new Pong(Player.CPU_EASY, Player.CPU_EASY);
		Player p1 = p.getPlayer1();
		p1.points = 15;
		boolean expected = true;
		boolean actual = p.isEndGame();
		assertEquals(expected, actual);
	}

}
