package dip;

import java.util.ArrayList;

public class Pedido {
  private ArrayList<Item> itens;
  private Cliente cliente;

  public Pedido(Cliente cliente) {
    this.cliente = cliente;
    itens = new ArrayList<>();
  }

  public Item getItem(int index) {
  	return itens.get(index);
  }
  
  public void setItem(int index, Item item) {
    itens.set(index, item);
  }

  public void addItem(Item item) {
    itens.add(item);
  }

  public void removeItem(Item item) {
    itens.remove(item);
  }

  public int getItensSize() {
    return itens.size();
  }
  
  public Cliente getCliente() {
    return cliente;
  }
  
  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }
}