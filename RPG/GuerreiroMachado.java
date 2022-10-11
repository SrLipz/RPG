public class GuerreiroMachado extends Guerreiro {
    
    private int atqBaseArma = 17;
    private int defBaseArma = 8;
    
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