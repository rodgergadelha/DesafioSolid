package srp;

public class PedidoService {
  public void pedirItem(String itemCodigo, int quantidade, Pedido pedido, Estoque estoque) {
    EstoqueService es = new EstoqueService();
    Item itemPedido = es.retirarItem(itemCodigo, quantidade, estoque);
    
    if(itemPedido != null) {
      pedido.addItem(itemPedido);
    }else{
      System.out.println("Não foi possível retirar o item.");
    }
  }

  public void devolverItem(String codigo, int quantidade, Pedido pedido, Estoque estoque) {
    int pedidoTamanho = pedido.getItensSize();
    
    for(int i = 0; i < pedidoTamanho; i++) {
      Item itemAtual = pedido.getItem(i);
      
      if(itemAtual.getCodigo() == codigo && itemAtual.getQuantidade() >= quantidade) {
        EstoqueService es = new EstoqueService();
        
        es.adicionarItem(itemAtual.getCodigo(), "", 0, quantidade, estoque);
        
        itemAtual.setQuantidade(itemAtual.getQuantidade() - quantidade);
        
        if(itemAtual.getQuantidade() == 0) pedido.removeItem(itemAtual);
        
        return;
      }
    }
  }

}