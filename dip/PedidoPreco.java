package dip;

public class PedidoPreco {
  public double precoTotal(Pedido pedido) {
    int pedidoItensTamanho = pedido.getItensSize();
    double precoTotal = 0;
    
    for(int i = 0; i < pedidoItensTamanho; i++) {
      Item itemAtual = pedido.getItem(i);
      precoTotal += itemAtual.getPreco() * itemAtual.getQuantidade();  
    }

    return precoTotal;
  }
}