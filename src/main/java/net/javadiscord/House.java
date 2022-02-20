package net.javadiscord;

import lombok.SneakyThrows;
import net.javadiscord.exception.EclipseUserException;
import net.javadiscord.god.*;
import net.javadiscord.human.Human;

public class House {

	private House() {}

	@SneakyThrows
	public static void configureEclipse() {
		throw new EclipseUserException();
	}

	public static void main(String[] args) {
		configureEclipse(); // uncomment if using eclipse
		var human = new Human("BeamedCallum", true, false);
		var human2 = new Human("CallumsDad", false, true);
		System.out.println("Does Moon Read Callum Message: " + new Moon().simp(100D, human));
		System.out.println("Does Pokiman Read Callum Message: " + new Pokiman().simp(100D, human));
	}

}
