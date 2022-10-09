public class Classe {
    
    private String nome;
    private String classe;
    private int vida;
    private int atqBase;
    private int defBase;

    public String getNome() {
        return nome;
    }

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

    void atacar() {
        System.out.print("Atacou");
    }
    
    void defender() {
        System.out.print("defender");
    }

    void usarArma() {
        System.out.print("Usou arma x");
    }

    public void status(){
        //String texto = String.format("Classe: %s\nAtaque base: %d\nDefesa base: %d\nVida: %d", getClasse(), getAtqBase(), getDefBase(), getVida());
        System.out.printf("Classe: %s\nVida: %d\nAtaque Base: %d\nDefesa Base: %d\n", 
                            getClasse(),
                            getVida(), 
                            getAtqBase(), 
                            getDefBase());
    }
}

