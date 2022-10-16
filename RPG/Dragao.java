public class Dragao extends Personagem {

    public Dragao () {
        super("Dragao", 300, 30, 30);
    }

    @Override
    public int atacar () {
        return this.getAtqBase();
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
}