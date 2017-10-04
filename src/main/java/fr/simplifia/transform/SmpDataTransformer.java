package fr.simplifia.transform;

import fr.simplifia.input.exception.InputException;

public interface SmpDataTransformer {

	public String transform(final String input) throws InputException;
}
