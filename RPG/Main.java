import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        
    Tela tela = new Tela();

    tela.menuInicio();
    tela.menuPrincipal();
    tela.menuInicioTurno();
    tela.turno();
    
    }
}