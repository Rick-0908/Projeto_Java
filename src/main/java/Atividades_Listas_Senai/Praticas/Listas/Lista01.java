package Atividades_Listas_Senai.Praticas.Listas;

import java.util.ArrayList;
import java.util.Scanner;


public class Lista01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> Numero= new ArrayList<String>();//Lista Dinamica criada sobre aalgo
        Numero.add("Goku");// Indice 0 logo adicionado a "gaveta" da lista
        Numero.add("Vergeta");// Indice 1 logo adicionado a "gaveta" da lista
        Numero.add("Penis");// Indice 2 logo adicionado a "gaveta" da lista
        Numero.add("Algo");// Indice 3 logo adicionado a "gaveta" da lista
        System.out.println("Imprimindo ArrayList");//Um print falando que vai impromir a list

        System.out.println("Removendo Penis: ");// Removendo um item da gaveta
        Numero.remove(2);// Sempre que for remover algum item utilizar .remove(item);


        for (int i = 0; i < Numero.size(); i++) { // Estrutura de repetição FOR utilizando ArrayList onde a variavel que ele puxa e o nome da lista em ArrayList
            System.out.println(Numero.get(i));//Ira fazer a contagem de cada item da lista
        }

        int ultimoIndice = Numero.size()-1;// Irá delimitar o ultimo item da lista
        System.out.println("Ultimo indice: " + Numero.get(ultimoIndice)); // Aqui aparece o ultimo item da lista


    }
}
