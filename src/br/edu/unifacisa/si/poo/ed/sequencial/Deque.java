package br.edu.unifacisa.si.poo.ed.sequencial;

import br.edu.unifacisa.si.poo.ed.sequencial.test.ObjetoDequeException;
import br.edu.unifacisa.si.poo.ed.sequencial.test.PosInvalidaDequeException;

public class Deque {
	
	private int inseridos;

	private static final int TAM_INICIAL = 3;

	private Object[] arrayInterno = new Object[TAM_INICIAL];

	/**
	 * 
	 * @param item
	 * @throws ObjetoDequeException
	 */
	public void insertLast(Object item)  throws ObjetoDequeException{
		if(item == null) {
			throw new ObjetoDequeException();
		}
		if (inseridos == arrayInterno.length) {

			Object[] novo = new Object[arrayInterno.length * 2];

			for (int i = 0; i < arrayInterno.length; i++) {
				novo[i] = arrayInterno[i];
			}

			arrayInterno = novo;
		}

		arrayInterno[inseridos] = item;
		inseridos++;
	}
	/**
	 * 
	 * @param item
	 * @throws ObjetoDequeException
	 */
	public void insertFirst(Object item)  throws ObjetoDequeException{
		if (item == null) {
			throw new ObjetoDequeException();
		}

		if (inseridos == arrayInterno.length) {
			Object[] aux = new Object[arrayInterno.length * 2];

			for (int i = 0; i < arrayInterno.length; i++) {
				aux[i] = arrayInterno[i];
			}

			arrayInterno = aux;

		}

		for (int i = inseridos; i > 0; i--) {
			arrayInterno[i] = arrayInterno[i - 1];
		}

		arrayInterno[0] = item;
		inseridos++;

	}
	
	public Object removeLast() {
		Object removido = arrayInterno[inseridos - 1];
		arrayInterno[inseridos] = null;
		inseridos--;
		return removido;
	}
	
	public Object removeFirst() {
		Object removido = arrayInterno[0];
		if (inseridos > 0) {

			for (int i = 0; i < inseridos - 1; i++) {
				arrayInterno[i] = arrayInterno[i + 1];
			}

			inseridos--;
			arrayInterno[inseridos] = null;
		}
		return removido;

	}

	public int size() {
		return inseridos;
	}
	/**
	 * 
	 * @param item
	 * @throws PosInvalidaDequeException
	 */
	public void removeByValue(Object item) throws PosInvalidaDequeException {

		if (item == null) {
			throw new PosInvalidaDequeException();
		}

		for (int i = 0; i < inseridos; i++) {
			if (item.equals(arrayInterno[i])) {
				removeByIndex(i);
				break;
			}
		}

	}

/**
 * 
 * @param pos
 * @throws PosInvalidaDequeException
 */
	public void removeByIndex(int pos) throws PosInvalidaDequeException {

		if (pos > inseridos || arrayInterno[pos] == null) {
			throw new PosInvalidaDequeException();
		}

		for (int i = pos; i < inseridos - 1; i++) {
			arrayInterno[i] = arrayInterno[i + 1];
		}
		
		inseridos--;
		arrayInterno[inseridos] = null;
		
		
	}
}
