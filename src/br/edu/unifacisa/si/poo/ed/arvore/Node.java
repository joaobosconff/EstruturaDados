package br.edu.unifacisa.si.poo.ed.arvore;

public class Node {

	private Integer valor;

	private Node esquerda;

	private Node direita;

	public Node() {

	}

	public Node(Integer valor) {
		this.valor = valor;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public Node getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Node esquerda) {
		this.esquerda = esquerda;
	}

	public Node getDireita() {
		return direita;
	}

	public void setDireita(Node direita) {
		this.direita = direita;
	}

	@Override
	public String toString() {
		return "Nó-valor=" + valor;
	}

}
