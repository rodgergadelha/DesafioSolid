package dip;

public interface IEstoqueService {
  void adicionarItem(String codigo, String descricao, double preco, int quantidade, Estoque estoque);

  Item retirarItem(String codigo, int quantidade, Estoque estoque);
}