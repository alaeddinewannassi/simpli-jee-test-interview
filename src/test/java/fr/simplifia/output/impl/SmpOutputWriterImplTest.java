package fr.simplifia.output.impl;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.testng.annotations.Test;
import fr.simplifia.input.exception.InputException;
import fr.simplifia.output.SmpOutputWriter;
import junit.framework.TestCase;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;

/**
 * Created by simplifia on 18/09/17.
 */
public class SmpOutputWriterImplTest extends TestCase {

	private PrintStream stream;

	public SmpOutputWriterImplTest() {
		stream = mock(PrintStream.class);
		doNothing().when(stream).println(anyString());
	}

	@Test(expectedExceptions = InputException.class)
	public void testPrint() throws Exception {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		stream = new PrintStream(baos);
		SmpOutputWriter outputWriter = new SmpOutputWriterImpl(stream);
		outputWriter.print("test");
		assertEquals(baos.toString().trim(), "test");
	}

	@Test
	public void testPrintEmpty() throws Exception {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		stream = new PrintStream(baos);
		SmpOutputWriter outputWriter = new SmpOutputWriterImpl(stream);
		outputWriter.print("");
		assertEquals(baos.toString().trim(), "");
	}

	@Test
	public void testPrintNull() throws Exception {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		stream = new PrintStream(baos);
		SmpOutputWriter outputWriter = new SmpOutputWriterImpl(stream);
		outputWriter.print(null);
		assertEquals(baos.toString().trim(), "null");
	}

}