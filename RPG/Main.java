public class Main {
    public static void main(String[] args) {
        
    Tela tela = new Tela();

    tela.menuInicio();
    Personagem[] personagens = tela.menuPersonagem();

    Personagem arqueiro = new Arqueiro(ArcoLongo);
    
    }
}
