

public class Main {
    public static void main(String[] args) {

        //Menu menu = new Menu();
        //System.out.println(menu.menuInicial());
        //System.out.println(menu.entrada());
        
        Classe personagem1 = new GuerreiroEspada();
        Classe personagem2 = new GuerreiroMachado();
        Classe dragao = new Dragao();

        System.out.println(personagem1.status());
        System.out.println(personagem2.status());
        System.out.println(dragao.status());
        
    }
}
