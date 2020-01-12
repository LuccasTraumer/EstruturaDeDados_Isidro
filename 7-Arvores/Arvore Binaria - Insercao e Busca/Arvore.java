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
	public boolean isEmpty(){ return (this.elemento == null);}

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