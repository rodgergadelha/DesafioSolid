package lsp;

public class TransacaoBanco {

  public void sacar(int id, double saque, Banco banco) {
    ContaBancaria conta = banco.getConta(id);
    
    if(conta != null) conta.sacar(saque);
  }

  public void depositar(int id, double deposito, Banco banco) {
    ContaBancaria conta = banco.getConta(id);
    
    if(conta != null) conta.depositar(deposito);
  }
}