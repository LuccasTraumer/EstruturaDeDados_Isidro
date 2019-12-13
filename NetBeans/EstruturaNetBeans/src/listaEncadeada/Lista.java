package listaEncadeada;

public class Lista{
	private Caixinha inicio;

	public Lista(){
		this.inicio = null;
	}
	public void inserir(int elem){
		Caixinha nova = new Caixinha();

		nova.setElemento(elem);
		nova.setProximo(null);
		if(inicio == null){
			this.inicio = nova;
		}
		else{
			Caixinha aux;
			aux = inicio;
			while(aux.getProximo() != null){
				aux = aux.getProximo();
			}
			aux.setProximo(nova);
		}
	}
	public int remover(){
		Caixinha aux = inicio;
		int elem = aux.getElemento();
		inicio = aux.getProximo();
		return elem;

		}
	public void listar(){
		if(inicio == null)
			System.out.println("Nunhum Elemento a Listar! ");
		else{
			Caixinha aux;
			aux = inicio;
			while(aux != null){
				System.out.println("Elemento Visto "+ aux.getElemento());
				aux = aux.getProximo();
			}


		}
	}
	public String list(){
		String ret = "";
		if(inicio == null)
			return ret = "Nenhum Valor na Lista!";
		else{
			Caixinha aux;
			aux = inicio;
			while(aux != null){
				ret += aux.getElemento() + ", ";
				aux = aux.getProximo();
			}
                        return ret;
		}
	}
	public boolean isEmpty(){
		return this.inicio == null;
	}
}