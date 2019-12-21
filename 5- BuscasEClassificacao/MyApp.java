public class MyApp{
	public static void main(String[] args){
		Colecao colecao = new Colecao();
		System.out.println("------------------ BUSCA SEQUENCIAL----------------");
		System.out.println("Valor 6 na Pos: "+colecao.buscaSequencial(6));
		System.out.println("Valor 15 na Pos: "+colecao.buscaSequencial(15));
		System.out.println("Valor 46 na Pos: "+colecao.buscaSequencial(46));
		System.out.println("Valor 99 na Pos: "+colecao.buscaSequencial(99));
		System.out.println("------------- BUSCA BINARIA ------------------------");
		System.out.println("Valor 6 na Pos: "+colecao.buscaBinaria(6));
		System.out.println("Valor 15 na Pos: "+colecao.buscaBinaria(15));
		System.out.println("Valor 46 na Pos: "+colecao.buscaBinaria(46));
		System.out.println("Valor 99 na Pos: "+colecao.buscaBinaria(99));

	}
}