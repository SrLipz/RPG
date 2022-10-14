 import java.util.Scanner;
 import java.util.Random;

public class Tela {

    Scanner scanner = new Scanner(System.in);
    Personagem[] personagens = new Personagem[3];
    Dragao dragao = new Dragao();
    int qtdPersonagem = 0;

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

    public void menuPersonagem () {

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

                qtdPersonagem++;
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
                            case 1: personagens[i] = new Arqueiro(new ArcoLongo()); j = false; break;
                            case 2: personagens[i] = new Arqueiro(new Balestra()); j = false; break;
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
                            case 1: personagens[i] = new Guerreiro(new Espada()); j = false; break;
                            case 2: personagens[i] = new Guerreiro(new Machado()); j = false; break;
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
                            case 1: personagens[i] = new Mago(new Cajado()); j = false; break;
                            case 2: personagens[i] = new Mago(new Varinha()); j = false; break;
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

        if (i == 2){
            System.out.println("Os 3 personagens foram criados. Se prepare! A partida irá iniciar.");
        }
        
        }
    }

    public void encerrarJogo () {

        System.out.println("O jogo foi encerrado!");
        System.exit(0);

    }

    public void menuInicioTurno() {
        System.out.println("1 - Iniciar turno. \n2 - Deseja sair do jogo?\n");                   
        
        int fimTurno = scanner.nextInt();
        System.out.println();

        switch (fimTurno) {
            case 1: break;
            case 2: this.encerrarJogo(); break;
            default: System.out.println("Opção inválida! Digite uma opção correta!\n");
        }
    }

    public void iniciarTurno() {

        Random random = new Random();
    
        for (Personagem personagem : personagens) {
            if (personagem != null && personagem.getVida() > 0) {
                
                System.out.printf("O personagem %s deve fazer o que?\n", personagem.getClasse());
                System.out.println("1 - Atacar \n2 - Defender\n");

                int escolhaAcao = scanner.nextInt();
                System.out.println();

                switch(escolhaAcao) {
                    case 1:
                        personagem.setDefendendo(false);
                        System.out.printf("O personagem %s atacou o %s e causou %d de dano.%n", personagem.getClasse(), dragao.getClasse(), personagem.atacar());
                        dragao.defenderAtaque(personagem.atacar());
                        System.out.printf("Agora o %s tem %d de vida.\n", dragao.getClasse(), dragao.getVida());
                        break;
                    case 2:
                        personagem.setDefendendo(true);
                        int acrescimoDef = personagem.getDefBase() * (10/100) + personagem.getDefBase();
                        System.out.printf("O %s recebeu um acréscimo de %d na defesa.%n", personagem.getClasse(), acrescimoDef);
                        break;
                }
            } else if (personagem != null && personagem.getVida() <= 0) {

                    System.out.printf("O personagem %s está morto.%n", personagem.getClasse());

            }
        }

        dragao.atacar();
        Personagem recebedorAtaque = personagens[random.nextInt(qtdPersonagem)];

    }

    public void menuMeioTurno() {
        
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