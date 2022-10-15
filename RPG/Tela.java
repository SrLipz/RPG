import java.util.Scanner;
import java.util.Random;

public class Tela {

    Scanner scanner = new Scanner(System.in);
    Personagem[] personagens = new Personagem[3];
    Dragao dragao = new Dragao();
    int qtdPersonagem = 0;
    int i = 0;
    
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

    private void encerrarJogo() {
        System.out.println("O jogo foi encerrado!");
        System.exit(0);
    }

    public void menuPrincipal () {

        System.out.println("O que deseja fazer?\n");
        boolean valido;

        for (int j = 0; j < 3; j++) {
            do {

                System.out.println("1 - Criar novo personagem \n2 - Começar partida \n3 - Sair do jogo\n");
                int opcaoMenuPrincipal = scanner.nextInt();
                System.out.println();

                valido = opcaoMenuPrincipal == 1 || opcaoMenuPrincipal == 2 || opcaoMenuPrincipal == 3;

                if (!valido){ 
                    System.out.println("Opção inválida! Digite uma opção correta.\n");
                } else {
                    if (opcaoMenuPrincipal == 1) {
                        qtdPersonagem++;
                        System.out.println("Certo, vamos em frente!\n");
                        this.menuEscolhaPersonagem();
                        break;
                    } else if (opcaoMenuPrincipal == 3){
                        this.encerrarJogo();
                        break;
                    } else if (opcaoMenuPrincipal == 2) {
                        if (qtdPersonagem >= 1 && qtdPersonagem <= 3) {
                            j = 4;
                            break;
                        } else {
                            System.out.println("Você não pode começar a partida sem ao menos ter criado pelo menos um personagem.\n");
                            j--;
                        }
                    }
                }
            } while (!valido);
        
            if (j == 2) {
                System.out.println("Os 3 personagens foram criados. Se prepare! A partida irá iniciar.\n");
            }
        }
    }

    private void menuEscolhaPersonagem () {
        
        int opcaoMenuPersonagem;
        boolean valido;

        do {

            System.out.println("Qual o tipo de personagem que deseja criar?\n");
            System.out.println("1 - Arqueiro \n2 - Guerreiro \n3 - Mago\n");
            opcaoMenuPersonagem = scanner.nextInt();
            System.out.println();

            valido = opcaoMenuPersonagem == 1 || opcaoMenuPersonagem == 2 || opcaoMenuPersonagem == 3;

            if (!valido){
                System.out.println("Opção inválida! Digite uma opção correta.\n");
            } else {
                this.menuEscolhaArma(opcaoMenuPersonagem);
            }
            
        } while (!valido);
    }

    private void menuEscolhaArma (int opcaoMenuPersonagem) {

        boolean valido;
        System.out.println("Selecione a arma:\n");

        switch(opcaoMenuPersonagem) {
                        
            case 1:

            do {

                System.out.println("1 - Arco Longo \n2 - Balestra\n");                   
                int opcaoMenuArma = scanner.nextInt();
                System.out.println();

                valido = opcaoMenuArma == 1 || opcaoMenuArma == 2;

                if (!valido){
                    System.out.println("Opção inválida! Digite uma opção correta!");
                } else {
                    if (opcaoMenuArma == 1){
                        personagens[i] = new Arqueiro(new ArcoLongo());
                        i++;
                        break;
                    } else {
                        personagens[i] = new Arqueiro(new Balestra());
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
                    System.out.println("Opção inválida! Digite uma opção correta!");
                } else {
                    if (opcaoMenuArma == 1){
                        personagens[i] = new Guerreiro(new Espada());
                        i++;
                        break;
                    } else {
                        personagens[i] = new Guerreiro(new Machado());
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
                    System.out.println("Opção inválida! Digite uma opção correta!");
                } else {
                    if (opcaoMenuArma == 1){
                    personagens[i] = new Mago(new Cajado());
                    i++;
                    break;
                    } else {
                    personagens[i] = new Mago(new Varinha());
                    i++;
                    break;
                    }
                }
                
            } while (!valido);

            break;
            default:;
                
        }
    } 

    public void menuInicioTurno() {
        
        boolean valido;
        
        do {
            System.out.println("1 - Iniciar turno. \n2 - Deseja sair do jogo?\n");                   
            
            int opcaoMenuInicioTurno = scanner.nextInt();
            System.out.println();

            valido = opcaoMenuInicioTurno == 1 || opcaoMenuInicioTurno == 2;

            if (!valido){
                System.out.println("Opção inválida! Digite uma opção correta!\n");
            } else {
                if (opcaoMenuInicioTurno == 1) {
                    break;
                } else {
                    this.encerrarJogo(); break;
                }
            }
        } while (!valido);
    }

    public void turno() {

        Random random = new Random();
        
        int vidaTotalPersonagens = 0;

        for (int l = 0; l <= qtdPersonagem; l++) {
            if (personagens[l] != null) {
                vidaTotalPersonagens += personagens[l].getVida();
            }
        }
        
        do {
            
            for (Personagem personagem : personagens) {

                if (personagem != null && personagem.getVida() > 0) {
                    
                    System.out.printf("Qual ação o %s deve fazer?\n", personagem.getClasse());
                    System.out.println("\n1 - Atacar \n2 - Defender\n");
                    int escolhaAcao = scanner.nextInt();
                    System.out.println();

                    switch(escolhaAcao) {
                        case 1:
                            personagem.setDefendendo(false);
                            System.out.printf("%s: \nUsou %s para atacar o %s,\npontos de ataque: %d\n", personagem.getClasse(), personagem.getArma().getNomeArma(), dragao.getClasse(), personagem.atacar());
                            dragao.defenderAtaque(personagem.atacar());
                            System.out.println();
                            int dano = personagem.atacar() - dragao.getDefBase();
                            System.out.printf("%s: \nDefendeu o ataque com suas escamas,\npontos de defesa: %d\n", dragao.getClasse(), dragao.getDefBase());
                            System.out.println();
                            System.out.printf("Dano final: %d", dano);
                            System.out.printf("\nStatus de vida do %s: %d.\n", dragao.getClasse(), dragao.getVida());
                            if (dragao.getVida() <= 0) {
                                System.out.println("Você venceu! O dragão foi derrotado!");
                                this.encerrarJogo();
                                break;
                            }
                            break;
                        case 2:
                            personagem.setDefendendo(true);
                            int acrescimoDef = personagem.getDefBase() * (10/100) + personagem.getDefBase();
                            System.out.printf("\nO %s recebeu um acréscimo de %d na defesa.\n", personagem.getClasse(), acrescimoDef);
                            break;
                    }
                } else if (personagem != null && personagem.getVida() <= 0) {
                        System.out.printf("\nO personagem %s está morto.\n", personagem.getClasse());
                }
            }

            Personagem recebedorAtaque = personagens[random.nextInt(qtdPersonagem)];
            
            dragao.atacar();

            this.menuFimTurno();

        } while (vidaTotalPersonagens > 0);

    }

    public void menuFimTurno() {

        System.out.println("\nFim de turno!\n");
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
                    break;
                } else if (opcaoMenuFimTurno == 2) {
                    this.encerrarJogo(); break;
                }
            }
        } while(!valido);
    }   
}