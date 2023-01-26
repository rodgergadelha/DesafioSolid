package isp;

import java.util.Random;

public class Personagem extends Entidade implements IAtacante, IMovel {
  
  private float chanceDeAtacar;

  public Personagem(int dano, int vida, String info, float chanceDeAtacar) {
    super(dano, vida, info);
    this.chanceDeAtacar = chanceDeAtacar;
  }

  public float getChanceDeAtacar() {
  	return chanceDeAtacar;
  }
  
  public void setChanceDeAtacar(float chanceDeAtacar) {
  	this.chanceDeAtacar = chanceDeAtacar;
  }
  
  public void atacar(Entidade alvo) {
    Random r = new Random();
    float resultadoDado = r.nextFloat();
    
    if(getVida() > 0 && chanceDeAtacar >= resultadoDado) {
      alvo.levarDano(getDano());
    }

    resultadoDado = r.nextFloat();
    
    if(getVida() > 0 && chanceDeAtacar >= resultadoDado) {
      setVida(getVida() - alvo.getDano());
    }

  }

  public void mover() {
    if(getVida() > 0) {
       System.out.println("Movido."); 
    }
  }

  
}