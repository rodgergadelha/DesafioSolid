package isp;

public class Dragao extends Entidade implements IMovel, IVoador {
  private boolean voando;
  
  public Dragao() {
    super(10, 20, "Dragão.");
    voando = false;
  }
  
  public void mover() {
    if(getVida() > 0) System.out.println("Moveu-se lentamente.");
  }

  public void voar() {
    if(getVida() > 0 && !voando) {
      System.out.println("Voando bem alto.");
      setDano((int)(getDano() * 1.5)); 
    }
  }

  public void pousar() {
    if(getVida() > 0 && voando) {
      System.out.println("Pousou.");
      setDano((int)(getDano() / 1.5)); 
    }
  }
}