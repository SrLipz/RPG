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
        this.setVida(this.getDefBase() - dano);
    }

}
