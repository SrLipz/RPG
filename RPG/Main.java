import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Olá, seja bem vindo ao Heroes of OOP! \n\nVamos começar uma nova partida?\n");
        System.out.println("1 - Iniciar uma nova partida \n2 - Sair do jogo");
        
        Scanner leitor = new Scanner(System.in);
        int menu1 = leitor.nextInt();
        System.out.println();
        
        switch(menu1) {

            case 1: System.out.println("Certo, vamos em frente! O que deseja fazer?\n"); break;
            case 2: System.out.println("O jogo foi encerrado!"); System.exit(0);
            default: System.out.println("Opção inválida! Digite uma opção correta!");

        }

        System.out.println("1 - Criar novo personagem \n2 - Começar partida \n3 - Sair do jogo");
        int menu2 = leitor.nextInt();
        System.out.println();
        
        switch(menu2) {

            case 1: 
            System.out.println("Qual o tipo de personagem que deseja criar?\n");
            System.out.println("1 - Arqueiro \n2 - Guerreiro \n3 - Mago\n");
            break;
            
            case 2: 
            System.out.println("Se prepare! A partida irá começar.\n"); break;
            
            case 3: 
            System.out.println("O jogo foi encerrado!"); System.exit(0);
            
            default: System.out.println("Opção inválida! Digite uma opção correta!");

        }
    }
}
