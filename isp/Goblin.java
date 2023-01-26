package isp;

public class Goblin extends Entidade implements IFalador, IMovel {
  
  public Goblin() {
    super(1, 3, "Goblin.");
  }
  
  public void mover() {
    if(getVida() > 0) System.out.println("Moveu-se bem rápido.");
  }

  public void falar() {
    if(getVida() > 0) System.out.println("HA HA HA HA!");
  }
}