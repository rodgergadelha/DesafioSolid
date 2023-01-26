package lsp;

public abstract class ContaBancaria {
  private double saldo;
  private int id;

  public ContaBancaria(int id) {
    this.id = id;
    this.saldo = 0;
  }
  
  public double getSaldo() {
  	return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public int getId() {
    return id;
  }
  
  public void setId(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return String.format("{saldo: %.2f; id: %d}", saldo, id);
  }

  public abstract void depositar(double deposito);

  public abstract boolean sacar(double saque);
  
}