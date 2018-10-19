package br.edu.unifacisa.si.poo.ed.exemplos;

import java.util.LinkedList;

public class ExemploLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Conta> minhaLista1 = new LinkedList<Conta>();
		
		minhaLista1.add(new Conta(1,1,"Daniel"));
		minhaLista1.add(new Conta(1,2,"Ceguinha 1"));		
		minhaLista1.add(new Conta(1,3,"Ceguinha 2"));
		
		System.out.println(minhaLista1.size());
		System.out.println(minhaLista1.removeFirst());
		System.out.println(minhaLista1.removeLast());
		
		for (Conta conta : minhaLista1) {
			System.out.println(conta.getSaldo());
		}
		
	}
}
