package srp;

public class EstoqueView {
  public void imprimirItens(Estoque estoque) {
    int ItensTamanho = estoque.getItensSize();

    System.out.println("** Estoque **");
      
    for(int i = 0; i < ItensTamanho; i++) {
      System.out.println(estoque.getItem(i));
    }
  }
}