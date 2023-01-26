package ocp;

public class ContaBasic extends ContaBancaria{

  public ContaBasic(String id) {
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