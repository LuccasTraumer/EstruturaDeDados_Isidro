public class AlgSort{
	private int[] valores = {25,48,37,12,57,33,92};

	public void bubbleSort(){
		int it;  // Indicador Lento, Vai marcar tambem a Itera√ß√£o em que esta
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
		}
	}

	public void selectionSortValores(){
		// Esta trocando os Valores n„o os Indices, DESSE MODO … BEM MENOS EFICIENTE POIS VAI FICAR TROCANDO MAIS VEZES
		int posMenorInicial,posMenor,temp;
		for(posMenorInicial=0; posMenorInicial < valores.length-1;posMenorInicial++){
			for(posMenor = posMenorInicial+1; posMenor < valores.length-1;posMenor++){
				if(valores[posMenorInicial] > valores[posMenor]){
					temp = valores[posMenorInicial];
					valores[posMenorInicial] = valores[posMenor];
					valores[posMenor] = temp;
				}
			}
		}
	}
	public void selectionSortIndice(){
		int ind,indSeg,temp,posInicial,posMenor;
		for(ind=0; ind < valores.length-1; ind++){
			posInicial = ind;
			posMenor = ind+1;
			for(indSeg = ind+1; indSeg < valores.length-1;indSeg++){
				if(valores[indSeg] < valores[posMenor]) // O indSeg vai correr os demais valores,
				{
					posMenor = indSeg; // o posMenor vai ser alterado caso dentro do vetor tenha um valor menor que aquele, sÛ ira armaznar o indice
				}
			}
			if(valores[posMenor] < valores[posInicial]){
				temp = valores[posInicial];
				valores[posInicial] = valores[posMenor];
				valores[posMenor] = temp;
			}
		}
	}
	public void insertionSort(){
		int indice,indiceAnterior,valorAtual;
		for(indice = 1; indice < valores.length; indice++){
			valorAtual = valores[indice];
			for(indiceAnterior = indice-1; (indiceAnterior >= 0 && valores[indiceAnterior] > valorAtual); indiceAnterior--){
				valores[indiceAnterior+1] = valores[indiceAnterior];
			}
			valores[indiceAnterior+1] = valorAtual;
		}
		mostrar();
	}
	public void mostrar(){
		for(int i=0; i < valores.length;i++)
			System.out.print(valores[i] + "  ");
	}

}