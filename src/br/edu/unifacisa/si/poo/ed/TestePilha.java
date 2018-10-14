package br.edu.unifacisa.si.poo.ed;

import static org.junit.jupiter.api.Assertions.*;


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
	public void tamLista() {
		pilha.push("1");
		Assert.assertEquals(1, pilha.tamanho());
		
	}
	
	@Test
	public void listaVazia() {
		Assert.assertEquals(0,pilha.tamanho());		
	}

	@Test
	public void testePop() {
		pilha.push("1");
		Assert.assertEquals("1", pilha.pop());
		Assert.assertEquals(0, pilha.tamanho());
	}
	
	@Test
	public void pilhaMaiorDoTamInicial() {
		pilha.push("a");
		pilha.push("b");
		pilha.push("c");
		pilha.push("d");
		Assert.assertEquals(4, pilha.tamanho());
		
	}
}
