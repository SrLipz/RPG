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