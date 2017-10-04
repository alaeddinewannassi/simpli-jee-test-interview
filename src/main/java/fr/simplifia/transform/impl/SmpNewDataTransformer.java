package fr.simplifia.transform.impl;

import fr.simplifia.input.validator.SmpInputValidator;

public class SmpNewDataTransformer extends AbstractSmpDataTransformer {

	private static final String MESSAGE = " : Welcome to Simplifia!";

	public SmpNewDataTransformer(SmpInputValidator validator) {
		super(validator);
	}

	public String transform(final String input) {
		validator.validateInput(input);
		final StringBuffer buffer = new StringBuffer();
		buffer.append(input);
		buffer.append(MESSAGE);
		return buffer.toString();
	}

}
