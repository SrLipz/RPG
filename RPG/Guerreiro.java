public class Guerreiro extends Personagem {

    private ArmaGuerreiro arma;


    public Guerreiro (ArmaGuerreiro arma) {
        
        super("Guerreiro", 180, 30, 20);
        this.arma = arma;
        
    }

    public ArmaGuerreiro getArma() {
        return arma;
    }

    public void setArma(ArmaGuerreiro arma) {
        this.arma = arma;
    }

    @Override
    public int atacar () {
        return this.getAtqBase() + this.getArma().getAtqArma();
    }
    
    @Override
    public void defenderAtaque (int ataqueDragao) {
        int defGuerreiro;
        defGuerreiro = this.getDefBase() + this.getArma().getDefArma();
        int dano = ataqueDragao - defGuerreiro;
        this.setVida(this.getDefBase() - dano);
    }

    public void defender() {
        
    }

}