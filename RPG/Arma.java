//* A partir dessa classe, serão criados armamentos que serão usados pelos personagens para combate durante o jogo *//

public class Arma {
    
    private String nomeArma;
    private double atqArma;
    private double defArma;

    public Arma (String nomeArma, double atqArma, double defArma){
        
        this.nomeArma = nomeArma;
        this.atqArma = atqArma;
        this.defArma = defArma;

    }

    public String getNomeArma() {
        return nomeArma;
    }

    public double getAtqArma() {
        return atqArma;
    }

    public double getDefArma() {
        return defArma;
    }

}