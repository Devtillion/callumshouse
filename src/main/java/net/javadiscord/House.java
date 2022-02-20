package net.javadiscord;

import lombok.SneakyThrows;
import net.javadiscord.exception.EclipseUserException;
import net.javadiscord.human.Human;

public class House {

	private House() {}

	@SneakyThrows
	public static void configureEclipse() {
		throw new EclipseUserException();
	}

	public static void main(String[] args) {
		//configureEclipse(); // uncomment if using eclipse
		var human = new Human("Callum", true);
		var human2 = new Human("CallumsDad", false, true)
	}

}
