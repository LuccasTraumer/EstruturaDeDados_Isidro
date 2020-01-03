public class HashMap {
    private Registro[] valores;

    public HashMap(){
        valores = new Registro[100];
    }
    public void put(Registro novo){
        int posicao = novo.hashCode();
        if(valores[posicao] == null){ // se não tem ninguem na posicao
            valores[posicao] = novo;
            System.out.println("Posicao "+novo.getCodigo() +" -- INSERINDO VALOR!");
        }else {
            System.out.println("Ops colisão..");
            Registro reg = valores[posicao];
            if (reg.getCodigo() == novo.getCodigo()) { // Verifica a Primeira posicao e encontar aquela chave
                reg.setNome(novo.getNome()); // muda o nome
                System.out.println("REGISTRO EXISTENTE, ATUALIZANDO VALOR..");
                return;
            }
            while (reg.getProximo() != null) { // enquanto tiver registro
                if (reg.getCodigo() == novo.getCodigo()) { // se o codico for igual do objeto passado
                    reg.setNome(novo.getNome()); // troca o nome
                    System.out.println("REGISTRO EXISTENTE, ATUALIZANDO VALOR..");
                    return;
                }
                reg = reg.getProximo();
            }
            // Se ele é o ultimo da Lista

            if(reg.getCodigo() == novo.getCodigo()) {
                reg.setNome(novo.getNome());
                System.out.println("REGISTRO EXISTENTE, ATUALIZANDO VALOR..");
            }

            reg.setProximo(novo); // COloquei o novo registro na ultima posicao
            System.out.println("REGISTRO INEXISTENTE, INSERINDO VALOR..");
        }
    }
    public Registro get(int codigo){
        Registro r = new Registro();
        r.setCodigo(codigo);
        int pos = r.hashCode();
        Registro resultado = valores[pos]; // tento encontrar o registro
        if(resultado != null && resultado.getCodigo() == codigo) // é o resultado que procuro?
            return resultado;
        else{
            while(resultado != null){ // enquanto tiver gente na lista
                resultado = resultado.getProximo();
                if(resultado != null && resultado.getCodigo() == codigo) // é quem procuro?
                    return resultado;
            }
        }
        return null;
    }
}
