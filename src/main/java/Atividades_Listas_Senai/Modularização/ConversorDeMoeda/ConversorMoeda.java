package Atividades_Listas_Senai.Modularização.ConversorDeMoeda;

public class ConversorMoeda {

    double moedaUsuario;

    public double ConversorMoedaDolar(){
        return moedaUsuario / 5.34;
    }

    public double ConversorMoedaEuro(){
        return moedaUsuario / 6.18;
    }
}
