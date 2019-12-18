public class MyApp{
	public static void main(String[] args){
		Lista test = new Lista();
		test.inserir(50);
		test.inserir(87);
		test.inserir(62);
		test.exixbirNaOrdem();
		System.out.println("-------------------------------------");
		test.exibirNaOrdemInversa();
	}
}