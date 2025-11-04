/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_ducher;

/**
 *
 * @author louis
 */
public class Convertisseur {
    int nbConversions;
    public Convertisseur () {
 nbConversions = 0 ;
}

 public static double CelsiusVersKelvin(double valeurCelsius) {
        return valeurCelsius + 273.15;
    }

    public static double KelvinVersCelsius(double valeurKelvin) {
        return valeurKelvin - 273.15;
    }

    public static double FahrenheitVersCelsius(double valeurFahrenheit) {
        return (valeurFahrenheit - 32) * 5 / 9;
    }

    public static double CelsiusVersFahrenheit(double valeurCelsius) {
        return (valeurCelsius * 9 / 5) + 32;
    }

    public static double KelvinVersFahrenheit(double valeurKelvin) {
        double valeurCelsius = KelvinVersCelsius(valeurKelvin);
        return CelsiusVersFahrenheit(valeurCelsius);
    }

    public static double FahrenheitVersKelvin(double valeurFahrenheit) {
        double valeurCelsius = FahrenheitVersCelsius(valeurFahrenheit);
        return CelsiusVersKelvin(valeurCelsius);
    }@Override
public String toString () {
 return "nb de conversions"+ nbConversions;
}
   
}
