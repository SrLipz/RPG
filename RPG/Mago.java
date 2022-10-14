public class Mago extends Personagem {

    private ArmaMago arma;

    public Mago () {
        super("Mago", 200, 20, 10);
    }

    @Override
    public void atacar () {
        int atqArqueiro;
        atqArqueiro = getAtqBase() + getAtqArma();

    }
    
    @Override
    public void defenderAtaque () {
        int defArqueiro;
        defArqueiro = getDefBase() + getDefArma();
    }
}
