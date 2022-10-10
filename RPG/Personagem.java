public class Personagem {
    
    protected String nome;
    protected String classe;
    protected int vida;
    protected int atqBase;
    protected int defBase;

    public Personagem(String classe, int vida, int atqBase, int defBase) {
        this.classe = classe;
        this.vida = vida;
        this.atqBase = atqBase;
        this.defBase = defBase;
    }

    public Personagem() {

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setAtqBase(int atqBase) {
        this.atqBase = atqBase;
    }

    public void setDefBase(int defBase) {
        this.defBase = defBase;
    }

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

