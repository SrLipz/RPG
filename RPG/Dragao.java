public class Dragao extends Personagem {

    public Dragao () {
        super("DRAGAO", "Dragao", 300, 30, 30);
    }

    @Override
    public void atacar (Personagem personagem) {
        int atqComArma;
        atqComArma = this.getAtqBase();
        System.out.printf("%s: \nUsou sua bola de fogo para atacar o %s,\npontos de ataque: %d\n", 
                            this.getNome(), 
                            personagem.getClasse(), 
                            atqComArma);
    }
    
    @Override
    public void defenderAtaque (Personagem personagem) {
        int dano = (personagem.getAtqBase() + personagem.getArma().getAtqArma()) - this.getDefBase();
        if (dano < 0){
            dano = 0;
        }
        this.setVida(this.getVida() - dano);

        System.out.printf("%s: \nDefendeu o ataque com suas escamas,\npontos de defesa: %d\n", 
                                this.getNome(), 
                                this.getDefBase());
        System.out.println();  
        System.out.printf("DANO FINAL: %d", 
                                dano);
        System.out.printf("\nSTATUS DE VIDA DO %s: %d\n", 
                                this.getNome(), 
                                this.getVida());        
    }
}