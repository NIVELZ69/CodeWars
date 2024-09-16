package dad.codewars;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReversedStringsTest {

	@Test
	public void testBasico() {
		assertEquals("dlroW", ReversedStrings.solution("World"));
	}
	
	@Test
	public void testConEspacio() {
		assertEquals("oic a pse", ReversedStrings.solution("esp a cio"));
	}
	
	@Test
	public void testConNumeros() {
		assertEquals("321abeurp", ReversedStrings.solution("prueba123"));
	}
	
	@Test
	public void testPalindromo() {
		assertEquals("racecar", ReversedStrings.solution("racecar"));
	}
	
}
