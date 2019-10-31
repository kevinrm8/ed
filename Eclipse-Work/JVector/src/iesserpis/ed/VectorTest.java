package iesserpis.ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//TEST PARA COMPROBAR QUE EL PROGRAMA ( EN ESTE CASO EL LLAMADO: BUSQUEDA ) FUNCIONA CORRECTAMENTE

class VectorTest {

	@Test
	void test() {
		
		int[] v= {17,12,15,9,14};
		int x = 15;
		int index = Busqueda.indexOf(v,x);	
		
		// El numero 2 es el valor esperado
		
		assertEquals(2,index);
		assertEquals(0,Busqueda.indexOf(v,17));
		assertEquals(4,Busqueda.indexOf(v,14));
		

		// EN ESTA LINEA HACE LO MISMO QUE TODO LO ANTERIOR
		assertEquals(2,Busqueda.indexOf(new int[] {17,12,15,9,14},15));
	}

}
