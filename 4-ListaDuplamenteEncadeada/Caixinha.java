public class Caixinha{
	private Caixinha anterior;
	private Caixinha proximo;
	private int elemento;

	public void setAnterior(Caixinha ant){
		this.anterior = ant;
	}
	public void setProximo(Caixinha prox){
		this.proximo = prox;
	}
	public void setElemento(int valor){
		this.elemento = valor;
	}

	public Caixinha getProximo(){
		return this.proximo;
	}
	public Caixinha getAnterior(){
		return this.anterior;
	}
	public int getElemento(){
		return this.elemento;
	}
}