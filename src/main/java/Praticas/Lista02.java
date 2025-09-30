package Praticas;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Lista02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Equipamento[] = {"Monitor","Capacete","Teclado","Mouse"};
        List<String> lista = new ArrayList<>(Arrays.asList(Equipamento));
        System.out.println("Aqui é um treinamento de lista");
        System.out.println(lista);
        System.out.println("Qual deles você deseja retirar ?");
        String texto1  = sc.nextLine();
        if(texto1.equals("1")){
            System.out.println("Item 1 sendo retirado");
            lista.remove("Monitor");
            System.out.println("Sua lista agora ficou: " + lista);
        }

    }
}
