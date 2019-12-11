public class Pilha{
	private int[] valores;
	private int indice;
	public Pilha(){
		this.valores = new int[10];
		this.indice = -1;
	}
	public void push(int valor){
		this.indice++;
		this.valores[indice] = valor;
	}
	
	public int pop(){
		int elem = this.valores[this.indice];
		this.indice--;
		return elem;
	}
	public boolean isEmpty(){
		return (this.indice == -1);
		
	}
	public boolean isFull(){
		return(this.indice == this.valores.length);
	}

}
