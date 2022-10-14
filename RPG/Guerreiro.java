public class Guerreiro extends Personagem {

    private ArmaGuerreiro arma;


    public Guerreiro () {
        
        super("Guerreiro", 180, 30, 20);
        
    }

    public ArmaGuerreiro getArma() {
        return arma;
    }

    public void setArma(ArmaGuerreiro arma) {
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