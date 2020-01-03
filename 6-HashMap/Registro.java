public class Registro {
    private int codigo;
    private String nome;
    private Registro proximo;
    public Registro(){
        this.proximo = null;
    }

    public Registro(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }
    public int getCodigo(){return this.codigo;}
    public String getNome(){return this.nome;}
    public Registro getProximo(){return this.proximo;}

    public void setProximo(Registro proximo){ this.proximo = proximo;}
    public void setCodigo(int cod){
        this.codigo = cod;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int hashCode(){
        return codigo % 100;
    }
}
