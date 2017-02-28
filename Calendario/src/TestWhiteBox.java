/**
 * 
 */
package calendario;



import org.junit.Assert;
import org.junit.Test;

/**
 * @author Porfirio
 *
 */
public class TestWhiteBox {
	public Assert ass;
	
	
	@Test
	public void testCalendWB1() {
		ass.assertEquals(Calendario.calend(29,"gennaio",2011),"Sabato");
	}
	@Test
	public void testCalendWB2() {
		ass.assertEquals(Calendario.calend(29,"marzo",2011),"Martedi");
	}
	@Test
	public void testCalendWB3() {
		ass.assertEquals(Calendario.calend(29,"maggio",2011),"Domenica");
	}
	@Test
	public void testCalendWB4() {
		ass.assertEquals(Calendario.calend(29,"luglio",2011),"Venerdi");
	}
	@Test
	public void testCalendWB5() {
		ass.assertEquals(Calendario.calend(29,"agosto",2011),"Lunedi");
	}
	@Test
	public void testCalendWB6() {
		ass.assertEquals(Calendario.calend(29,"ottobre",2011),"Sabato");
	}
	@Test
	public void testCalendWB7() {
		ass.assertEquals(Calendario.calend(29,"dicembre",2011),"Giovedi");
	}
	@Test
	public void testCalendWB8() {
		ass.assertEquals(Calendario.calend(28,"febbraio",2011),"Lunedi");
	}
	@Test
	public void testCalendWB9() {
		ass.assertEquals(Calendario.calend(17,"aprile",2011),"Domenica");
	}

}
