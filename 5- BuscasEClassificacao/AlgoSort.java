public class AlgSort{
	private int[] valores = {25,48,37,12,57,33,92};

	public void bubbleSort(){
		int it;    // Em que Iteração está
		int pos;   // Posicao atual do Vetor
		int temp;  // Vai Armzenar o Valor na troca
		for(it =0; it < valores.length-1;it++){
			for(pos = 0; pos < valores.length - it - 1; pos++){
				if(valores[pos] > valores[pos+1]){
					temp = valores[pos];
					valores[pos] = valores[pos+1];
					valores[pos+1] = temp;
				}
			}

		}
	}
}