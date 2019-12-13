package listaEncadeada;

public class Caixinha{

	private int elemento;
	private Caixinha proximo;


	public int getElemento(){
		return this.elemento;
	}
	public Caixinha getProximo(){
		return this.proximo;
	}
	public void setElemento(int elem){
		this.elemento = elem;
	}
	public void setProximo(Caixinha prox){
		this.proximo = prox;
	}
}