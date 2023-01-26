package dip;

public class PedidoQuantidade {
  public int quantidadeItens(Pedido pedido) {
    int pedidoItensTamanho = pedido.getItensSize(); 
    int quantidadeItens = 0;
    
    for(int i = 0; i < pedidoItensTamanho; i++) {
      quantidadeItens += pedido.getItem(i).getQuantidade();  
    }

    return quantidadeItens;
  }
}