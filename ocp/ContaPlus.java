package ocp;

public class ContaPlus extends ContaBancaria{

  public ContaPlus(String id) {
    super(id);
  }
  
  public void depositar(double deposito) {
    setSaldo(getSaldo() + deposito * 1.005);
  }
  
  public boolean sacar(double saque) {
    if(getSaldo() >= saque) {
      setSaldo(getSaldo() - saque);
      return true;
    }

    return false;
  }

  
}