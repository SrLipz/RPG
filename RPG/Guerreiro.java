public class Guerreiro extends Personagem {

    public Guerreiro () {
        super("Guerreiro", 180, 30, 20);
    }

    public void espada () {
        this.setAtqBase(this.getAtqBase()+10);
        this.setDefBase(this.getDefBase()+15);
    }

    public void machado () {
        this.setAtqBase(this.getAtqBase()+17);
        this.setDefBase(this.getDefBase()+8);
    }

}