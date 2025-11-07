package Atividades_Listas_Senai.Modularização.ConversorTemperatura;

public class ConversorTemperatura {
    double temperaturaUsuario = 0;

    public double conveterCelsius(){
        return (temperaturaUsuario - 32) * 5.0 / 9.0;
    }
    public double conveterFahrenheit(){
        return (temperaturaUsuario * 1.8) + 32;
    }
}
