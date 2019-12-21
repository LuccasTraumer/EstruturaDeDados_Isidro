public class Colecao{
	private int[] valores = {2,6,8,9,15,38,46,79,96};

	public int buscaSequencial(int valor){
		for(int i=0; i< this.valores.length;i++){
			if(valor == this.valores[i])
				return i;
		}
		return -1;
	}
	public int buscaBinaria(int valor){
		int inicio,fim,meio;
		inicio = 0;
		fim = this.valores.length -1;
		while(inicio < fim){
			meio = (inicio + fim)/2;
			if(valor == valores[meio])
				return meio;
			else{
				if(valor > valores[meio]){
					inicio = meio+1;
				}if(valor < valores[meio]){
					fim = meio-1;
				}
			}
		}
		return -1;
	}


}