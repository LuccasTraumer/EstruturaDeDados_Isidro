public class PilhaDinamica implements IPilha{
	private Caixinha topo;

	public PilhaDinamica(){
		this.topo = null;
	}
	public void push(int elem){
		Caixinha novo = new Caixinha();
		novo.setElemento(elem);
		novo.setProximo(topo);

		topo = novo;
	}
	public int pop(){
		int elem = topo.getElemento();
		topo = topo.getProximo();

		return elem;
	}
	public boolean isEmpty(){
		return this.topo == null;
	}
}