public class Main {
    public static void main(String[] args) {

        Tela tela = new Tela();

        tela.menuInicio();
        tela.inicioPartida();

        /*/ System.out.println("1 - Criar novo personagem \n2 - Começar partida \n3 - Sair do jogo");
        int menu2 = leitor.nextInt();
        System.out.println();
        
        switch(menu2) {

            case 1: 
            System.out.println("Qual o tipo de personagem que deseja criar?\n");
            System.out.println("1 - Arqueiro \n2 - Guerreiro \n3 - Mago");
            int menuPersonagem = leitor.nextInt();
            System.out.println();

            System.out.println("Selecione a arma:\n");

            switch(menuPersonagem) {
                
                case 1:
                System.out.println("1 - Arco Longo \n2 - Balestra"); 
                int menuArma1 = leitor.nextInt();
                break;
                
                case 2:
                System.out.println("1 - Espada \n2 - Machado");
                int menuArma2 = leitor.nextInt();
                break;
                
                case 3:
                System.out.println("1 - Varinha \n2 - Cajado");
                int menuArma3 = leitor.nextInt();
                break;
                
                default: System.out.println("Opção inválida! Digite uma opção correta!");
            }
            break;
            
            case 2: 
            System.out.println("Se prepare! A partida irá começar.\n"); break;
            
            case 3: 
            System.out.println("O jogo foi encerrado!"); System.exit(0);
            
            default: System.out.println("Opção inválida! Digite uma opção correta!");

        }
        /* */
    }
}
