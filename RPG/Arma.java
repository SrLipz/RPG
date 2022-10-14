public class Arma {
    
    private String nomeArma;
    private int atqArma;
    private int defArma;

    public Arma (String nomeArma, int atqArma, int defArma){
        
        this.nomeArma = nomeArma;
        this.atqArma = atqArma;
        this.defArma = defArma;

    }

    public String getNomeArma() {
        return nomeArma;
    }

    public int getAtqArma() {
        return atqArma;
    }

    public int getDefArma() {
        return defArma;
    }

}