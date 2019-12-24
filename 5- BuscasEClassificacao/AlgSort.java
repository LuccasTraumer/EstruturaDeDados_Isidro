public class AlgSort{
	private int[] valores = {25,48,37,12,57,33,92};

	public void bubbleSort(){
		int it;  // Indicador Lento, Vai marcar tambem a Iteração em que esta
		int pos; // Vai Indicar a Posicao Atual do vetor
		int temp;// Vai Armzenar o valores na Troca

		for(it=0; it < valores.length-1;it++){
			for(pos=0; pos < valores.length - it-1; pos++){
				if(valores[pos] > valores[pos+1]){
					temp = valores[pos];
					valores[pos] = valores[pos+1];
					valores[pos+1] = temp;
				}
			}
			System.out.println("------------> Final da Interacao "+ it);
			mostrar();
		}
	}

	public void mostrar(){
		for(int i=0; i < valores.length;i++)
			System.out.print(valores[i] + "  ");
	}
}