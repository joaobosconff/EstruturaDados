package br.edu.unifacisa.si.poo.ed.arvore;

public class ArvoreBinaria {

	private Node raiz;

	public int getAltura() {
		return getAltura(this.raiz);
	}

	public int getAltura(Node node) {
		if (node == null) {
			return 0;
		}
		// Via recursão,irá somar a altura da esquerda e direita
		int alturaEsquerda = getAltura(node.getEsquerda());
		int alturaDireita = getAltura(node.getDireita());

		if (alturaEsquerda > alturaDireita) {

			// o +1 é a altura do node que foi passado na função e não foi somado
			return alturaEsquerda + 1;
		} else {
			return alturaDireita + 1;
		}

	}

	public int getQtd() {
		return getQtd(raiz);
	}

	private int getQtd(Node node) {
		if (node == null) {
			return 0;
		}
		int qtdNodeEsq = getQtd(node.getEsquerda());
		int qtdNodeDir = getQtd(node.getDireita());
		return qtdNodeEsq + qtdNodeDir + 1;
	}

	public void inserir(int valor) {
		inserir(raiz, valor);
	}

	// RECURSÃO
	public void inserir(Node node, int valor) {
		if (this.raiz == null) {
			setRaiz(new Node(valor));
		} else {
			// Valida se vai para esquerda ou para a direita,se for menor,vai para
			// esquerda,se maior,direita

			// valida se vai para a esquerda,e continua,se for diferente de nulo
			if (valor < node.getValor()) {
				if (node.getEsquerda() != null) {
					inserir(node.getEsquerda(), valor);
				} else {
					// Se nodo esquerdo vazio insere no lugar
					node.setEsquerda(new Node(valor));
				}
				// valida se vai para a direita,e continua,se for diferente de nulo
			} else if (valor > node.getValor()) {
				if (node.getDireita() != null) {
					inserir(node.getDireita(), valor);
				} else {
					// Se nodo direito vazio insere no lugar
					node.setDireita(new Node(valor));
				}
			}
		}
	}

	public void inserirV2(int valor) {
		Node novoNode = new Node(valor);

		if (this.raiz == null) {
			setRaiz(novoNode);
		}
		Node atual = raiz;
		boolean achou = false;

		while (!achou) {
			// Procurando o lugar que o nó vai ser inserido
			if (valor <= atual.getValor()) {
				// Indo pela esquerda
				atual = atual.getEsquerda();
				if (atual == null) {
					atual = novoNode;
					System.out.println("Inserido nó " + valor);
					achou = true;
				}
			} else {
				// Indo pela direita
				atual = atual.getDireita();
				if (atual == null) {
					atual = novoNode;
					System.out.println("Inserido nó " + valor);
					achou = true;
				}
			}
		}

	}

	public Node remover(int valor) throws Exception {
		return remover(this.raiz, valor);
	}

	private Node remover(Node node, int valor) throws Exception {
		if (this.raiz == null) {
			throw new Exception("vazio");
		} else {

			// Valida se vai para esquerda ou para a direita,se for menor,vai para
			// esquerda,se maior,direita

			// se o nó não foi encontrado,valida se vai para a esquerda,e continua,se for
			// diferente de nulo
			if (valor < node.getValor()) {
				// por recursão,ele vai continuar pela esquerda
				node.setEsquerda(remover(node.getEsquerda(), valor));
				// se o nó não foi encontrado,valida se vai para a direita,e continua,se for
				// diferente de nulo
			} else if (valor > node.getValor()) {
				node.setDireita(remover(node.getDireita(), valor));

				// Quando encontra o nó(valor == node.getValor()) , ele verifica se o nó possui
				// filhos
			} else if (node.getEsquerda() != null && node.getDireita() != null) {
				System.out.println("  Removido  " + node.getValor());
				node.setValor(encontraMinimo(node.getDireita()).getValor());
				node.setDireita(removeMinimo(node.getDireita()));

				// Se tiver 1 filho ou nenhum
			} else {
				System.out.println("  Removido  " + node.getValor());
				// se tiver um filho,o filho toma o lugar do pai
				if (node.getEsquerda() == null) {
					node = node.getDireita();
				} else {
					node = node.getEsquerda();
				}
			}
			return node;
		}
	}

	private Node removeMinimo(Node node) throws Exception {
		if (node == null) {
			throw new Exception("inválido");

		} else if (node.getEsquerda() != null) {
			node.setEsquerda(removeMinimo(node.getEsquerda()));
			return node;

			// Quando encontra o minimo,remove ele,setando null
		} else {
			return null;
		}
	}

	private Node encontraMinimo(Node node) {
		// Procura o menor nó,indo pela esquerda
		if (node != null) {
			while (node.getEsquerda() != null) {
				node = node.getEsquerda();
			}
		}
		return node;
	}

	public Node getRaiz() {
		return raiz;
	}

	public void setRaiz(Node raiz) {
		this.raiz = raiz;
	}

	public void emOrdem(Node no) {
		if (no != null) {
			emOrdem(no.getEsquerda());
			System.out.print(no.getValor() + " ");
			emOrdem(no.getDireita());
		}
	}

	public void preOrdem(Node no) {
		if (no != null) {
			System.out.print(no.getValor() + " ");
			preOrdem(no.getEsquerda());
			preOrdem(no.getDireita());
		}
	}

	public void posOrdem(Node no) {
		if (no != null) {
			posOrdem(no.getEsquerda());
			posOrdem(no.getDireita());
			System.out.print(no.getValor() + " ");
		}
	}

}
