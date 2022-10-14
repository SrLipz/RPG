public class Mago extends Personagem {

    private ArmaMago arma;

    public Mago (ArmaMago arma) {
        super("Mago", 200, 20, 10);
    }

    public ArmaMago getArma() {
        return arma;
    }

    public void setArma(ArmaMago arma) {
        this.arma = arma;
    }

    @Override
    public int atacar () {
        return this.getAtqBase() + this.getArma().getAtqArma();
    }
    
    @Override
    public void defenderAtaque (int ataqueDragao) {
        int defMago;
        defMago = this.getDefBase() + this.getArma().getDefArma();
        int dano = ataqueDragao - defMago;
        this.setVida(this.getDefBase() - dano);
    }
}
