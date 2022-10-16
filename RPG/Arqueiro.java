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
        System.out.printf("%s: \nUsou %s para atacar o %s,\npontos de ataque: %d\n", 
                            this.getNome(), 
                            this.getArma().getNomeArma(),
                            personagem.getClasse(),  
                            atqComArma);
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