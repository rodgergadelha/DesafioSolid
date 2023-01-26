package dip;

public class Item {
  private String codigo, descricao;
  private double preco;
  private int quantidade;

  public Item(String codigo, String descricao, double preco, int quantidade) {
    this.codigo = codigo;
    this.descricao = descricao;
    this.preco = preco;
    this.quantidade = quantidade;
  }
  
  public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
  
	public int getQuantidade() {
		return quantidade;
	}
  
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

  @Override
  public String toString() {
    return String.format("{codigo: %s; descricao: %s; preco: %.2f; quantidade: %d}", codigo, descricao, preco, quantidade);
  }

  
}