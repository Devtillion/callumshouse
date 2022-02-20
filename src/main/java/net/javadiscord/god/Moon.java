package net.javadiscord.god;

import net.javadiscord.human.Human;

import java.util.Locale;

public class Moon implements God {
	@Override
	public boolean simp(double money, Human human) {
		return money > 69420D || human.name().toUpperCase(Locale.ROOT).contains("CALLUM");
	}
}