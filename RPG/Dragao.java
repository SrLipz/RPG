//* Personagem não jogavel, ele servirá para atacar os personagens jogaveis *//

public class Dragao extends Personagem {

    public Dragao () {
        super("DRAGAO", "Dragao", 300, 30, 30);
    }

    @Override
    public void atacar (Personagem personagem) {
        double atqComArma;
        atqComArma = this.getAtqBase();
        System.out.printf("%s: \nUsou sua bola de fogo para atacar o %s,\npontos de ataque: %.1f\n", 
                            this.getNome(), 
                            personagem.getClasse(), 
                            atqComArma);
    }
    
    @Override
    public void defenderAtaque (Personagem personagem) {
        double dano = (personagem.getAtqBase() + personagem.getArma().getAtqArma()) - this.getDefBase();
        if (dano < 0){
            dano = 0;
        }
        this.setVida(this.getVida() - dano);

        System.out.printf("%s: \nDefendeu o ataque com suas escamas,\npontos de defesa: %.1f\n", 
                                this.getNome(), 
                                this.getDefBase());
        System.out.println();  
        System.out.printf("DANO FINAL: %.1f", 
                                dano);
        System.out.printf("\nSTATUS DE VIDA DO %s: %.1f\n", 
                                this.getNome(), 
                                this.getVida());        
    }

}