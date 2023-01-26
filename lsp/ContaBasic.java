package lsp;

public class ContaBasic extends ContaBancaria{

  public ContaBasic(int id) {
    super(id);
  }
  
  public void depositar(double deposito) {
    setSaldo(getSaldo() + deposito);
  }
  
  public boolean sacar(double saque) {
    if(getSaldo() >= saque) {
      setSaldo(getSaldo() - saque);
      return true;
    }

    return false;
  }
}