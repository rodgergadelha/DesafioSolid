package isp;

public abstract class Entidade {
  private int dano;
  private int vida;
  private String info;

  public Entidade(int dano, int vida, String info) {
    this.dano = dano;
    this.vida = vida;
    this.info = info;
  }
  
  public int getDano() {
	 return dano;
  }

  public void setDano(int dano) {
	 this.dano = dano;
  }
  
  public int getVida() {
  	return vida;
  }
  
  public void setVida(int vida) {
  	this.vida = vida;
  }

  public String getInfo() {
  	return info;
  }
  
  public void setInfo(String info) {
  	this.info = info;
  }

  public void levarDano(int dano) {
     vida -= dano;
  }

  @Override
  public String toString() {
    return String.format("{vida: %d; dano: %d; info: %s}", vida, dano, info);
  }

}