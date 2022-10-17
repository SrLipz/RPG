//* A partir dessa classe, serão criados personagens que serão utilizados pelo jogador para combate durante o jogo *//

public abstract class Personagem {
    
    private boolean defendendo;
    private String nome;
    private String classe;
    private double vida;
    private double atqBase;
    private double defBase;
    private Arma arma;

    public Personagem(String nome, String classe, double vida, double atqBase, double defBase) {
        this.nome = nome;
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

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getAtqBase() {
        return atqBase;
    }

    public void setAtqBase(double atqBase) {
        this.atqBase = atqBase;
    }

    public double getDefBase() {
        return defBase;
    }

    public void setDefBase(double defBase) {
        this.defBase = defBase;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
    
    public abstract void atacar(Personagem personagens);
    
    public abstract void defenderAtaque(Personagem personagens);

}