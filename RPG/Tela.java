import java.util.Scanner;
import java.util.Random;
import java.io.IOException;

public class Tela {

    public void limpar() throws InterruptedException, IOException {

        // Limpa a tela no windows, no linux e no MacOS
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");

    }

    Scanner scanner = new Scanner(System.in);

    public void menuInicio() throws InterruptedException, IOException {
        this.limpar();
        System.out.println("SEJA BEM-VINDO AO HEROS OF OOP!\n");
        boolean valido;

        do {
            System.out.println("MENU INICIAL:\n");
            System.out.println("[1] Iniciar uma partida \n[2] Sair do jogo\n");
            System.out.print("OPCAO: ");
            int opcaoMenuInicio = scanner.nextInt();
            valido = opcaoMenuInicio == 1 || opcaoMenuInicio == 2;

            if (!valido) {
                this.limpar();
                System.out.println("OPCAO INVALIDA! DIGITE UMA OPCAO CORRETA.\n");
            } else {
                if (opcaoMenuInicio == 1) {
                    break;
                } else if (opcaoMenuInicio == 2) {
                    this.limpar();
                    this.encerrarJogo();
                    break;
                }
            }
        } while (!valido);
    }

    private void encerrarJogo() {
        System.out.println("O JOGO FOI ENCERRADO!");
        System.exit(0);
    }

    int qtdPersonagem = 0;

    public void menuPrincipal() throws InterruptedException, IOException {
        this.limpar();
        boolean valido;

        for (int j = 0; j < 3; j++) {
            do {
                System.out.println("MENU PRINCIPAL:\n");
                System.out.printf("Quantidade de personagem criado: %d/3\n\n", qtdPersonagem);
                System.out.println("[1] Criar novo personagem \n[2] Comecar partida \n[3] Sair do jogo\n");
                System.out.print("OPCAO: ");
                int opcaoMenuPrincipal = scanner.nextInt();
                System.out.println();
                valido = opcaoMenuPrincipal == 1 || opcaoMenuPrincipal == 2 || opcaoMenuPrincipal == 3;

                if (!valido) {
                    this.limpar();
                    System.out.println("OPCAO INVALIDA! DIGITE UMA OPCAO CORRETA.\n");
                } else {
                    if (opcaoMenuPrincipal == 1) {
                        this.limpar();
                        qtdPersonagem++;
                        this.menuEscolhaPersonagem();
                        break;
                    } else if (opcaoMenuPrincipal == 3) {
                        this.limpar();
                        this.encerrarJogo();
                        break;
                    } else if (opcaoMenuPrincipal == 2) {
                        if (qtdPersonagem >= 1 && qtdPersonagem <= 3) {
                            j = 4;
                            break;
                        } else {
                            this.limpar();
                            System.out.println(
                                    "VOCE NAO PODE INICIAR UMA PARTIDA SEM AO MENOS UM PERSONAGEM.\n");
                            j--;
                        }
                    }
                }
            } while (!valido);

            if (j == 2) {
                this.limpar();
                System.out.println("A QUANTIDADE MAXIMA DE PERSONAGEM FOI CRIADA. \nA PARTIDA IRA INICIAR.\n");
            }
        }
    }

    private void menuEscolhaPersonagem() throws InterruptedException, IOException {

        int opcaoMenuPersonagem;
        boolean valido;

        do {
            System.out.println("MENU DE CRIACAO DE PERSONAGEM\n");
            System.out.println("ESCOLHA O SEU TIPO DE PERSONAGEM:\n");
            System.out.println("[1] ARQUEIRO (Vida 160 / Ataque 20 / Defesa 30)");
            System.out.println("[2] GUERREIRO (Vida 180 / Ataque 30 / Defesa 20)");
            System.out.println("[3] MAGO (Vida 200 / Ataque 20 / Defesa 10)\n");
            System.out.print("OPCAO: ");
            opcaoMenuPersonagem = scanner.nextInt();
            valido = opcaoMenuPersonagem == 1 || opcaoMenuPersonagem == 2 || opcaoMenuPersonagem == 3;

            if (!valido) {
                System.out.println("OPCAO INVALIDA! DIGITE UMA OPCAO CORRETA.\n");
            } else {
                System.out.print("\nDIGITE O NOME PARA O PERSONAGEM: ");
                Scanner nome = new Scanner(System.in);
                String nomePersonagem = nome.nextLine();
                this.menuEscolhaArma(nomePersonagem, opcaoMenuPersonagem);
            }
        } while (!valido);
    }

    Personagem[] personagens = new Personagem[3];
    int i = 0;

    private void menuEscolhaArma(String nomePersonagem, int opcaoMenuPersonagem)
            throws InterruptedException, IOException {
        System.out.println("\nSELECIONE A ARMA:\n");
        boolean valido;

        switch (opcaoMenuPersonagem) {

            case 1:

                do {
                    System.out.println("[1] ARCO LONGO (Ataque +12 / Defesa +13)");
                    System.out.println("[2] BALESTRA (Ataque +15 / Defesa +10)\n");
                    System.out.print("OPCAO: ");
                    int opcaoMenuArma = scanner.nextInt();
                    System.out.println();
                    valido = opcaoMenuArma == 1 || opcaoMenuArma == 2;

                    if (!valido) {

                        System.out.println("OPCAO INVALIDA! DIGITE UMA OPCAO CORRETA.\n");
                    } else {
                        this.limpar();
                        if (opcaoMenuArma == 1) {
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
                    System.out.println("[1] ESPADA (Ataque +10 / Defesa +15)");
                    System.out.println("[2] MACHADO (Ataque +17 / Defesa +8)\n");
                    System.out.print("OPCAO: ");
                    int opcaoMenuArma = scanner.nextInt();
                    System.out.println();
                    valido = opcaoMenuArma == 1 || opcaoMenuArma == 2;

                    if (!valido) {
                        System.out.println("OPCAO INVALIDA! DIGITE UMA OPCAO CORRETA.\n");
                    } else {
                        this.limpar();
                        if (opcaoMenuArma == 1) {
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
                    System.out.println("[1] CAJADO (Ataque +13 / Defesa +12)");
                    System.out.println("[2] VARINHA (Ataque +16 / Defesa +9)\n");
                    System.out.print("OPCAO: ");
                    int opcaoMenuArma = scanner.nextInt();
                    System.out.println();

                    valido = opcaoMenuArma == 1 || opcaoMenuArma == 2;

                    if (!valido) {
                        System.out.println("OPCAO INVALIDA! DIGITE UMA OPCAO CORRETA.\n");
                    } else {
                        this.limpar();
                        if (opcaoMenuArma == 1) {
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

            default:
                ;
        }
    }

    public void menuInicioTurno() throws InterruptedException, IOException {

        boolean valido;
        this.limpar();
        do {
            System.out.println("MENU DE TURNO\n");
            System.out.println("[1] Iniciar turno \n[2] Encerrar o jogo\n");
            System.out.print("OPCAO: ");
            int opcaoMenuInicioTurno = scanner.nextInt();
            System.out.println();
            valido = opcaoMenuInicioTurno == 1 || opcaoMenuInicioTurno == 2;
            this.limpar();
            if (!valido) {
                this.limpar();
                System.out.println("OPCAO INVALIDA! DIGITE UMA OPCAO CORRETA.\n");
            } else {
                if (opcaoMenuInicioTurno == 1) {
                    break;
                } else {
                    this.limpar();
                    this.encerrarJogo();
                    break;
                }
            }
        } while (!valido);
    }

    int vidaTotalPersonagens;

    public void turno() throws InterruptedException, IOException {

        Dragao dragao = new Dragao();
        Random random = new Random();

        vidaTotalPersonagens = 0;

        for (int l = 0; l < qtdPersonagem; l++) {
            if (personagens[l] != null) {
                vidaTotalPersonagens += personagens[l].getVida();
            }
        }

        do {
            for (Personagem personagem : personagens) {
                if (personagem != null && personagem.getVida() > 0) {
                    this.mostrarStatus(personagem);
                    System.out.printf("ESCOLHA A ACAO:");
                    System.out.println();
                    System.out.println("\n[1] Atacar \n[2] Defender\n");
                    System.out.print("OPCAO: ");
                    int escolhaAcao = scanner.nextInt();
                    System.out.println();
                    
                    switch (escolhaAcao) {
                        case 1:
                            personagem.atacar(dragao);
                            System.out.println();
                            dragao.defenderAtaque(personagem);
                            System.out.println();

                            if (dragao.getVida() <= 0) {
                                System.out.println("VOCE VENCEU! O DRAGAO FOI DERROTADO!");
                                this.encerrarJogo();
                                break;
                            }
                            break;

                        case 2:
                            double acrescimoDef = personagem.getDefBase() * (10 / 100) + personagem.getDefBase() + personagem.getArma().getDefArma();
                            System.out.printf("\nO %s (%s) RECEBEU UM ACRESCIMO DE 10% NOS PONTOS DE DEFESA.\n",
                                                        personagem.getNome(),
                                                        personagem.getClasse());
                            System.out.printf("PONTO TOTAL DE DEFESA NESSE TURNO: %f\n", acrescimoDef);
                            break;
                    }
                } else if (personagem != null && personagem.getVida() <= 0) {
                    System.out.printf("\nO %s (%s) ESTA MORTO.\n",
                                        personagem.getNome(),
                                        personagem.getClasse());
                }
            }

            boolean valido;
            int contador = 0;

            do {
                Personagem recebedorAtaque = personagens[random.nextInt(qtdPersonagem)];
                valido = recebedorAtaque.getVida() > 0;
                contador++;
                if (recebedorAtaque.getVida() > 0) {
                    System.out.printf("------------TURNO DO %s------------", dragao.getNome());
                    System.out.println("\n");
                    dragao.atacar(recebedorAtaque);
                    System.out.println();
                    recebedorAtaque.defenderAtaque(dragao);
                    int dano = dragao.getAtqBase() - (recebedorAtaque.getDefBase() + recebedorAtaque.getArma().getDefArma());
                    if (dano < 0) {
                        dano = 0;
                    }
                    vidaTotalPersonagens -= dano;
                    if (recebedorAtaque.getVida() <= 0) {
                        System.out.printf("%s (%s) MORREU!\n", recebedorAtaque.getNome(), recebedorAtaque.getClasse());
                        if (vidaTotalPersonagens <= 0) {
                            System.out.printf("O %s VENCEU! VOCE NAO TEM NENHUM PERSONAGEM PARA COMBATER!\n",
                                    dragao.getNome());
                            this.encerrarJogo();
                            break;
                        }
                    }
                    break;
                } else {
                    if (contador == 30) {
                        break;
                    }
                }
            } while (!valido);

            this.menuFimTurno();

        } while (vidaTotalPersonagens > 0);

    }

    private void menuFimTurno() throws InterruptedException, IOException {

        System.out.println();
        System.out.println("FIM DE TURNO!\n");
        boolean valido;

        do {
            System.out.println("[1] Proximo turno \n[2] Encerrar o jogo\n");
            System.out.print("OPCAO: ");
            int opcaoMenuFimTurno = scanner.nextInt();
            System.out.println();
            valido = opcaoMenuFimTurno == 1 || opcaoMenuFimTurno == 2;

            if (!valido) {
                this.limpar();
                System.out.println("OPCAO INVALIDA! DIGITE UMA OPCAO CORRETA.\n");
            } else {
                this.limpar();
                if (opcaoMenuFimTurno == 1) {
                    break;
                } else if (opcaoMenuFimTurno == 2) {
                    this.limpar();
                    this.encerrarJogo();
                    break;
                }
            }
        } while (!valido);
    }

    public void mostrarStatus (Personagem personagem){
        
        System.out.println("================================\n");
        System.out.println("STATUS DO PERSONAGEM DESSE TURNO\n");
        System.out.printf("- Nome: %s\n", personagem.getNome());
        System.out.printf("- Classe: %s\n", personagem.getClasse());
        System.out.printf("- Arma: %s\n", personagem.getArma().getNomeArma());
        System.out.printf("- Pontos de Vida: %d\n", personagem.getVida());
        System.out.printf("- Pontos de Ataque: %d (+%d)\n", personagem.getAtqBase(), personagem.getArma().getAtqArma());
        System.out.printf("- Pontos de Defesa: %d (+%d)\n", personagem.getDefBase(), personagem.getArma().getDefArma());
        System.out.println();

    }

}