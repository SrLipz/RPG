import java.util.Scanner;

public class Tela {

    

    Scanner scanner = new Scanner(System.in);
    
    public void menuInicio () {
        
        System.out.println("Olá, seja bem vindo ao Heroes of OOP! \n\nVamos começar uma nova partida?\n");
        System.out.println("1 - Iniciar uma partida \n2 - Sair do jogo");

        int menu = scanner.nextInt();
        System.out.println();  

        switch(menu) {

            case 1: System.out.println("Certo, vamos em frente! O que deseja fazer?\n"); break;
            case 2: this.encerrarJogo(); break;
            default: System.out.println("Opção inválida! Digite uma opção correta!");

        }
    }

    public Personagem[] menuPersonagem () {

        Personagem[] personagens = new Personagem[3];

        for (int i = 0; i < 3; i++) {

            System.out.println("1 - Criar novo personagem \n2 - Começar partida \n3 - Sair do jogo");
            int menu2 = scanner.nextInt();
            System.out.println();

            switch(menu2) {

                case 1: 
                System.out.println("Qual o tipo de personagem que deseja criar?\n");
                System.out.println("1 - Arqueiro \n2 - Guerreiro \n3 - Mago");
                int menuPersonagem = scanner.nextInt();
                System.out.println();
        
                System.out.println("Selecione a arma:\n");
        
                switch(menuPersonagem) {
                    
                    case 1:
                    
                    System.out.println("1 - Arco Longo \n2 - Balestra");                   
                    int menuArma1 = scanner.nextInt();

                    switch (menuArma1) {
                        case 1: personagens[i] = new ArcoLongo(); break;
                        case 2: personagens[i] = new Balestra(); break;
                        default: System.out.println("Opção inválida! Digite uma opção correta!");
                    }
                    
                    break;
                    
                    case 2:

                    System.out.println("1 - Espada \n2 - Machado");
                    int menuArma2 = scanner.nextInt();
                    switch (menuArma2) {
                        case 1: personagens[i] = new Espada(); break;
                        case 2: personagens[i] = new Machado(); break;
                        default: System.out.println("Opção inválida! Digite uma opção correta!");
                    }
                    
                    break;
                    
                    case 3:
                    
                    System.out.println("1 - Cajado \n2 - Varinha");
                    int menuArma3 = scanner.nextInt();
                    switch (menuArma3) {
                        case 1: personagens[i] = new Cajado(); break;
                        case 2: personagens[i] = new Varinha(); break;
                        default: System.out.println("Opção inválida! Digite uma opção correta!");
                    }

                    break;
                    
                    default: System.out.println("Opção inválida! Digite uma opção correta!");
                    
                    }
                

                break;
                
                case 2: 
                System.out.println("Se prepare! A partida irá começar.\n"); 
                i = 4;
                break;
                
                case 3: 
                this.encerrarJogo(); break;
                
                default: System.out.println("Opção inválida! Digite uma opção correta!");

            }
        } 
        return personagens;
    }

    public void encerrarJogo () {
        System.out.println("O jogo foi encerrado!");
        System.exit(0);
    }

    public void menuTurno() {
        System.out.println("1 - Próximo turno. \n2 - Deseja sair do jogo?");                   
        int fimTurno = scanner.nextInt();

        switch (fimTurno) {
            case 1: break;
            case 2: this.encerrarJogo(); break;
            default: System.out.println("Opção inválida! Digite uma opção correta!");
        }
    }

}
