public class Arvore{
	private Elemento elemento;
	private Arvore esquerda;
	private Arvore direita;

	public Arvore(){
		this.elemento = null;
		this.esquerda = null;
		this.direita  = null;
	}
	public Arvore(Elemento elem){
		this.elemento = elem;
		this.esquerda = null;
		this.direita = null;

		//System.out.println("Criei a Arvore com o elemento "+ elem.getValor());
	}
	// Metodos de Controle

	//Remoção
	public Arvore remover(Elemento elem){
		// Encontrei o elemento
		if(elem.getValor() == this.elemento.getValor()){
			// Caso 1 - Elemento Folha
			if(this.esquerda == null && this.direita == null){
				return null;
			}
			else{
				// Caso 2 - Tenho Filhos a ESQUERDA mas NÃO tenho a DIREITA
				if(this.esquerda != null && this.direita == null){
					return this.esquerda;
				}
				// Caso 3 - Tenho Filhos a DIREITA mas NÃO tenho a ESQUERDA
				else if(this.direita != null && this.esquerda == null){
					return this.direita;
				}
				// Caso 4 - Tenho Filhos dos dois lados, Vou subtituir esse valor pelo Menor entre o Maiores ou Maior entre os menores
				// Vou substituir pelo MAIOR entre os MENORES
				else{
					Arvore aux = this.esquerda;
					while(aux.direita != null){
						aux = aux.direita;
					}
					// Passo para o this o ultimo elemento
					this.elemento = aux.getElemento();
					// troco o ultimo elemento pelo que vou remover
					aux.setElemento(elem);
					// Chamo a função de remover
					this.esquerda = esquerda.remover(elem);
				}
			}
		}else if(elem.getValor() < this.elemento.getValor()){
			// Delegar(repassa) a responsabilidade a sub-arvore da esquerda
			this.esquerda = this.esquerda.remover(elem);
		}else if(elem.getValor() > this.elemento.getValor()){
			// delega(repassa) a responsabilidade a sub-arvore da direita
			this.direita = this.direita.remover(elem);
		}

		return this;
	}

	// Verificação
	public boolean isEmpty(){ return (this.elemento == null);}

	// Inserção
	public void inserir(Elemento novo){
		if(isEmpty()){
			this.elemento = novo;
		}
		else{
			Arvore novaArvore = new Arvore(novo);
			if(novo.getValor() < this.elemento.getValor()){ // Ele vai pra descendecia a Esquerda
				if(this.esquerda == null){
					this.esquerda = novaArvore;
					//System.out.println("Inseri o elemento "+ novo.getValor() + " a esquerda de "+ this.elemento.getValor());
				}
				else{
					this.esquerda.inserir(novo);
				}
			}else if(novo.getValor() > this.elemento.getValor()){ // Descendecia a Direita
					if(this.direita == null){
						this.direita = novaArvore;
						//System.out.println("Inseri o elemento "+ novo.getValor() + " a direita de "+ this.elemento.getValor());
					}
					else{
						this.direita.inserir(novo);
					}
				}
		}

	}
	public void imprimiPreOrdem(){
		if(!isEmpty()){
			System.out.print(this.elemento.getValor() + "  ");
			if(this.esquerda != null){
				this.esquerda.imprimiPreOrdem();
			}
			if(this.direita != null){
				this.direita.imprimiPreOrdem();
			}
		}
	}

	public void imprimiInOrdem(){
		if(!isEmpty()){
			if(this.esquerda != null){
				this.esquerda.imprimiInOrdem();
			}
			System.out.print(this.elemento.getValor() +"  ");
			if(this.direita != null){
				this.direita.imprimiInOrdem();
			}
		}
	}
	public void imprimiInOrdemInversa(){
			if(!isEmpty()){
				if(this.direita != null){
					this.direita.imprimiInOrdem();
				}
				System.out.print(this.elemento.getValor() +"  ");
				if(this.esquerda != null){
					this.esquerda.imprimiInOrdem();
				}
			}
	}

	public void imprimiPosOrdem(){
		if(!isEmpty()){
			if(this.direita != null){
				this.direita.imprimiPosOrdem();
			}
			if(this.esquerda != null){
				this.esquerda.imprimiPosOrdem();
			}
			System.out.print(this.elemento.getValor() + "  ");
		}
	}

	// Busca
	public boolean busca(int valor){
		if(isEmpty()){
			return false;
		}
		if(this.elemento.getValor() == valor){
			return true;
		}
		else{
			if(valor < this.elemento.getValor()){
				if(this.esquerda == null){
					return false;
				}
				else{
					return this.esquerda.busca(valor); // Repasso a responsabilidade pra subArvore
				}
			}
			else if(valor > this.elemento.getValor()){
				if(this.direita == null){
					return false;
				}
				else{
					return this.direita.busca(valor);// Repasso a responsabilidade pra subArvore
				}
			}
			return false;
		}
	}
	// getters e Setters
	public Elemento getElemento(){
		return this.elemento;
	}
	public Arvore getEsquerda(){
		return this.esquerda;
	}
	public Arvore getDireita(){
		return this.direita;
	}

	public void setElemento(Elemento elem){
		this.elemento = elem;
	}
	public void setEsquerda(Arvore esq){
		this.esquerda = esq;
	}
	public void setDireita(Arvore dir){
		this.direita = dir;
	}
}