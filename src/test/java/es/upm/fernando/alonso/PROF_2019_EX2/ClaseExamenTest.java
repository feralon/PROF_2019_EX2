package es.upm.fernando.alonso.PROF_2019_EX2;

import static org.junit.Assert.assertArrayEquals;

import org.junit.*;

/**
* 
* @author Fernando
*
*/
public class ClaseExamenTest
{
	@Test
	public void testN6() throws EntradaInvalidaException {
		assertArrayEquals(new Integer[] {2,3},ClaseExamen.primos(6).toArray(new Integer[1]));
	}
	
	@Test
	public void testN13() throws EntradaInvalidaException {
		assertArrayEquals(new Integer[] {13},ClaseExamen.primos(13).toArray(new Integer[1]));
	}
	
	@Test
	public void testN25() throws EntradaInvalidaException {
		assertArrayEquals(new Integer[] {5,5},ClaseExamen.primos(25).toArray(new Integer[1]));
	}
	
	@Test(expected = EntradaInvalidaException.class)
	public void testEntradaInvalida() throws EntradaInvalidaException {
		ClaseExamen.primos(-1);
	}
}
