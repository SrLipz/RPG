public class Balestra extends Arqueiro {
    
    private String arma = "Balestra";
    private int atqBaseArma = 15;
    private int defBaseArma = 10;

    public String getArma() {
        return arma;
    }
    
    public int getAtqBaseArma() {
        return atqBaseArma;
    }

    public int getDefBaseArma() {
        return defBaseArma;
    }

    @Override
    public void atacar () {
        int atqComArma;
        atqComArma = getAtqBase() + getAtqBaseArma();
        System.out.printf("%s usou a arma %s, com uma força total %d.%n", getClasse(), getArma(), atqComArma);
    }
    
    @Override
    public void defender () {
        int defComArma;
        defComArma = getDefBase() + getDefBaseArma();
        System.out.printf("Guerreiro defendeu com uma força %d.%n", defComArma);
    }

}