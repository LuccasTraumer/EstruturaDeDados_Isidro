public class AlgSort{
	private int[] valores = {25,48,37,12,57,33,92};


	public int getTamVet(){return this.valores.length;}
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
			// nesse for a questao booleana È se o indiceAnt È menor ou Igual a Zero
			// E se valor no IndiceAnterior È menor que o valor Atual,Quando encontrar um Valor menor ele vai parar de colocar os valores
			// a direita, e anterior vai ser menor que o Valor atual e o prox vai ser maior que o Valor atual
			// Ent„o vocÍ incrementa um no indice e coloca entre esses dois valores o valorAtual
			for(indiceAnterior = indice-1; (indiceAnterior >= 0 && valores[indiceAnterior] > valorAtual); indiceAnterior--)
			{
				valores[indiceAnterior+1] = valores[indiceAnterior];
			}
			valores[indiceAnterior+1] = valorAtual;
		}
		mostrar();
	}

	public int patition(int inicio,int fim){
		int temp,ref,up,down;
		ref = valores[inicio];
		down = inicio;
		up = fim;
		while(down < up){
			while(valores[down] <= ref && down < up){
				down++;
			}
			while(valores[up] > ref){
				up--;
			}
			if(down < up){
				temp = valores[down];
				valores[down] = valores[up];
				valores[up] = temp;
			}
		}
		valores[inicio] = valores[up];
		valores[up] = ref;
		return up;
	}
	public void quickSort(int inicio, int fim){
		int pivo = inicio;
		if(inicio >= fim)
			return;
		else{
			pivo = patition(inicio,fim);
			quickSort(inicio, pivo-1);
			quickSort(pivo+1,fim);
		}

	}
	public void mostrar(){
		for(int i=0; i < valores.length;i++)
			System.out.print(valores[i] + "  ");
	}

}