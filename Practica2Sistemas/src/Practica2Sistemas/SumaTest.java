import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumaTest {
	
	Sum prueba;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		prueba = new Sum ();
	}

	@AfterEach
	void tearDown() throws Exception {
		prueba = null ; 
	}

	
	@Test
	void testCheckArgValue_correcto() {
		try {
		prueba.checkArgValue(4);
		assertTrue(true);
		} catch (IOException e) {
			assertTrue(false);
		}
		}
	
	@Test
	public void testCheckArgValue_no_correcto() {
	  try {
		prueba.checkArgValue(-4);
	    assertTrue(false);
	  } catch(IOException e) {
		assertTrue(true);
	  }
	}

	@Test
	void testSumReales_correcto() {
		
		try {
		float resultadoPrueba = prueba.sumReales(3f,5f,1f);
		float resultadoReal = 9;
		assertEquals (resultadoPrueba,resultadoReal);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	
	@Test
	void testSumEnteros() {
		try {
			int resultadoPrueba = prueba.sumEnteros(3, 2);
			int resultadoReal = 5;
			assertEquals (resultadoPrueba, resultadoReal);
		} catch (IOException e) {
			System.out.println(e);}
	}

	@Test
	void testSumAcumulativo() {
		try {
			prueba.classNumber=10;
			int resultadoPrueba = prueba.sumAcumulativo(10);
			int resultadoReal = 20;
			assertEquals (resultadoPrueba, resultadoReal);
		} catch (IOException e) {
			System.out.println(e);
		}
			
	}

}
