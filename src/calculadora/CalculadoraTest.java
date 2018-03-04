package calculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {
	 
	static Calculadora calcu;
	
	@BeforeClass
	public static void preCalcu () {
		System.out.println("PREPARANDO PRUEBAS");
	}
	
	
	@AfterClass
	public static void postCalcu() {
		System.out.println("FINALIZANDO LAS PRUEBAS");
		calcu =null ;
	}
	public void creaCalculadora() {
		calcu = new Calculadora(20,30);
		System.out.println("inicio prueba");
	}
	
	@After
	public void borrarCalculadora() {
	    calcu = null;
		//System.out.println("fin prueba");
	}

	@Test
	public void testSuma() {
		//Calculadora calcu = new Calculadora (20,30);
		int resultado = calcu.suma();
		assertEquals(50,resultado);
	}

	@Test
	public void testResta() {
		//Calculadora calcu = new Calculadora (20,30);
		int resultado = calcu.resta();
		assertEquals(-10,resultado);
	}

	@Test
	public void testMultiplicacion() {
		//Calculadora calcu = new Calculadora (20,30);
		int resultado = calcu.multiplicacion();
		assertEquals("Fallo en la multiplicación ",600,resultado);
	}

	@Test
	public void testDivision() {
		//Calculadora calcu = new Calculadora (8,2);
		int resultado = calcu.division();
		assertEquals("Fallo en la division ",4,resultado);
	}
	
	@Test
	public void testDivisionCero() {
		try {
		//Calculadora calcu = new Calculadora (13,0);
		int resultado = calcu.division();
		
	} catch (ArithmeticException e) {
		//PRUEBA EXITOSA
		fail(("FALLO DIVISIÓN ENTRE 0"));
	}
		
	}
	
	@Test
	public void testNum1EsMaoyr() {
		//Calculadora calcu = new Calculadora (20,30);
		boolean resultado = calcu.num1EsMayor();
		//assertTrue("no es true",resultado); // --> prueba fallida
		assertFalse(resultado);
	}
	
	@Test
	public void testDivisionPorCero2() {
		//Calculadora calcu = new Calculadora (20,0);
		Integer resultado = calcu.division2();
		assertNotNull(resultado);
		}
		
	@Test (expected=java.lang.ArithmeticException.class)
	public void testDivisionPorCero3() {
	//	Calculadora calcu = new Calculadora (20,2);
		int resultado = calcu.division3();
		}
		
	
}
	
