package fr.simplifia.transform.impl;

import java.util.Locale;

import fr.simplifia.input.validator.SmpInputValidator;
import fr.simplifia.transform.SmpDataTransformer;



public class SmpDataTransformerFactory {

	public static SmpDataTransformer fromLocale(final Locale locale,SmpInputValidator validator){
        final SmpDataTransformer result;
        switch(locale.getLanguage()){
        case "en" : 
        		return new SmpNewDataTransformer(validator);
        
        	default:
               result = new SmpDefaultDataTransformer(validator);
               break;
        }
        return result;
    }
	
}
