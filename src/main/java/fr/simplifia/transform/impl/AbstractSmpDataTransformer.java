package fr.simplifia.transform.impl;

import fr.simplifia.input.validator.SmpInputValidator;
import fr.simplifia.transform.SmpDataTransformer;

public abstract class AbstractSmpDataTransformer implements SmpDataTransformer {

	protected SmpInputValidator validator;

	public AbstractSmpDataTransformer(final SmpInputValidator validator) {
		this.validator = validator;
	}

}
