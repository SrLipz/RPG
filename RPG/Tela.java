import java.util.Scanner;

public class Tela {

    Scanner scanner = new Scanner(System.in);
    
    public void menuInicio () {

        System.out.println("Olá, seja bem vindo ao Heroes of OOP! \n\nVamos começar uma nova partida?\n");

        for (boolean i = true; i == true;) {

            System.out.println("1 - Iniciar uma partida \n2 - Sair do jogo\n");

            int menu = scanner.nextInt();
            System.out.println();  

            switch(menu) {

                case 1: 
                System.out.println("Certo, vamos em frente!\n");
                i = false;
                break;
                
                case 2: 
                this.encerrarJogo(); 
                break;
                
                default: System.out.println("Opção inválida! Digite uma opção correta.\n");
            }
        }
    }

    public Personagem[] menuPersonagem () {

        Personagem[] personagens = new Personagem[3];

        System.out.println("O que deseja fazer?\n");

        boolean k = false; // para verificar se um personagem pelo menos já foi criado

        for (int i = 0; i < 3 ;i++) {

            System.out.println(i);

            System.out.println("1 - Criar novo personagem \n2 - Começar partida \n3 - Sair do jogo\n");
            int menu2 = scanner.nextInt();
            System.out.println();

            if (menu2 == 1){ 
                k = true; // para verificar se um personagem foi criado
            }

            switch(menu2) {
                case 1: 

                System.out.println("Qual o tipo de personagem que deseja criar?\n");
                System.out.println("1 - Arqueiro \n2 - Guerreiro \n3 - Mago\n");
                int menuPersonagem = scanner.nextInt();
                System.out.println();
            
                System.out.println("Selecione a arma:\n");
            
                switch(menuPersonagem) {
                        
                    case 1:

                    for (boolean j = true; j == true;) {

                        System.out.println("1 - Arco Longo \n2 - Balestra\n");                   
                        int menuArma1 = scanner.nextInt();
                        System.out.println();

                        switch (menuArma1) {
                            case 1: personagens[i] = new ArcoLongo(); j = false; break;
                            case 2: personagens[i] = new Balestra(); j = false; break;
                            default: System.out.println("Opção inválida! Digite uma opção correta!");
                        }
                    }

                    break;
                        
                    case 2:

                    for (boolean j = true; j == true;) {

                        System.out.println("1 - Espada \n2 - Machado\n");
                        int menuArma2 = scanner.nextInt();
                        System.out.println();

                        switch (menuArma2) {
                            case 1: personagens[i] = new Espada(); j = false; break;
                            case 2: personagens[i] = new Machado(); j = false; break;
                            default: System.out.println("Opção inválida! Digite uma opção correta!");
                        }
                    }

                    break;
                        
                    case 3:
                        
                    for (boolean j = true; j == true;) {
                            
                        System.out.println("1 - Cajado \n2 - Varinha\n");
                        int menuArma3 = scanner.nextInt();
                        System.out.println();

                        switch (menuArma3) {
                            case 1: personagens[i] = new Cajado(); j = false; break;
                            case 2: personagens[i] = new Varinha(); j = false; break;
                            default: System.out.println("Opção inválida! Digite uma opção correta!");
                        }
                    }

                    break;
                        
                    default: System.out.println("Opção inválida! Digite uma opção correta!");
                        
                    }

                break;
                    
                case 2:

                if (k == true) {
                    System.out.println("Se prepare! A partida irá começar.\n");
                    i = 4;
                } else {
                    System.out.println("Você não pode começar a partida sem ao menos ter criado pelo menos um personagem.\n");
                    i--;
                }

                break;
                    
                case 3: 
                this.encerrarJogo(); 
                break;
                    
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
        System.out.println();

        switch (fimTurno) {
            case 1: break;
            case 2: this.encerrarJogo(); break;
            default: System.out.println("Opção inválida! Digite uma opção correta!");
        }
    }
}