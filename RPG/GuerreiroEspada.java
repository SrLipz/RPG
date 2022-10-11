public class GuerreiroEspada extends Guerreiro {
    
    private int atqBaseArma = 10;
    private int defBaseArma = 15;
    
    private int getAtqBaseArma() {
        return atqBaseArma;
    }

    private int getDefBaseArma() {
        return defBaseArma;
    }

    @Override
    public void atacar (){
        int atqComArma;
        atqComArma = getAtqBase() + getAtqBaseArma();
        System.out.printf("Guerreiro atacou com uma força %d.%n", atqComArma);
    }
    
    @Override
    public void defender (){
        int defComArma;
        defComArma = getDefBase() + getDefBaseArma();
        System.out.printf("Guerreiro defendeu com uma força %d.%n", defComArma);
    }

}
