public class Dragao extends Personagem {

    public Dragao () {
        super("Dragao", 300, 30, 30);
    }

    @Override
    public void atacar () {
        int atqDragao;
        atqDragao = getAtqBase();

    }
    
    @Override
    public void defenderAtaque () {
        int defDragao;
        defDragao = getDefBase();
    }

}
