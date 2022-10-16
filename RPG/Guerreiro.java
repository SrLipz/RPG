public class Guerreiro extends Personagem {

    private ArmaGuerreiro arma;


    public Guerreiro (String nome, ArmaGuerreiro arma) {
        
        super(nome, "Guerreiro", 180, 30, 20);
        this.arma = arma;
        
    }

    public ArmaGuerreiro getArma() {
        return arma;
    }

    public void setArma(ArmaGuerreiro arma) {
        this.arma = arma;
    }

    @Override
    public int atacar () {
        return this.getAtqBase() + this.getArma().getAtqArma();
    }
    
    @Override
    public void defenderAtaque (int ataqueDragao) {
        int defComArma;
        defComArma = this.getDefBase() + this.getArma().getDefArma();
        int dano = ataqueDragao - defComArma;
        if (dano <= 0) {
            dano = 0;
        }
        this.setVida(this.getVida() - dano);
        System.out.printf("%s: \nDefendeu o ataque com %s,\npontos de defesa: %d\n", 
                            this.getClasse(), 
                            this.getArma().getNomeArma(), 
                            defComArma);
        System.out.printf("\nDano final: %d\n", dano);
        System.out.printf("Status de vida do %s: %d.\n", getClasse(), getVida());
    }

}