package br.edu.unifacisa.si.poo.ed.sequencial;



import org.junit.Assert;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteLista {

	private ListaSequencial lista;
	@BeforeEach
	void setUp() throws Exception {
		lista = new ListaSequencial();
	}
	
	@Test
	public void testExceptionAdd() {
		Assertions.assertThrows(EstadoInvalidoException.class, () -> {
			lista.adicionar(null);
		});
	}
	
	@Test
	public void testExceptionRemove() {
		Assertions.assertThrows(EstadoInvalidoException.class, () -> {
			lista.remover(null);
		});
	}
	@Test
	public void tamLista() throws EstadoInvalidoException{
		lista.adicionar("1");
		Assert.assertEquals(1, lista.tamanho());
	}
	
	@Test
	public void listaMaiorTamInicial() throws EstadoInvalidoException{
		lista.adicionar("1");
		lista.adicionar("2");
		lista.adicionar("3");
		lista.adicionar("4");
		Assert.assertEquals(4, lista.tamanho());
		
	}

	

}
