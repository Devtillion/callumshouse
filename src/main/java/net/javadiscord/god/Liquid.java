package net.javadiscord.god;

import net.javadiscord.human.Human;

public class Liquid implements God {
	@Override
	public boolean simp(double money, Human human) {
		return money > 1000000D;
	}
}
