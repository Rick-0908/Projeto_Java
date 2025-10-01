import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade que você percorreu em KM: ");
        double km = sc.nextDouble();
        System.out.println("Agora a quantidade em litros: ");
        double litros = sc.nextDouble();
        if (litros != 0){
            double consumoMedio = km/ litros;
            System.out.printf("O cosumo médio é: %.2f km1%n", consumoMedio);
        }else {
            System.out.println("A qunatidade não pode ser 0");
        }sc.close();
    }
}
