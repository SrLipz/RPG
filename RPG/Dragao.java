public class Dragao extends Personagem {

    public Dragao () {
        super("Dragão", "Dragao", 300, 30, 30);
    }

    @Override
    public void atacar (Personagem personagem) {
        int atqComArma;
        atqComArma = this.getAtqBase();
        System.out.printf("%s: \nUsou sua bola de fogo para atacar o %s,\npontos de ataque: %d\n", 
        this.getClasse(), 
        personagem.getClasse(), 
        atqComArma);
    }
    
    @Override
    public void defenderAtaque (int ataquePersonagem) {
        int dano = ataquePersonagem - this.getDefBase();
        this.setVida(this.getVida() - dano);

        System.out.printf("%s: \nDefendeu o ataque com suas escamas,\npontos de defesa: %d\n", 
                                getClasse(), 
                                getDefBase());
        System.out.println();  
        System.out.printf("Dano final: %d", 
                                dano);
        System.out.printf("\nStatus de vida do %s: %d.\n", 
                                getClasse(), 
                                getVida());        
    }

    public void defenderAtaque(Personagem personagem) {
    }
}