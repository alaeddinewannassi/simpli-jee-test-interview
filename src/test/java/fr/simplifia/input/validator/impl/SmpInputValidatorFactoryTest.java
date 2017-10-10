package fr.simplifia.input.validator.impl;

import java.util.Locale;
import org.testng.annotations.Test;

import junit.framework.TestCase;

/**
 * Created by simplifia on 18/09/17.
 */

public class SmpInputValidatorFactoryTest extends TestCase {
    @Test
    public void testFromLocaleFrench() throws Exception {
        assertTrue(SmpInputValidatorFactory.fromLocale(Locale.FRENCH) instanceof SmpDefaultInputValidator);
    }

    @Test
    public void testFromLocaleEnglish() throws Exception {
        assertTrue(SmpInputValidatorFactory.fromLocale(Locale.ENGLISH) instanceof SmpNewInputValidator);
    }

}