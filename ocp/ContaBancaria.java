package ocp;

public abstract class ContaBancaria {
  private double saldo;
  private String id;

  public ContaBancaria(String id) {
    this.id = id;
    this.saldo = 0;
  }
  
  public double getSaldo() {
  	return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return String.format("{saldo: %.2f; id: %s}", saldo, id);
  }

  public abstract void depositar(double deposito);

  public abstract boolean sacar(double saque);
  
}