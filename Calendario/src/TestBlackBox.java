/**
 * 
 */
package calendario;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Porfirio
 *
 */
public class TestBlackBox {

	/**
	 * Test method for {@link calendario.Calendario#calend(int, java.lang.String, int)}.
	 */
	@Test
	public void testCalend1() {
		assertEquals(Calendario.calend(13,"aprile",2011),"Mercoledi");
	}
	@Test
	public void testCalend2() {
		assertEquals(Calendario.calend(0,"aprile",2011),"Errore");
	}
	@Test
	public void testCalend3() {
		assertEquals(Calendario.calend(-42,"aprile",2011),"Errore");
	}
	@Test
	public void testCalend4() {
		assertEquals(Calendario.calend(28,"aprile",2011),"Giovedi");
	}
	@Test
	public void testCalend5() {
		assertEquals(Calendario.calend(29,"aprile",2011),"Venerdi");
	}
	@Test
	public void testCalend6() {
		assertEquals(Calendario.calend(30,"aprile",2011),"Sabato");
	}
	@Test
	public void testCalend7() {
		assertEquals(Calendario.calend(31,"aprile",2011),"Errore");
	}
	@Test
	public void testCalend8() {
		assertEquals(Calendario.calend(100,"aprile",2011),"Errore");
	}
	@Test
	public void testCalend9() {
		assertEquals(Calendario.calend(13,"brumaio",2011),"Errore");
	}
	@Test
	public void testCalend10() {
		assertEquals(Calendario.calend(13,"",2011),"Errore");
	}
	@Test
	public void testCalend11() {
		assertEquals(Calendario.calend(13,"aprile",-4004),"Errore");
	}
	@Test
	public void testCalend12() {
		assertEquals(Calendario.calend(13,"aprile",1582),"Errore");
	}
	@Test
	public void testCalend13() {
		assertEquals(Calendario.calend(13,"aprile",1583),"Mercoledi");
	}
	@Test
	public void testCalend14() {
		assertEquals(Calendario.calend(31,"giugno",2011),"Errore");
	}
	@Test
	public void testCalend15() {
		assertEquals(Calendario.calend(31,"settembre",2011),"Errore");
	}
	@Test
	public void testCalend16() {
		assertEquals(Calendario.calend(31,"novembre",2011),"Errore");
	}
	@Test
	public void testCalend17() {
		assertEquals(Calendario.calend(31,"febbraio",2011),"Errore");
	}
	@Test
	public void testCalend18() {
		assertEquals(Calendario.calend(30,"febbraio",2011),"Errore");
	}
	@Test
	public void testCalend19() {
		assertEquals(Calendario.calend(29,"febbraio",2011),"Errore");
	}
	@Test
	public void testCalend20() {
		assertEquals(Calendario.calend(29,"febbraio",2012),"Mercoledi");
	}
	@Test
	public void testCalend21() {
		assertEquals(Calendario.calend(29,"febbraio",1700),"Errore");
	}
	@Test
	public void testCalend22() {
		assertEquals(Calendario.calend(29,"febbraio",2000),"Martedi");
	}

}
