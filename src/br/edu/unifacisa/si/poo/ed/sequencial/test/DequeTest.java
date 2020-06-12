package br.edu.unifacisa.si.poo.ed.sequencial.test;

import org.junit.Assert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.unifacisa.si.poo.ed.sequencial.Deque;



class DequeTest {

	private Deque deque;
	
	@BeforeEach
	void setUp() throws Exception {
		deque = new Deque();
	}

	
	@Test
	public void addFirst() throws ObjetoDequeException {
		deque.insertFirst("1");
		Assert.assertEquals(1, deque.size());
	}
	
	@Test 
	public void addLast() throws ObjetoDequeException{
		deque.insertLast("1");
		deque.insertLast("2");
		Assert.assertEquals(2, deque.size());
		
	}
	
	@Test
	public void removeFirst() throws ObjetoDequeException {
		deque.insertFirst("1");
		deque.insertFirst("2");
		deque.removeFirst();
		Assert.assertEquals(1, deque.size());	
	}
	
	@Test
	public void removeLast() throws ObjetoDequeException {
		deque.insertFirst("1");
		deque.insertLast("2");
		deque.removeLast();
		Assert.assertEquals(1, deque.size());
		
	}
	@Test
	public void testAddException() {
		Assertions.assertThrows(ObjetoDequeException.class, () -> {
			deque.insertFirst(null);
		});
		
	}
	@Test
	public void maiorTamInicial() throws ObjetoDequeException {
		deque.insertFirst("1");
		deque.insertFirst("2");
		deque.insertFirst("3");
		deque.insertFirst("4");
		deque.insertFirst("5");
		Assert.assertEquals(5, deque.size());
	}
	public void maiorTamInicial2() throws ObjetoDequeException {
		deque.insertLast("1");
		deque.insertLast("2");
		deque.insertLast("3");
		deque.insertLast("4");
		deque.insertLast("5");
		Assert.assertEquals(5, deque.size());
	
	
	}
	@Test
	public void testRemoveIndex() throws ObjetoDequeException, PosInvalidaDequeException {
		deque.insertFirst("1");
		deque.insertFirst("2");
		deque.insertFirst("3");
		deque.insertFirst("4");
		deque.removeByIndex(1);
		Assert.assertEquals(3, deque.size());
 }
}
