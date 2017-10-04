package fr.simplifia.input.locale;

import fr.simplifia.input.exception.InputException;
import org.apache.commons.lang.StringUtils;

import java.util.Locale;
import java.util.Objects;

import static org.apache.commons.lang.StringUtils.isEmpty;

public class LocaleExtractor {

    public static Locale toLocale(final String input) {
        Objects.requireNonNull(input);
        final String cleanedInput = StringUtils.trim(input).toLowerCase();
        final Locale result = extractLocale(cleanedInput);
        if (!localeIsValid(result)) {
            throw new InputException("given Locale is not handled");
        }

        return result;
    }

    private static Locale extractLocale(final String input) {
        switch (input) {
            case "fr":
                return Locale.FRENCH;
            case "en":
            	return Locale.ENGLISH;

            default:
                return null;

        }
    }

    private static boolean localeIsValid(Locale result) {
        return result != null && !isEmpty(result.getLanguage());
    }
}
