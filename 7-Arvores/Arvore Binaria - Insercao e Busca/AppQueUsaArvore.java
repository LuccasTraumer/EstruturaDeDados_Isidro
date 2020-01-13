public class AppQueUsaArvore{
	public static void main(String[] args){
		Arvore arvore = new Arvore(new Elemento(20));

		arvore.inserir(new Elemento(10));
		arvore.inserir(new Elemento(5));
		arvore.inserir(new Elemento(2));
		arvore.inserir(new Elemento(8));
		arvore.inserir(new Elemento(15));
		arvore.inserir(new Elemento(12));
		arvore.inserir(new Elemento(18));
		arvore.inserir(new Elemento(30));
		arvore.inserir(new Elemento(25));
		arvore.inserir(new Elemento(22));
		arvore.inserir(new Elemento(28));
		arvore.inserir(new Elemento(35));
		arvore.inserir(new Elemento(32));
		arvore.inserir(new Elemento(38));

		arvore.imprimiInOrdem();
		System.out.println();

		Elemento elem = new Elemento(38);
		System.out.println("Nova Arvore sem o Elemento: "+elem.getValor()+" ...");
		arvore.remover(elem);

		arvore.imprimiInOrdem();
		System.out.println();


		elem.setValor(35);
		System.out.println("Nova Arvore sem o Elemento: "+elem.getValor()+" ...");
		arvore.remover(elem);

		arvore.imprimiInOrdem();
		System.out.println();

		elem.setValor(20);
		System.out.println("Nova Arvore sem o Elemento: "+elem.getValor()+" ...");
		arvore.remover(elem);

		arvore.imprimiInOrdem();
		System.out.println();
	}
}