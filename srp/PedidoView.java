package srp;

public class PedidoView {
  public void imprimirItens(Pedido pedido) {
    int ItensTamanho = pedido.getItensSize();
    
    System.out.println("** Pedido **");
    System.out.println("** Cliente: "+pedido.getCliente().getNome()+" **");
    
    for(int i = 0; i < ItensTamanho; i++) {
      System.out.println(pedido.getItem(i));
    }
  }
}