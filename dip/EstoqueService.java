package dip;

public class EstoqueService implements IEstoqueService {
  
  public void adicionarItem(String codigo, String descricao, double preco, int quantidade, Estoque estoque) {
    int estoqueTamanho = estoque.getItensSize();
    
    for(int i = 0; i < estoqueTamanho; i++) {
      Item itemAtual = estoque.getItem(i);
      
      if(itemAtual.getCodigo() == codigo) {
        itemAtual.setQuantidade(itemAtual.getQuantidade() + quantidade);
        return;
      }
    }

    if(quantidade > 0 && preco > 0) {
      Item item = new Item(codigo, descricao, preco, quantidade);
      estoque.addItem(item);
    }
    
  }

  public Item retirarItem(String codigo, int quantidade, Estoque estoque) {
    int estoqueTamanho = estoque.getItensSize();
    
    for(int i = 0; i < estoqueTamanho; i++) {
      Item itemAtual = estoque.getItem(i);
      
      if(itemAtual.getCodigo() == codigo && itemAtual.getQuantidade() >= quantidade) {
        Item item = new Item(itemAtual.getCodigo(), itemAtual.getDescricao(), itemAtual.getPreco(), quantidade);
        itemAtual.setQuantidade(itemAtual.getQuantidade() - quantidade);
        return item;
      }
    }

    return null;
  }
}