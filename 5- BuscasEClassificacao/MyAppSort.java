public class MyAppSort{
	public static void main(String[] args){
		AlgSort tes = new AlgSort();

		tes.quickSort(0,tes.getTamVet()-1);
		tes.mostrar();

	}
}