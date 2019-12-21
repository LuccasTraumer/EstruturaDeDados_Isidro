public class Lista{
	private Caixinha inicio;

	public Lista(){
		this.inicio = null;
	}
	public boolean isEmpty(){
		return (this.inicio == null);
	}
	public void inserir(int elemento){
		Caixinha novo = new Caixinha();
		novo.setElemento(elemento);
		if(isEmpty()){
			novo.setProximo(novo);
			novo.setAnterior(novo);
			inicio = novo;
		}else{
			Caixinha tmp = inicio;
			while(tmp.getProximo() != inicio){
				tmp = tmp.getProximo();
			}
			inicio.setAnterior(novo);
			tmp.setProximo(novo);
			novo.setAnterior(tmp);
			novo.setProximo(inicio);
		}
	}
	public void removerFila(){
		Caixinha novo = inicio;
		novo.setProximo(novo.getProximo());
		inicio = novo;
		do{
			System.out.println(novo.getElemento());
			novo = novo.getProximo();
		}while(novo != inicio);
	}
	public void removerPilha(){

	}
	public void exixbirNaOrdem(){
		Caixinha tmp;
		tmp = inicio;
		do{
			System.out.println("O Elemento é: "+ tmp.getElemento());
			tmp = tmp.getProximo();
		}while(tmp != inicio);
	}
	public void exibirNaOrdemInversa(){
		Caixinha tmp;
		tmp = inicio;
		do{
			System.out.println("Elemento é: "+ tmp.getElemento());
			tmp = tmp.getAnterior();
		}while(tmp != inicio);
	}
}