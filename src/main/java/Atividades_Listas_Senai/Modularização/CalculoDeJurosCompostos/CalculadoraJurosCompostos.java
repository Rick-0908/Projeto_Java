package Atividades_Listas_Senai.Modularização.CalculoDeJurosCompostos;

public class CalculadoraJurosCompostos {

    double taxaDeJurosUsuario;
    double capitalUsuario;
    int tempoInvenstimento;

    public double CalculoDeJurosCompostos() {
        double taxaAoAno = taxaDeJurosUsuario / 100;
        double montante = capitalUsuario;

        while (tempoInvenstimento > 0) {
            double jurosComposto = montante * taxaAoAno;
            montante += jurosComposto;
            tempoInvenstimento--;
        }

        return montante;
    }
}
