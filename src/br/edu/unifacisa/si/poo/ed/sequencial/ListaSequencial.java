package br.edu.unifacisa.si.poo.ed.sequencial;

import br.edu.unifacisa.si.poo.ed.sequencial.test.ObjetoFilaException;
import br.edu.unifacisa.si.poo.ed.sequencial.test.PosicaoInvalidaException;

public class ListaSequencial {

	private static final int TAM_INICIAL = 3;

	private Object[] arrayInterno = new Object[TAM_INICIAL];

	private int inseridos;

	public void adicionar(Object item) throws ObjetoFilaException {
		if (item == null) {
			throw new ObjetoFilaException();
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

	public Object obter(int pos) {
		return arrayInterno[pos];
	}

	public void remover(Object item) throws ObjetoFilaException, PosicaoInvalidaException {
		int posicaoEncontrada = -1;

		if (item == null) {
			throw new ObjetoFilaException();
		} else {

			for (int i = 0; i < arrayInterno.length; i++) {
				if (item.equals(arrayInterno[i])) {
					posicaoEncontrada = i;
					break;
				}
			}
		}
		if (posicaoEncontrada != -1) {
			remover(posicaoEncontrada);
		}
	}

	public void remover(int posicao) throws PosicaoInvalidaException {

		if (posicao < 0 || posicao >= inseridos) {
			throw new PosicaoInvalidaException();
		}

		for (int i = posicao; i < inseridos - 1; i++) {
			arrayInterno[i] = arrayInterno[i + 1];
		}

		arrayInterno[inseridos - 1] = null;
		inseridos--;
	}

	public boolean isEmpty() {
		return inseridos == 0;
	}

	public void limpar() {
		arrayInterno = new Object[TAM_INICIAL];
	}

	public int tamanho() {
		return inseridos;
	}

}
