public class MainApp {
    public static void main(String[] args){
        HashMap has = new HashMap();
        has.put(new Registro(547,"luccas"));
        has.put(new Registro(854,"david"));
        has.put(new Registro(632,"matheus"));
        has.put(new Registro(789,"miguel"));

        Registro teste = new Registro(847,"Joao");
        has.put(teste);
    }
}
