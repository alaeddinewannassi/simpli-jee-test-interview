package fr.simplifia.transform;

import fr.simplifia.input.validator.SmpInputValidator;
import fr.simplifia.transform.impl.SmpNewDataTransformer;
import junit.framework.TestCase;
import org.mockito.Mockito;
import org.testng.annotations.Test;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doNothing;

public class AbstractSmpDataTransformerTest extends TestCase{

	private SmpInputValidator validator;

	public AbstractSmpDataTransformerTest() {
		validator = Mockito.mock(SmpInputValidator.class);
		doNothing().when(validator).validateInput(anyString());
	}

	@Test
	public void testTransformOk() throws Exception {
		SmpDataTransformer transformer = new SmpNewDataTransformer(validator);
		assertEquals(transformer.transform("t"), "t : Welcome to Simplifia!");
	}

	@Test(expectedExceptions = NullPointerException.class)
	public void testTransformNotOk() throws Exception {
		SmpDataTransformer transformer = new SmpNewDataTransformer(validator);
		transformer.transform("t");

	}

	@Test
	public void testTransformEmpty() throws Exception {
		SmpDataTransformer transformer = new SmpNewDataTransformer(validator);
		assertEquals(transformer.transform(""), " : Welcome to Simplifia!");
	}

	@Test
	public void testTransformNull() throws Exception {
		SmpDataTransformer transformer = new SmpNewDataTransformer(validator);
		assertEquals(transformer.transform(null), "null : Welcome to Simplifia!");
	}

}