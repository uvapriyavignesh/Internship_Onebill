package com.te.learn.basic.exception;

public class ApplicationRun {

	public static void main(String[] args) throws CheckedCustomException {
		boolean check = true;
		if (check) {
			throw new CustomExcetion("Some message!");
		}

		throw new CheckedCustomException("Checked exception");
	}
}
