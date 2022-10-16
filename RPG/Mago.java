public class Mago extends Personagem {

    private ArmaMago arma;

    public Mago (ArmaMago arma) {
        super("Mago", 200, 20, 10);
        this.arma = arma;
    }

    public ArmaMago getArma() {
        return arma;
    }

    public void setArma(ArmaMago arma) {
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
