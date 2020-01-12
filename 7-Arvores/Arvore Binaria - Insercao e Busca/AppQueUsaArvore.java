public class AppQueUsaArvore{
	public static void main(String[] args){
		Arvore arvore = new Arvore(new Elemento(10));

		arvore.inserir(new Elemento(5));
		arvore.inserir(new Elemento(1));
		arvore.inserir(new Elemento(8));
		arvore.inserir(new Elemento(15));
		arvore.inserir(new Elemento(12));
		arvore.inserir(new Elemento(18));

		int valor = 5;
		System.out.println("O Elemento "+ valor +" "+ (arvore.busca(valor) ? "existe" : "não existe"));
		valor = 12;
		System.out.println("O Elemento "+ valor +" "+ (arvore.busca(valor) ? "existe" : "não existe"));
		valor = 18;
		System.out.println("O Elemento "+ valor +" "+ (arvore.busca(valor) ? "existe" : "não existe"));
		valor = 34;
		System.out.println("O Elemento "+ valor +" "+ (arvore.busca(valor) ? "existe" : "não existe"));

		arvore.imprimiPreOrdem();
		System.out.println();
		arvore.imprimiInOrdem();
		System.out.println();
		arvore.imprimiPosOrdem();
		System.out.println();
		arvore.imprimiInOrdemInversa();
	}
}