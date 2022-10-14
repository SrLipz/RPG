public abstract class Personagem {
    
    private boolean defendendo;
    private String nome;
    private String classe;
    private int vida;
    private int atqBase;
    private int defBase;
    private Arma arma;

    public Personagem(String classe, int vida, int atqBase, int defBase) {
        this.classe = classe;
        this.vida = vida;
        this.atqBase = atqBase;
        this.defBase = defBase;
        this.defendendo = false;
    }

    public boolean isDefendendo() {
        return defendendo;
    }

    public void setDefendendo(boolean defendendo) {
        this.defendendo = defendendo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtqBase() {
        return atqBase;
    }

    public void setAtqBase(int atqBase) {
        this.atqBase = atqBase;
    }

    public int getDefBase() {
        return defBase;
    }

    public void setDefBase(int defBase) {
        this.defBase = defBase;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
    
    public abstract int atacar();
    
    public abstract void defenderAtaque(int ataqueDragao);

}