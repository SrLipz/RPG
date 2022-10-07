public class Dragao extends Classe {

    private String classe = "Dragão";
    private int atqBase = 30;
    private int defBase = 30;
    private int vida = 300;

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

    @Override
    public String status(){
        String texto = String.format("Classe: %s\nVida: %d\nAtaque Base: %d\nDefesa Base: %d\n", getClasse(),getVida(), getAtqBase(), getDefBase());
            return texto;
    }
}
