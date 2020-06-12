package br.edu.unifacisa.si.poo.ed.sequencial.test;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.unifacisa.si.poo.ed.sequencial.ListaSequencial;

class ListaTest {

	private ListaSequencial lista;

	@BeforeEach
	void setUp() throws Exception {
		lista = new ListaSequencial();
	}

	@Test
	public void testExceptionAdd() {
		Assertions.assertThrows(ObjetoFilaException.class, () -> {
			lista.adicionar(null);
		});
	}

	@Test
	public void testExceptionRemove() {
		Assertions.assertThrows(ObjetoInvalidoException.class, () -> {
			lista.remover(null);
		});
	}

	@Test
	public void testAdd() throws ObjetoFilaException {
		lista.adicionar("1");
		Assert.assertEquals(1, lista.tamanho());
	}

	@Test
	public void listaMaiorTamInicial() throws ObjetoFilaException {
		lista.adicionar("1");
		lista.adicionar("2");
		lista.adicionar("3");
		lista.adicionar("4");
		Assert.assertEquals(4, lista.tamanho());

	}

	@Test
	public void testRemover() throws ObjetoInvalidoException, ObjetoFilaException, PosicaoInvalidaException {
		lista.adicionar("1");
		lista.adicionar("2");
		lista.remover("2");
		Assert.assertEquals(1, lista.tamanho());
	}

	@Test
	void testRemoverPosicaoInexistente() throws ObjetoFilaException {

		lista.adicionar("1");
		lista.adicionar("2");

		Assert.assertEquals("1", lista.obter(0));
		Assert.assertEquals("2", lista.obter(1));
		Assert.assertEquals(2, lista.tamanho());

		Assertions.assertThrows(PosicaoInvalidaException.class, () -> {
			lista.remover(5);
		});

		Assertions.assertThrows(PosicaoInvalidaException.class, () -> {
			lista.remover(-1);
		});

		Assertions.assertThrows(PosicaoInvalidaException.class, () -> {
			lista.remover(2);
		});
	}

}
