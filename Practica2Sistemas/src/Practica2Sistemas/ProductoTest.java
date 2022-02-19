package Practica2Sistemas;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {
	Producto producto;

	@BeforeEach
	void setUp() throws Exception {
		producto = new Producto();
	}

	@AfterEach
	void tearDown() throws Exception {
		producto = null;
	}

	@Test
	void testCheckArgValueNoCorrecto() {
		try {
			producto.checkArgValue(-5);
			assertTrue(false);
		} catch(IOException e) {
			assertTrue(true);
		}
	}
	
	@Test
	void testCheckArgValueCorrectoValorLimite() {
		try {
			producto.checkArgValue(0);
			assertTrue(true);
		} catch(IOException e) {
			assertTrue(false);
		}
	}
	
	@Test
	void testCheckArgValueCorrecto() {
		try {
			producto.checkArgValue(10);
			assertTrue(true);
		} catch(IOException e) {
			assertTrue(false);
		}
	}
	
	@Test
	void testProducReales3Parametros() {
		try {
			assertEquals(1000.0f, producto.producReales(10.0f, 10.0f, 10.0f));
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

	@Test
	void testProducReales2Parametros() {
		try {
			assertEquals(100.0f, producto.producReales(10.0f, 10.0f));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void testProducReales2ParametrosEnteros() {
		try {
			assertEquals(100, producto.producReales(10, 10));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	void testProducEnterosCorrecto() {
		try {
			assertEquals(100, producto.producEnteros(10, 10));
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

	@Test
	void testProducPotencia() {
		try {
			assertEquals(4.0, producto.producPotencia(2, 2));
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

}
