package listaDuplamenteEncadeada;

public class MyApp {
    public static void main(String[] args)
    {
        ListaDuplamente test = new ListaDuplamente();
        
        test.inserir(5);
        test.inserir(65);
        test.inserir(85);
        test.inserir(52);
        test.exibirValores();
        System.out.println("ANTES --------------------");
        test.removerInicio();
        test.exibirValores();
    }
}
