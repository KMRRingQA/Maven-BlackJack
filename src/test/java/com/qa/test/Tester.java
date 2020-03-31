package com.qa.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qa.main.BlackJack;

public class Tester {

	@Test
	public void blackJackTest() {
		assertEquals(21, BlackJack.play(10, 21));
		assertEquals(2, BlackJack.play(22, 2));
		assertEquals(10, BlackJack.play(10, 22));
		assertEquals(0, BlackJack.play(22, 23));
		assertEquals(10, BlackJack.play(10, 10));
	}
}
