package pucrs.s2b.pong;

import static org.junit.Assert.*;
import org.junit.Test;

public class PlayerTest{

	@Test
	public void giveAKeyboardWhenGetTypeThenTypeIsKeyboard(){
		Player p = new Player(Player.KEYBOARD);
		int expected = Player.KEYBOARD;
		int actual = p.getType();
		assertEquals(expected, actual);
	}
	
	@Test
	public void giveAInvalidPlayerWhenGetTypeThenTypeIsCpuEasy(){
		Player p = new Player(100);
		int expected = Player.CPU_EASY;
		int actual = p.getType();
		assertEquals(expected, actual);
	}
}