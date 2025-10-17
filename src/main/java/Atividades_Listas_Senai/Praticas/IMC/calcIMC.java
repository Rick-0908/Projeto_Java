package Atividades_Listas_Senai.Praticas.IMC;

public class calcIMC {
    public static String IMC(double imc, double altura) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Peso Normal";
        } else if (imc >= 25 && imc <= 29.9) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc <= 34.9) {
            return "Obesidade Grau I";
        } else if (imc >= 35 && imc <= 39.9) {
            return "Obesidade Grau II";
        } else {
            return ("Obesidade Grau III");
        }
    }
}