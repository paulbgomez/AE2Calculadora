package Practica2Sistemas;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DivisionTest {

	Division prueba;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		prueba = new Division();
		
	}

	@AfterEach
	void tearDown() throws Exception {
		
		prueba = null ; 
	}
	
	@Test
	void testCheckArgValue_No_Negativo() {
		try {
			prueba.checkArgValue(-9);
			assertTrue(false);
		} catch(IOException e) {
			assertTrue(true);
		}
	}

	@Test
	void testCheckArgValue_No_Dividir0() {
		try {
			prueba.checkArgValue0(0);
			assertTrue(false);
		} catch(IOException e) {
			assertTrue(true);
		}
	}
	
	@Test
	void testdivReales() {
		try {
			float resultadoPrueba = prueba.divReales(16f, 4f);
			float resultadoCorrecto = 4f;
			assertEquals (resultadoPrueba, resultadoCorrecto);
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}
	
	@Test 
	void divEnteros() {
		try {
			float resultadoPrueba = prueba.divEnteros(4, 2);
			float resultadoCorrecto = 2;
			assertEquals (resultadoPrueba, resultadoCorrecto);
			
		}catch (IOException e) {
			System.out.println(e);
		}
	}
	
	@Test
	void inverso() {
		try {
			double resultadoPrueba = prueba.inverso(4f);
			double resultadoCorrecto = 0.25f;
			assertEquals (resultadoPrueba, resultadoCorrecto);
		} catch (IOException e) {
			System.out.println(e);
	}
	
}
	
	@Test
	void raizCuadrada() {
		try {
			double resultadoPrueba = prueba.raizCuadrada(4);
			double resultadoCorrecto = 2;
			assertEquals (resultadoPrueba, resultadoCorrecto);
		} catch (IOException e) {
			System.out.println(e);
	}
	}
	
	
	
}
