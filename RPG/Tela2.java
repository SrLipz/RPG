import java.util.Scanner;

public class Tela2 {
    
    public int menuInicio () {

        System.out.println("Olá, seja bem vindo ao Heroes of OOP! \n\nVamos começar uma nova partida?\n");
        
        Scanner scanner = new Scanner(System.in);
        int opcaoMenuInicio;
        boolean valido;
        
        do {
            System.out.println("1 - Iniciar uma partida \n2 - Sair do jogo\n");
            opcaoMenuInicio = scanner.nextInt();
            
            valido = opcaoMenuInicio == 1 || opcaoMenuInicio == 2;

            if (!valido) {
                System.out.println("Opção inválida! Digite uma opção correta.\n");
            } 
            else {
                if (opcaoMenuInicio == 1) {
                    System.out.println("Certo, vamos em frente!\n");
                    break;
                } else {
                    if (opcaoMenuInicio == 2) {
                        this.encerrarJogo(); 
                        break;
                    }
                }
            }
        } while(!valido);
    
        return opcaoMenuInicio;
    }

    public void encerrarJogo() {
        System.out.println("O jogo foi encerrado!");
        System.exit(0);
    }

    public int menuEscolhaPersonagem (int opcaoMenuInicio) {

        System.out.println("O que deseja fazer?\n");

        do {
        System.out.println("1 - Criar novo personagem \n2 - Começar partida \n3 - Sair do jogo\n");
        int menu2 = scanner.nextInt();
        } while();


        return ;
    }


}