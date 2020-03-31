package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		BlackJack blackJack = new BlackJack();
		System.out.println(blackJack.play(10, 21));
		System.out.println(blackJack.play(20, 18));
		System.out.println(blackJack.play(1, 22));
		System.out.println(blackJack.play(22, 2));
		System.out.println(blackJack.play(22, 23));

	}

}
