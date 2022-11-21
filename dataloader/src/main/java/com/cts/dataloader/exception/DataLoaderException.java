package com.cts.dataloader.exception;

public class DataLoaderException extends Exception {

	public DataLoaderException() {
		super();
	}

	public DataLoaderException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DataLoaderException(String message, Throwable cause) {
		super(message, cause);
	}

	public DataLoaderException(String message) {
		super(message);
	}

	public DataLoaderException(Throwable cause) {
		super(cause);
	}

}
