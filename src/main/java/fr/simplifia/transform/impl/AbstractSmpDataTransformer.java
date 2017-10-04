package fr.simplifia.transform;

import fr.simplifia.input.validator.SmpInputValidator;

public class SmpDataTransformer {

    private SmpInputValidator validator;
    private static final String MESSAGE = " : bienvenue chez Simplifia!";
    public SmpDataTransformer(final SmpInputValidator validator) {
        this.validator = validator;
    }

    public String transform(final String input){
        validator.validateInput(input);
        final StringBuffer buffer = new StringBuffer();
        buffer.append(input);
        buffer.append(MESSAGE);
        return buffer.toString();
    }

}
