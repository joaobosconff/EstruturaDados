package br.edu.unifacisa.si.poo.ed.exemplos;

import java.util.ArrayList;


public class ExemploArrayList {

	public static void main(String[] args) {
		
		ArrayList minhaLista1 = new ArrayList();
		minhaLista1.add("Elemento 1");
		minhaLista1.add(new Conta(1,1,"Daniel"));
		minhaLista1.add("Elemento 3");
		minhaLista1.add("Elemento 4");
		minhaLista1.add("Elemento 5");
		minhaLista1.add(1); //autoboxing
		
		
		for (int i = 0; i < minhaLista1.size(); i++) {
			System.out.println(minhaLista1.get(i));			
		}
		
		for (Object objeto : minhaLista1) {
			System.out.println(objeto);
		}
		
		ArrayList<Conta> minhaLista2 = new ArrayList<Conta>();
		
		minhaLista2.add(new Conta(1,1,"Daniel"));
		minhaLista2.add(new Conta(1,2,"Aleff"));
		minhaLista2.add(new ContaCorrente(1,3,"Jesse"));
		
		for (Conta conta : minhaLista2) {
			System.out.println(conta.getSaldo());
		}
		
	}
}
