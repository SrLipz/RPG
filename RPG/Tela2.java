import java.util.Scanner;

public class Tela2 {
    
    public void menuInicio () {

        System.out.println("Olá, seja bem vindo ao Heroes of OOP! \n\nVamos começar uma nova partida?\n");
        
        Scanner scanner = new Scanner(System.in);
        boolean valido;
        
        do {
            System.out.println("1 - Iniciar uma partida \n2 - Sair do jogo\n");
            int opcaoMenuInicio = scanner.nextInt();
            
            valido = opcaoMenuInicio == 1 || opcaoMenuInicio == 2;

            if (!valido) {
                System.out.println("Opção inválida! Digite uma opção correta.\n");
            } else {
                if (opcaoMenuInicio == 1) {
                    System.out.println("Certo, vamos em frente!\n");
                    break;
                } else if (opcaoMenuInicio == 2) {
                        this.encerrarJogo(); 
                        break;
                }
            }
        } while (!valido);
    }

    public void encerrarJogo() {
        System.out.println("O jogo foi encerrado!");
        System.exit(0);
    }

    public void menuEscolhaPersonagem () {

        System.out.println("O que deseja fazer?\n");

        do {
        System.out.println("1 - Criar novo personagem \n2 - Começar partida \n3 - Sair do jogo\n");
        int menu2 = scanner.nextInt();
        } while();


    }


    public void menuFimTurno() {

        System.out.println("\nFim de turno!\n");
        int opcaoMenuFimTurno;
        boolean valido;

        do { 
            System.out.println("1 - Próximo turno. \n2 - Deseja sair do jogo?\n\n");             
            int fimTurno = scanner.nextInt();
            System.out.println();

            valido = opcaoMenuFimTurno == 1 || opcaoMenuFimTurno == 2;

            if (!valido){
                System.out.println("Opção inválida! Digite uma opção correta!");
            } else {
                if (opcaoMenuFimTurno == 1) {
                    break;
                } else if (opcaoMenuFimTurno == 2) {
                    this.encerrarJogo(); break;
                }
            }
        } while(!valido);
        
    }   
}