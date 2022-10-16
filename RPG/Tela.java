import java.util.Scanner;
import java.util.Random;
import java.io.IOException;

public class Tela {

    public void limpar () throws InterruptedException, IOException{

        //Limpa a tela no windows, no linux e no MacOS
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
    
        }
        
    Scanner scanner = new Scanner(System.in);
    
    public void menuInicio () throws InterruptedException, IOException {
        this.limpar();
        System.out.println("Olá, seja bem vindo ao Heroes of OOP! \n\nVamos começar uma nova partida?\n");
        boolean valido;
        
        do {
            System.out.println("1 - Iniciar uma partida \n2 - Sair do jogo\n");
            int opcaoMenuInicio = scanner.nextInt();
            valido = opcaoMenuInicio == 1 || opcaoMenuInicio == 2;

            if (!valido) {
                this.limpar();
                System.out.println("Opção inválida! Digite uma opção correta.\n");

                System.out.println("Favor Selecionar um dos Numeros a baixo.\n");
            } else {
                if (opcaoMenuInicio == 1) {
                    this.limpar();
                    System.out.println("Certo, vamos em frente!\n");
                    break;
                } else if (opcaoMenuInicio == 2) {
                        this.limpar();
                        this.encerrarJogo(); 
                        break;
                }
            }
        } while (!valido);
    }

    private void encerrarJogo() throws InterruptedException, IOException {
        System.out.println("O jogo foi encerrado!");
        System.exit(0);
    }

    int qtdPersonagem = 0;

    public void menuPrincipal () throws InterruptedException, IOException {

        boolean valido;
        this.limpar();
        for (int j = 0; j < 3; j++) {
            do {
                System.out.printf("Atualmente voce tem %s de Personagem(ns)\n",qtdPersonagem);
                System.out.println("O que deseja fazer?\n");
                System.out.println("1 - Criar novo personagem \n2 - Começar partida \n3 - Sair do jogo\n");
                int opcaoMenuPrincipal = scanner.nextInt();
                System.out.println();
                valido = opcaoMenuPrincipal == 1 || opcaoMenuPrincipal == 2 || opcaoMenuPrincipal == 3;

                if (!valido){ 
                    this.limpar();
                    System.out.println("Opção inválida! Digite uma opção correta.\n");
                } else {
                    if (opcaoMenuPrincipal == 1) {
                        this.limpar();
                        qtdPersonagem++;
                        this.menuEscolhaPersonagem();
                        break;
                    } else if (opcaoMenuPrincipal == 3){
                        this.limpar();
                        this.encerrarJogo();
                        break;
                    } else if (opcaoMenuPrincipal == 2) {
                        this.limpar();
                        if (qtdPersonagem >= 1 && qtdPersonagem <= 3) {
                            j = 4;
                            break;
                        } else {
                            this.limpar();
                            System.out.println("Você não pode começar a partida sem ao menos ter criado pelo menos um personagem.\n");
                            j--;
                        }
                    }
                }
            } while (!valido);
        
            if (j == 2) {
                this.limpar();
                System.out.println("Os 3 personagens foram criados. Se prepare! A partida irá iniciar.\n");
            }
        }
    }
    
    private void menuEscolhaPersonagem () throws InterruptedException, IOException {
        
        int opcaoMenuPersonagem;
        boolean valido;
        this.limpar();
        do {
            
            System.out.println("Qual o tipo de personagem que deseja criar?\n");
            System.out.println("1 - Arqueiro \n2 - Guerreiro \n3 - Mago\n");
            opcaoMenuPersonagem = scanner.nextInt();
            valido = opcaoMenuPersonagem == 1 || opcaoMenuPersonagem == 2 || opcaoMenuPersonagem == 3;

            if (!valido){
                this.limpar();
                System.out.println("Opção inválida! Digite uma opção correta.\n");
            } else {
                this.limpar();
                System.out.println("\nNome do personagem: ");
                Scanner nome = new Scanner (System.in);
                String nomePersonagem = nome.nextLine();
                System.out.println(nomePersonagem);
                this.menuEscolhaArma(nomePersonagem, opcaoMenuPersonagem);
            }
        } while (!valido);
    }

    Personagem[] personagens = new Personagem[3];
    int i = 0;

    private void menuEscolhaArma (String nomePersonagem, int opcaoMenuPersonagem) throws InterruptedException, IOException {
        this.limpar();
        System.out.println("\nSelecione a arma:\n");
        boolean valido;

        switch(opcaoMenuPersonagem) {
                        
            case 1:

            do {
                System.out.println("1 - Arco Longo \n2 - Balestra\n");                   
                int opcaoMenuArma = scanner.nextInt();
                System.out.println();
                valido = opcaoMenuArma == 1 || opcaoMenuArma == 2;

                if (!valido){
                    this.limpar();
                    System.out.println("Opção inválida! Digite uma opção correta!");
                } else {
                    if (opcaoMenuArma == 1){
                        personagens[i] = new Arqueiro(nomePersonagem, new ArcoLongo());
                        i++;
                        break;
                    } else {
                        personagens[i] = new Arqueiro(nomePersonagem, new Balestra());
                        i++;
                        break;
                    }
                }
            } while (!valido);
            break;
                
            case 2:

            do {
                System.out.println("1 - Espada \n2 - Machado\n");                   
                int opcaoMenuArma = scanner.nextInt();
                System.out.println();
                valido = opcaoMenuArma == 1 || opcaoMenuArma == 2;

                if (!valido){
                    this.limpar();
                    System.out.println("Opção inválida! Digite uma opção correta!");
                } else {
                    if (opcaoMenuArma == 1){
                        personagens[i] = new Guerreiro(nomePersonagem, new Espada());
                        i++;
                        break;
                    } else {
                        personagens[i] = new Guerreiro(nomePersonagem, new Machado());
                        i++;
                        break;
                    }
                }
            } while (!valido);
            break;
                
            case 3:
                
            do {
                System.out.println("1 - Cajado \n2 - Varinha\n");                   
                int opcaoMenuArma = scanner.nextInt();
                System.out.println();

                valido = opcaoMenuArma == 1 || opcaoMenuArma == 2;

                if (!valido){
                    this.limpar();
                    System.out.println("Opção inválida! Digite uma opção correta!");
                } else {
                    if (opcaoMenuArma == 1){
                    personagens[i] = new Mago(nomePersonagem, new Cajado());
                    i++;
                    break;
                    } else {
                    personagens[i] = new Mago(nomePersonagem, new Varinha());
                    i++;
                    break;
                    }
                }
            } while (!valido);
            break;

            default:; 
        }
        this.limpar();
    } 

    public void menuInicioTurno() throws InterruptedException, IOException {
        boolean valido;
        
        do {
            System.out.println("1 - Iniciar turno. \n2 - Deseja sair do jogo?\n");                   
            int opcaoMenuInicioTurno = scanner.nextInt();
            System.out.println();
            valido = opcaoMenuInicioTurno == 1 || opcaoMenuInicioTurno == 2;

            if (!valido){
                this.limpar();
                System.out.println("Opção inválida! Digite uma opção correta!\n");
            } else {
                if (opcaoMenuInicioTurno == 1) {
                    break;
                } else {
                    this.limpar();
                    this.encerrarJogo(); break;
                }
            }
        } while (!valido);
    }

    public void turno() throws InterruptedException, IOException {
        this.limpar();
        Dragao dragao = new Dragao();
        Random random = new Random();
        
        int vidaTotalPersonagens = 0;

        for (int l = 0; l < qtdPersonagem; l++) {
            if (personagens[l] != null) {
                vidaTotalPersonagens += personagens[l].getVida();
            }
        }
        
        do {
            for (Personagem personagem : personagens) {
                if (personagem != null && personagem.getVida() > 0) {

                    System.out.printf("Qual ação o %s deve fazer?\n", 
                                        personagem.getClasse());
                    System.out.println("\n1 - Atacar \n2 - Defender\n");
                    int escolhaAcao = scanner.nextInt();
                    System.out.println();

                    switch(escolhaAcao) {

                        case 1:
                            this.limpar();
                            personagem.setDefendendo(false);
                            personagem.atacar(dragao);
                            System.out.println();
                            dragao.defenderAtaque(personagem);
                            System.out.println();
                            
                            if (dragao.getVida() <= 0) {
                                System.out.println("Você venceu! O dragão foi derrotado!");
                                this.encerrarJogo();
                                break;
                            }
                            break;

                        case 2:
                            this.limpar();
                            personagem.setDefendendo(true);
                            int acrescimoDef = personagem.getDefBase() * (10/100) + personagem.getDefBase();
                            System.out.printf("\nO %s %s recebeu um acréscimo de %d na defesa.\n\n", 
                                                personagem.getClasse(),personagem.getNome() , 
                                                acrescimoDef);
                            break;
                    }
                } else if (personagem != null && personagem.getVida() <= 0) {
                        this.limpar();
                        System.out.printf("\nO personagem %s está morto.\n", 
                                            personagem.getClasse());
                }
            }

            Personagem recebedorAtaque = personagens[random.nextInt(qtdPersonagem)];
            dragao.atacar(recebedorAtaque);
            System.out.println();
            recebedorAtaque.defenderAtaque(dragao);
            this.menuFimTurno();

        } while (vidaTotalPersonagens > 0);
    }

    private void menuFimTurno() throws InterruptedException, IOException {

        System.out.println();
        System.out.println("Fim de turno!\n");
        boolean valido;

        do { 
            System.out.println("1 - Próximo turno. \n2 - Deseja sair do jogo?\n");             
            int opcaoMenuFimTurno = scanner.nextInt();
            System.out.println();
            valido = opcaoMenuFimTurno == 1 || opcaoMenuFimTurno == 2;

            if (!valido){
                System.out.println("Opção inválida! Digite uma opção correta!");
            } else {
                if (opcaoMenuFimTurno == 1) {
                    this.limpar();
                    break;
                } else if (opcaoMenuFimTurno == 2) {
                    this.limpar();
                    this.encerrarJogo(); break;
                }
            }
        } while(!valido);
    }   
}