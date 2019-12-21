package listaDuplamenteEncadeada;

public class ListaDuplamente {
    private Caixinha inicio;
    
    public ListaDuplamente(){
        this.inicio = null;
    }
    public boolean isEmpty(){
        return this.inicio == null;
    }
    public void inserir(int elem){
        Caixinha novo = new Caixinha();
        novo.setElemento(elem);
        if(isEmpty()){
            novo.setProximo(novo);
            novo.setAnterior(novo);
            inicio = novo;
        }else{
            Caixinha temp = inicio;
            while(temp.getProximo() != inicio){
                temp = temp.getProximo();
            }
            inicio.setAnterior(novo);
            temp.setProximo(novo);
            novo.setAnterior(temp);
            novo.setProximo(inicio);
        
       }
   }
    public void exibirValores(){
        Caixinha temp = inicio;
        do{
            System.out.println(temp.getElemento());
            temp = temp.getProximo();
        }while(temp != inicio);
   }
   public int removerInicio(){
       Caixinha temp = inicio;
       int valor = temp.getElemento();
       inicio = temp.getProximo();
       valor = inicio.getElemento();
       inicio.setAnterior(temp.getAnterior());
       valor = inicio.getAnterior().getElemento();
       return inicio.getElemento();
  }
   public int removerFinal(){
      Caixinha temp = inicio;
      temp = temp.getAnterior();
      temp = temp.getAnterior();
      temp.setProximo(inicio);
      temp = temp.getProximo();
      inicio = temp;
      return inicio.getElemento();
  }
}
