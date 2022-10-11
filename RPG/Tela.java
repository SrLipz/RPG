import java.util.Scanner;

public class Tela {
    
    public void menuInicio () {
        
        System.out.println("Olá, seja bem vindo ao Heroes of OOP! \n\nVamos começar uma nova partida?\n");
        System.out.println("1 - Iniciar uma nova partida \n2 - Sair do jogo");

        Scanner leitor = new Scanner(System.in);
        int menu = leitor.nextInt();
        System.out.println();
        
        switch(menu) {

            case 1: System.out.println("Certo, vamos em frente! O que deseja fazer?\n"); break;
            case 2: System.out.println("O jogo foi encerrado!"); 
            default: System.out.println("Opção inválida! Digite uma opção correta!");

        }
    }

}
