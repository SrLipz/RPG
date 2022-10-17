//* Personagem jogavel, ele servirá para atacar os personagens não jogaveis *//

public class Mago extends Personagem {

    private ArmaMago arma;

    public Mago (String nome, ArmaMago arma) {
        super(nome, "Mago", 200, 20, 10);
        this.arma = arma;
    }

    public ArmaMago getArma() {
        return arma;
    }

    public void setArma(ArmaMago arma) {
        this.arma = arma;
    }

    @Override
    public void atacar (Personagem personagem) {
        double atqComArma;
        atqComArma = this.getAtqBase() + this.getArma().getAtqArma();
        System.out.printf("%s (%s): \nUsou %s para atacar o %s,\npontos de ataque: %.1f\n", 
                            this.getNome(),
                            this.getClasse(), 
                            this.getArma().getNomeArma(),
                            personagem.getNome(),  
                            atqComArma);
    }
    
    @Override
    public void defenderAtaque (Personagem personagem) {
        double defComArma;
        defComArma = this.getDefBase() + this.getArma().getDefArma();
        double dano = personagem.getAtqBase() - defComArma;
        if (dano <= 0) {
            dano = 0;
        }
        this.setVida(this.getVida() - dano);
        System.out.printf("%s (%s): \nDefendeu o ataque com %s,\npontos de defesa: %.1f\n", 
                            this.getNome(),
                            this.getClasse(),
                            this.getArma().getNomeArma(), 
                            defComArma);
        System.out.printf("\nDANO FINAL: %.1f\n", dano);
        System.out.printf("STATUS DE VIDA DO %s (%s): %.1f\n", 
                                this.getNome(),
                                this.getClasse(),
                                this.getVida());
    }

}
