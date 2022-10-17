public class Arqueiro extends Personagem {

    private ArmaArqueiro arma;

    public Arqueiro (String nome, ArmaArqueiro arma) {
        super(nome, "Arqueiro", 160, 20, 30);
        this.arma = arma;

    }

    public ArmaArqueiro getArma() {
        return arma;
    }

    public void setArma(ArmaArqueiro arma) {
        this.arma = arma;
    }
    
    @Override
    public void atacar (Personagem personagem) {
        int atqComArma;
        atqComArma = this.getAtqBase() + this.getArma().getAtqArma();
        System.out.printf("%s (%s): \nUsou %s para atacar o %s,\npontos de ataque: %d\n", 
                            this.getNome(),
                            this.getClasse(), 
                            this.getArma().getNomeArma(),
                            personagem.getNome(),  
                            atqComArma);
    }
    
    @Override
    public void defenderAtaque (Personagem personagem) {
        int defComArma;
        defComArma = this.getDefBase() + this.getArma().getDefArma();
        int dano = personagem.getAtqBase() - defComArma;
        if (dano <= 0) {
            dano = 0;
        }
        this.setVida(getVida() - dano);
        System.out.printf("%s (%s): \nDefendeu o ataque com %s,\npontos de defesa: %d\n", 
                            this.getNome(),
                            this.getClasse(), 
                            this.getArma().getNomeArma(),
                            defComArma);
        System.out.printf("\nDANO FINAL: %d\n", dano);
        System.out.printf("STATUS DE VIDA DO %s (%s): %d\n", this.getNome(), this.getClasse(), this.getVida());
    }

}