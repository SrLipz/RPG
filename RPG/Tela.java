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
    Personagem[] personagens = new Personagem[3];
    Dragao dragao = new Dragao();
    int qtdPersonagem = 0;

    public void menuInicio () throws InterruptedException, IOException {
        this.limpar();
        System.out.println("Olá, seja bem vindo ao Heroes of OOP! \n\nVamos começar uma nova partida?\n");// iniciação do menu do jogo
        
        Scanner scanner = new Scanner(System.in);
        boolean valido;

        
        do {
            System.out.println("1 - Iniciar uma partida \n2 - Sair do jogo\n"); // Opção de escolha para iniciar ou sair do jogo
            int opcaoMenuInicio = scanner.nextInt();
            
            valido = opcaoMenuInicio == 1 || opcaoMenuInicio == 2; 

            if (!valido) {
                System.out.println("Opção inválida! Digite uma opção correta.\n"); 
            } else {
                if (opcaoMenuInicio == 1) {
                    System.out.println("Certo, vamos em frente!\n"); // Caso o Usuario Digite um numero 1 para continuar o jogo
                    break;
                } else if (opcaoMenuInicio == 2) {
                        this.encerrarJogo();  // Caso o Usuario Digite um numero 2 para encerrar o jogo
                        break;
                }
                
            }
        } while (!valido);
        this.limpar();
    
    }

    public void menuPersonagem () throws InterruptedException, IOException {

        System.out.println("O que deseja fazer?\n"); 

        boolean k = false; // verificar algum Personagem já foi criado
        this.limpar();
        for (int i = 0; i < 3 ;i++) {
            this.limpar();
            System.out.printf("Atualmente você tem %S Personagen(s) Criado(s).\n",i);//Informa quantos Personagens Criados o Usuario tem

            System.out.println("1 - Criar novo personagem \n2 - Começar partida \n3 - Sair do jogo\n");//Mostra as informações para a escolha do proximo passo 
            int menu2 = scanner.nextInt();
            System.out.println();
            this.limpar();

            if (menu2 == 1){ 
                k = true; 
            }

            switch(menu2) {//Caso o Usuario selecione a opção "1" iniciar a criação do personagem
                case 1: 

                qtdPersonagem++;
                System.out.println("Qual o tipo de personagem que deseja criar?\n");
                System.out.println("1 - Arqueiro \n2 - Guerreiro \n3 - Mago\n");//Mostra as informações para a escolha o personagem
                int menuPersonagem = scanner.nextInt();
                this.limpar();
                System.out.println();
                System.out.println("Selecione a arma:\n");// iniciar a escolha das armas do personagem
                
            
                switch(menuPersonagem) {
                        
                    case 1:

                    for (boolean j = true; j == true;) {

                        System.out.println("1 - Arco Longo \n2 - Balestra\n");//opções das armas do personagem Arqueiro                   
                        int menuArma1 = scanner.nextInt();
                        System.out.println();

                        switch (menuArma1) {//Escolhe a Arma  do Arqueiro
                            case 1: personagens[i] = new Arqueiro(new ArcoLongo()); j = false; break;
                            case 2: personagens[i] = new Arqueiro(new Balestra()); j = false; break;
                            default: System.out.println("Opção inválida! Digite uma opção correta!");
                            this.limpar();
                        }
                    }

                    break;
                        
                    case 2:

                    for (boolean j = true; j == true;) {

                        System.out.println("1 - Espada \n2 - Machado\n");//opções das armas do personagem Guerreiro    
                        int menuArma2 = scanner.nextInt();
                        System.out.println();

                        switch (menuArma2) {//Escolhe a Arma  do Guerreiro
                            case 1: personagens[i] = new Guerreiro(new Espada()); j = false; break;
                            case 2: personagens[i] = new Guerreiro(new Machado()); j = false; break;
                            default: System.out.println("Opção inválida! Digite uma opção correta!");
                            this.limpar();
                        }
                    }

                    break;
                        
                    case 3:
                        
                    for (boolean j = true; j == true;) {
                            
                        System.out.println("1 - Cajado \n2 - Varinha\n");//opções das armas do personagem Mago    
                        int menuArma3 = scanner.nextInt();//Chamando o Scanner para Guiardar 
                        System.out.println();

                        switch (menuArma3) {//Escolhe a Arma  do Mago
                            case 1: personagens[i] = new Mago(new Cajado()); j = false; break;
                            case 2: personagens[i] = new Mago(new Varinha()); j = false; break;
                            default: System.out.println("Opção inválida! Digite uma opção correta!");
                            this.limpar();
                        }
                    }

                    break;
                        
                    default: System.out.println("Opção inválida! Digite uma opção correta!");
                        
                    }

                break;
                    
                case 2://Caso o Usuario selecione a opção "2" Para iniciar o jogo

                if (k == true) {
                    System.out.println("Se prepare! A partida irá começar.\n");
                    i = 4;
                } else {
                    System.out.println("Você não pode começar a partida sem ao menos ter criado pelo menos um personagem.\n");
                    i--;
                }

                break;
                    
                case 3: //Caso o Usuario Selecione a opção "3" Para encerrar o jogo
                this.encerrarJogo(); 
                break;
                    
                default: System.out.println("Opção inválida! Digite uma opção correta!");
                }

        if (i == 2){//Caso os 3 Personagens já tenham cido criados
            this.limpar();
            System.out.println("Os 3 personagens foram criados. Se prepare! A partida irá iniciar.\n");
        }
        
        }
    }

    public void encerrarJogo () throws InterruptedException, IOException { //Encerrar o jogo
        this.limpar();
        System.out.println("O jogo foi encerrado!");
        System.exit(0);

    }

    public void menuInicioTurno() throws InterruptedException, IOException {// iniciar o Turno
        this.limpar();
        System.out.println("1 - Iniciar turno. \n2 - Deseja sair do jogo?\n");                   
        
        int fimTurno = scanner.nextInt();
        System.out.println();

        switch (fimTurno) {//Caso o Usuario deseje sair do jogo
            case 1: break;
            case 2: this.encerrarJogo(); break;
            default: System.out.println("Opção inválida! Digite uma opção correta!\n");
        }
    }

    public void turno() throws InterruptedException, IOException {

        Random random = new Random();
    
        for (Personagem personagem : personagens) {
            if (personagem != null && personagem.getVida() > 0) {
                this.limpar();
                System.out.printf("O personagem %s deve fazer o que?\n", personagem.getClasse());
                System.out.println("\n1 - Atacar \n2 - Defender\n");

                int escolhaAcao = scanner.nextInt();
                System.out.println();

                switch(escolhaAcao) {
                    case 1:
                        personagem.setDefendendo(false);
                        System.out.printf("\nO personagem %s atacou o %s e causou %d de dano.\n", personagem.getClasse(), dragao.getClasse(), personagem.atacar());
                        dragao.defenderAtaque(personagem.atacar());
                        System.out.printf("\nO %s fez uma defesa de %d\n",dragao.getClasse(),dragao.getDefBase());
                        System.out.printf("\nAgora o %s tem %d de vida.\n", dragao.getClasse(), dragao.getVida());
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

    }

    public void menuFimTurno() throws InterruptedException, IOException {

        System.out.println("\nFim de turno!\n");
        boolean valido;

        do { 
            System.out.println("1 - Próximo turno. \n2 - Deseja sair do jogo?\n\n");             
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