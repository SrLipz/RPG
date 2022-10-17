//* Personagem jogavel, ele servirá para atacar os personagens não jogaveis *//

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
        this.setVida(getVida() - dano);
        System.out.printf("%s (%s): \nDefendeu o ataque com %s,\npontos de defesa: %.1f\n", 
                            this.getNome(),
                            this.getClasse(), 
                            this.getArma().getNomeArma(),
                            defComArma);
        System.out.printf("\nDANO FINAL: %.1f\n", dano);
        System.out.printf("STATUS DE VIDA DO %s (%s): %.1f\n", this.getNome(), this.getClasse(), this.getVida());
    }

    public int acrescimoDef() {
        return 10;
    }

}