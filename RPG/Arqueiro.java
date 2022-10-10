public class Arqueiro extends Personagem {

    public Arqueiro () {
        super("Arqueiro", 160, 20, 30);
    }

    public void arcoLongo () {
        this.setAtqBase(this.getAtqBase()+12);
        this.setDefBase(this.getDefBase()+13);
    }

    public void balestra () {
        this.setAtqBase(this.getAtqBase()+15);
        this.setDefBase(this.getDefBase()+10);
    }
}
