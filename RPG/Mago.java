public class Mago extends Personagem {

    private ArmaMago arma;

    public Mago () {
        super("Mago", 200, 20, 10);
    }

    public ArmaMago getArma() {
        return arma;
    }

    public void setArma(ArmaMago arma) {
        this.arma = arma;
    }

    @Override
    public void atacar () {
        int atqArqueiro;
        atqArqueiro = getAtqBase() + arma.getAtqArma();

    }
    
    @Override
    public void defenderAtaque () {
        int defArqueiro;
        defArqueiro = getDefBase() + arma.getDefArma();
    }
}
