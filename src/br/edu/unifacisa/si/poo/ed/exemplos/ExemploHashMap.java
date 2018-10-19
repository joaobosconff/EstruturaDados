package br.edu.unifacisa.si.poo.ed.exemplos;

import java.util.HashMap;


public class ExemploHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, Conta> meuMapa = new HashMap<Integer, Conta>();
		
		meuMapa.put(1, new Conta(1,1,"Daniel"));
		meuMapa.put(2, new Conta(1,2,"Aleff"));
		meuMapa.put(3, new Conta(1,3,"Ted Mini"));
		
		Conta c = meuMapa.get(3);
		System.out.println(c);
		
		System.out.println(meuMapa.containsKey(4));
		System.out.println(meuMapa.containsKey(1));
		
		meuMapa.remove(3);
		System.out.println(meuMapa.containsKey(3));
		System.out.println(meuMapa.get(3));
		
		meuMapa.replace(1, new Conta(1,100,"Porto"));
		System.out.println(meuMapa.get(1));
	}
}
