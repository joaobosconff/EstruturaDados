package br.edu.unifacisa.si.poo.ed.exemplos;

import java.util.HashSet;

public class ExemploHashSet {

	public static void main(String[] args) {
		
		HashSet<Conta> meuHashSet = new HashSet<Conta>();
		
		meuHashSet.add(new Conta(1,1,"Daniel"));
		meuHashSet.add(new Conta(1,2,"Aleff"));
		meuHashSet.add(new Conta(1,1,"Mini TED"));
		System.out.println(meuHashSet.size());
	}
}
