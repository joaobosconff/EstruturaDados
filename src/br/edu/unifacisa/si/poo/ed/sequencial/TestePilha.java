package br.edu.unifacisa.si.poo.ed.sequencial;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.Assert;



class TestePilha {
	private Pilha pilha;
	
	
	@BeforeEach
	void setUp() throws Exception {
		pilha = new Pilha();
		
	}
	
	
	@Test
	public void tamPilha() throws EstadoInvalidoException{
		pilha.push("1");
		Assert.assertEquals(1, pilha.tamanho());
		
	}
	
	@Test
	public void PilhaVazia() {
		Assert.assertEquals(0,pilha.tamanho());		
	}

	@Test
	public void testePop() throws EstadoInvalidoException {
		pilha.push("1");
		Assert.assertEquals("1", pilha.pop());
		Assert.assertEquals(0, pilha.tamanho());
	}
	
	@Test
	public void pilhaMaiorDoTamInicial() throws EstadoInvalidoException  {
		pilha.push("a");
		pilha.push("b");
		pilha.push("c");
		pilha.push("d");
		Assert.assertEquals(4, pilha.tamanho());
		
	}
	
	@Test
	public void testException() {
		Assertions.assertThrows(EstadoInvalidoException.class, () -> {
			pilha.push(null);
		});
	}
	
	
}
