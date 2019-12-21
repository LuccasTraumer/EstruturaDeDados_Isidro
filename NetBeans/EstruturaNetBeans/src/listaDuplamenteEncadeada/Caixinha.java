package listaDuplamenteEncadeada;

public class Caixinha {
    private Caixinha anterior;
    private Caixinha proximo;
    private int elemento;
    
    public int getElemento(){
        return this.elemento;
   }
    public Caixinha getProximo(){
        return this.proximo;
   }
   public Caixinha getAnterior(){
       return this.anterior;
  }
   public void setElemento(int elem){
       this.elemento = elem;
  }
   public void setAnterior(Caixinha ants){
       this.anterior = ants;
   }
   public void setProximo(Caixinha prox){
       this.proximo = prox;
  }
}
