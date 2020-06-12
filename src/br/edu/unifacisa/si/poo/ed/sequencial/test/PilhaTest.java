package br.edu.unifacisa.si.poo.ed.sequencial.test;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.unifacisa.si.poo.ed.sequencial.Pilha;

class PilhaTest {
	private Pilha pilha;

	@BeforeEach
	void setUp() throws Exception {
		pilha = new Pilha();

	}

	@Test
	public void tamPilha() throws PilhaObjetoException {
		pilha.push("1");
		Assert.assertEquals(1, pilha.tamanho());

	}

	@Test
	public void PilhaVazia() {
		Assert.assertEquals(0, pilha.tamanho());
	}

	@Test
	public void testePop() throws PilhaObjetoException {
		pilha.push("1");
		Assert.assertEquals("1", pilha.pop());
		Assert.assertEquals(0, pilha.tamanho());
	}

	@Test
	public void pilhaMaiorDoTamInicial() throws PilhaObjetoException {
		pilha.push("a");
		pilha.push("b");
		pilha.push("c");
		pilha.push("d");
		Assert.assertEquals(4, pilha.tamanho());

	}

	@Test
	public void testException() {
		Assertions.assertThrows(PilhaObjetoException.class, () -> {
			pilha.push(null);
		});
	}

	@Test
	public void testAdd() throws PilhaObjetoException {
		pilha.push("a");
		Assert.assertEquals(1, pilha.tamanho());
	}

}
