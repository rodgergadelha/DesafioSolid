package dip;

import java.util.ArrayList;

public class Estoque {
  private ArrayList<Item> itens;

  public Estoque() {
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
}