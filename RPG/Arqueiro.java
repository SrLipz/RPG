public class Arqueiro extends Personagem {

    private ArmaArqueiro arma;

    public Arqueiro (ArmaArqueiro arma) {
        super("Arqueiro", 160, 20, 30);
        this.arma = arma;

    }

    public ArmaArqueiro getArma() {
        return arma;
    }

    public void setArma(ArmaArqueiro arma) {
        this.arma = arma;
    }
    
    @Override
    public int atacar () {
        return this.getAtqBase() + this.getArma().getAtqArma();
    }
    
    @Override
    public void defenderAtaque (int ataqueDragao) {
        int defArqueiro;
        defArqueiro = this.getDefBase() + this.getArma().getDefArma();
        int dano = ataqueDragao - defArqueiro;
        this.setVida(this.getDefBase() - dano);
    }

}