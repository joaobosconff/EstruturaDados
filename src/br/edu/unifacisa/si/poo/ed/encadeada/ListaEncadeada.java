package br.edu.unifacisa.si.poo.ed.encadeada;

public class ListaEncadeada {

	private Conta primeiroElemento; //cabeça
	
	
	private int inseridos;
	
	public void adicionar(Conta c) {

		if(primeiroElemento == null) {
			primeiroElemento = c;
			
		} else {

			
			Conta temp = primeiroElemento;
			
			while(temp.getProximo() != null) {
				temp = temp.getProximo();
			}
			
			//chegou até o fim da lista
			temp.setProximo(c);
		}
		
		inseridos++;
	}

	public Conta get(int posicao) {
		Conta temp = primeiroElemento;
		for(int i = 0; i < posicao;i++) {
			temp = temp.getProximo();
		}	
		return temp;
	}

	public void remover(Conta c) {
		if(c.equals(primeiroElemento)) {
			primeiroElemento = c.getProximo();
		}else {
			Conta temp = primeiroElemento;
			while(temp.getProximo() != null && !temp.getProximo().equals(c)) {
				temp = temp.getProximo();}
			temp.setProximo(c.getProximo());}	

	}

	public void remover(int pos) {
		if(pos == 0) {
			primeiroElemento = primeiroElemento.getProximo();
		}
		Conta temp = primeiroElemento;
		for(int i = 0; i < pos - 1;i++) {
			temp = temp.getProximo();
		}
		Conta removida = temp.getProximo();
		temp.setProximo(removida.getProximo());

	}
	
	public int tamanho() {
		return inseridos;
	}
	
	public boolean inEmpty() {
		return inseridos == 0;
	}
}
