public class Classe {
    
    private String classe;
    private int atqBase;
    private int defBase;
    private int vida;
    private String nomeArma;
    private int atqArma;
    private int defArma;


    public String getClasse() {
        return classe;
    }
    public int getAtqBase() {
        return atqBase;
    }
    public int getDefBase() {
        return defBase;
    }
    public int getVida() {
        return vida;
    }
    public String getNomeArma(){
        return nomeArma;
    }
    public int getAtqArma(){
        return atqArma;
    }
    public int getDefArma(){
        return defArma;
    }

    public String status(){
        //String texto = String.format("Classe: %s\nAtaque base: %d\nDefesa base: %d\nVida: %d", getClasse(), getAtqBase(), getDefBase(), getVida());
        String texto = String.format("Classe: %s\nVida: %d\nArma: %s\nAtaque Base: %d(+%d)\nDefesa Base: %d(+%d)\n", getClasse(),getVida(), getNomeArma(), getAtqBase(), getAtqArma(), getDefBase(), getDefBase());
            return texto;
    }
}

