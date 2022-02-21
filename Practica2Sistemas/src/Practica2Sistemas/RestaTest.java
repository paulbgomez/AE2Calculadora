package Practica2Sistemas;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RestaTest {

	Resta prueba; 
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		prueba = new Resta();
		
	}

	@AfterEach
	void tearDown() throws Exception {
		
		prueba = null ; 
	}

	@Test
	void testCheckArgValue_Correcto() {
		
		try {
			prueba.checkArgValue(4f);
			assertTrue(true);
		} catch (IOException e) {
			assertTrue(false);
		}
	}
	
	@Test
	void testCheckArgValue_No_Correcto() {
		
		try {
			prueba.checkArgValue(-4f);
			assertTrue(false);
		} catch (IOException e) {
			assertTrue(true);
		}
	}

	@Test
	void testRestaRealesFloatFloat() {
		try {
		float resultadoPrueba = prueba.restaReales(3f, 4f);
		float resultadoReal = -1;
		assertEquals (resultadoPrueba, resultadoReal);
	} catch (IOException e) {
		System.out.println(e);
	}
	}

	@Test
	void testRestaRealesFloatFloatFloat() {
		try {
			float resultadoPrueba = prueba.restaReales(3f, 4f,5f);
			float resultadoReal = -6f;
			assertEquals (resultadoPrueba, resultadoReal);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	@Test
	void testRestaEnteros() {
		try {
			int resultadoPrueba = prueba.restaEnteros(3, 4);
			int resultadoReal = -1;
			assertEquals (resultadoPrueba, resultadoReal);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	@Test
	void testRestaAcumulativa() {
		try {
			prueba.classNumber = 7;
			int resultadoPrueba = prueba.restaAcumulativa(3);
			int resultadoReal = 4;
			assertEquals (resultadoPrueba, resultadoReal);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
