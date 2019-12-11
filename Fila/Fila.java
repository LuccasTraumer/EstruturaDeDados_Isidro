public class Fila{
	
	private int[] valores;
	private int inicio;
	private int fina;
	private int controle;
	
	public Fila(){
			
		this.valores = new int[10];
		this.inicio = 0;
		this.fina = 0;
		this.controle = 0;
	}
	
	public void inserir(int valor){
		this.valores[fina] = valor;
		this.fina = (this.fina+1)%this.valores.length; // Para quando chegar no 10 ele Zerar
		this.controle++;
	}
	public boolean isEmpty(){
		return (this.controle == 0);
	}
	public boolean isFull(){
		return (this.controle == this.valores.length);
	}
	public int remover(){
		int elem = this.valores[this.inicio];
		this.inicio = (this.inicio+1) % this.valores.length;
		this.controle--;
		
		return elem;
	}
}
