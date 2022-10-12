public class Main {
    public static void main(String[] args) {
        
    Tela tela = new Tela();
    Partida partida = new Partida();

    tela.menuInicio();
    Personagem[] personagens = tela.menuPersonagem();
    partida.inicioPartida(personagens);
    
    }
}
