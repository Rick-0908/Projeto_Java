package Desafios_Senai.Desafio.Desafio01;

import java.util.ArrayList;
import java.util.Scanner;

public class _4_Simulador_de_Caixa_Eletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> precos = new ArrayList<>(); //ArrayList logo uma lista dinamica sendo criada para os preços
        ArrayList<Integer> carrinho = new ArrayList<>(); //ArrayList criada para carrinho para armazenar valores
        precos.add(50);/*Variavel criada de modo em que recebe um valor e sera adicionado na array list precos*/
        precos.add(20);
        precos.add(2);
        char resp; //char resp, usado para ler a letra de uma ação do usuario
        do {
            System.out.println("Aperte ENTER para começar");
            sc.nextLine();
            System.out.println("--------------------------");
            System.out.println("Quanto deseja sacar?");
            System.out.println("----------------------");
            System.out.println("O numero minimo de saque é: " + precos); // aqui mostra os preços em lista do ArrayList precos
            int n1 = sc.nextInt();
            if (n1 >= 50 && precos.contains(50)) { // AQui o preco.contains, está verificando se possui este valor dentro da lista caso tenha ele passa pro proximo passo
                precos.remove(Integer.valueOf(50)); // este remove com o Intenger.valueOf, serve para remover apenas AQUELE valor da lista
                carrinho.add(50);//aqui está sendo adicionado o valor para uma nova lista

                System.out.println("Seu saque foi de: " + carrinho);
            } else if (n1 >= 20 && precos.contains(20)) {// AQui o preco.contains, está verificando se possui este valor dentro da lista caso tenha ele passa pro proximo passo
                precos.remove(Integer.valueOf(20));// este remove com o Intenger.valueOf, serve para remover apenas AQUELE valor da lista
                carrinho.add(20);//aqui está sendo adicionado o valor para uma nova lista
                System.out.println("Seu saque foi de: " + carrinho);
            }else if (n1 >= 2 && precos.contains(2)){// AQui o preco.contains, está verificando se possui este valor dentro da lista caso tenha ele passa pro proximo passo
                precos.remove(Integer.valueOf(2));// este remove com o Intenger.valueOf, serve para remover apenas AQUELE valor da lista
                carrinho.add(2);//aqui está sendo adicionado o valor para uma nova lista
                System.out.println("Seu saque foi de: " + carrinho);
            }

            System.out.println("Deseja continuar (s/n)?");
            resp = sc.next().charAt(0); // utilização do char resp do começo do programa, onde vai ler a resposta do usuario
        }while (resp != 'n');
        System.out.println("=====================");
        System.out.println("Sistema encerrado");
        System.out.println("=====================");
        sc.close();
    }
}