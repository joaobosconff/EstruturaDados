package br.edu.unifacisa.si.poo.ed.sequencial.test;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.unifacisa.si.poo.ed.sequencial.Fila;

class FilaTest {

	private Fila fila;

	@BeforeEach
	void setUp() throws Exception {
		fila = new Fila();
	}

	@Test
	public void testAddException() {
		Assertions.assertThrows(ObjetoFilaException.class, () -> {
			fila.enqueue(null);
		});
	}

	@Test
	public void testAdd() throws ObjetoFilaException {
		fila.enqueue("1");
		Assert.assertEquals(1, fila.tamanho());
	}

	@Test
	public void testRemover() throws ObjetoFilaException {
		fila.enqueue("1");
		fila.enqueue("2");
		fila.dequeue();
		Assert.assertEquals(1, fila.tamanho());
	}

	@Test
	public void testMaiorTamInicial() throws ObjetoFilaException {
		fila.enqueue("1");
		fila.enqueue("2");
		fila.enqueue("3");
		fila.enqueue("4");
		fila.enqueue("5");
		Assert.assertEquals(5, fila.tamanho());
	}

}
