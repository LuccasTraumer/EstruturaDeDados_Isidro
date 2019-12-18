public class Banco{
	public static void main(String[] args)
	{
		Fila f = new Fila();
		
		f.inserir(52);
		f.inserir(89);
		f.inserir(120);
		f.inserir(465);
		
		int r;
		System.out.println("Sistema de BANCO ");
		System.out.println("ATENDIMENTO ---------------------");
		while(!f.isEmpty()){
			r = f.remover();
			System.out.println("Senha Numero "+ r + " Será Antedido no guiche.	");
		}
	}
	
	}
