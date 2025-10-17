package Desafios_Senai.Desafio.Desafio01;



public class _6_Gerador_de_Tabuada_Multipla {
    public static void main(String[] args) {

        System.out.println("=========================");
        System.out.println("Tabuada de 1 a 10");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");//cabeçalho da tabuada de 10
        }
        System.out.println();
        for (int i = 1; i <= 10; i++){ //Aqui mostra a coluno onde terá as multiplicações
            System.out.print(i + " | ");
            for (int k = 1;k <= 10; k++){
                System.out.print((i*k) + "\t"); //Aqui mostrara cada multiplicador do numero da coluna
            }
            System.out.println();//espaçamento
        }
    }
}
