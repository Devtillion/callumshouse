package net.javadiscord.exception;

import lombok.SneakyThrows;

public class EclipseUserException extends Exception {

	public EclipseUserException() {
		super("Eclipse user detected");
	}

}
