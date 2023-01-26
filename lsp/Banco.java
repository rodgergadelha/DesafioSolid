package lsp;

import java.util.ArrayList;

public class Banco {
  private ArrayList<ContaBancaria> contas;

  public Banco() {
    contas = new ArrayList<>();
  }

  public ContaBancaria getConta(int id) {
    int tamanhoContas = contas.size();

    for(int i = 0; i < tamanhoContas; i++) {
      ContaBancaria contaAtual = contas.get(i);
      
      if(contaAtual.getId() == id) {
        return contaAtual;
      }
    }

    return null;
  }

  public void addConta(ContaBancaria conta) {
    contas.add(conta);
  }

  public void removeConta(ContaBancaria conta) {
    contas.remove(conta);
  }

  public void removeConta(int id) {
    int tamanhoContas = contas.size();

    for(int i = 0; i < tamanhoContas; i++) {
      ContaBancaria contaAtual = contas.get(i);
      
      if(contaAtual.getId() == id) {
        contas.remove(contaAtual);
        return;
      }
    }  
  }
}