package br.edu.unifacisa.si.poo.ed;

public class Fila {

	
	private static int TAM_INICIAL = 3;
	
	private int inseridos;
	
	private Object[] fila = new Object[TAM_INICIAL];
	
	
	
	public void enqueue(Object objeto) {
		verificaLista(fila);
		fila[inseridos] = objeto;
		inseridos++;
		
	}
	
	
	public Object dequeue() {
		
		Object retorno = front();
		if(inseridos > 0) {
			for(int i = 0; i < inseridos - 1;i++) {
				fila[i] = fila[i + 1];
			}
		inseridos--;
		fila[inseridos] = null;

		}
	
	return retorno;
	
	}	
	
	public Object front() {
		return fila[0];
	}
	
	public int tamanho() {
		return inseridos;
	}
	
	public boolean isEmpty() {
		return inseridos == 0;
	}
	
	
	
	public void verificaLista(Object[] fila) {
		if(inseridos == fila.length) {
			Object[] novo = new Object[fila.length * 2];
			for(int i = 0; i < fila.length;i++) {
				novo[i] = fila[i];
			}
			fila = novo;
		} 
		
	}
	
	
}
