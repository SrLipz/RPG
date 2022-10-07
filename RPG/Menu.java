import java.io.PrintStream;
import java.util.Scanner;

public class Menu extends Main {
    /**
     * @return
     */
    public PrintStream menuInicial(){
        try (PrintStream inicio = System.out.format("Bem-vindo ao Heroes of POO!\n[ 1 ] Iniciar uma nova partida\n[ 2 ] Sair\n")) {
            return inicio;
        }
    }
    /**
     */

    public String entrada(){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha: ");
        int escolha = entrada.nextInt();
        switch(escolha){
            case 1:
                String iniciar = "Iniciar";
                return iniciar;
            case 2:
                String sair = "Sair";
                return sair;
            default:
                String invalido = "Inválido";
                return invalido;

            
        }
    }




    /**public String entrada(){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha: ");
        int escolha = entrada.nextInt();
        switch(escolha){
            case 1:
                String texto = "Iniciar";
                return texto;
                break;
            /case  2:
                System.out.println("Sair");
                break;
            default:
                System.out.println("Entrada inválida");
                break;
        }
    }/* */
}
