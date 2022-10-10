public class Mago extends Personagem {

    public Mago () {
        super("Mago", 200, 20, 10);
    }

    public void varinha () {
        this.setAtqBase(this.getAtqBase()+16);
        this.setDefBase(this.getDefBase()+9);
    }

    public void cajado () {
        this.setAtqBase(this.getAtqBase()+13);
        this.setDefBase(this.getDefBase()+12);
    }

}
