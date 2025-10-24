/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_ducher;

import java.util.Scanner;

/**
 *
 * @author louis
 */
public class TP1_convertisseur_DUCHER {

    /**
     * @param args the command line arguments
     */
    public static double CelsiusVersKelvin(double valeurCelsius) {
        return valeurCelsius + 273.15;
    }

    // --- 2. Kelvin → Celsius
    public static double KelvinVersCelsius(double valeurKelvin) {
        return valeurKelvin - 273.15;
    }

    // --- 3. Fahrenheit → Celsius
    public static double FahrenheitVersCelsius(double valeurFahrenheit) {
        return (valeurFahrenheit - 32) * 5 / 9;
    }

    // --- 4. Celsius → Fahrenheit
    public static double CelsiusVersFahrenheit(double valeurCelsius) {
        return (valeurCelsius * 9 / 5) + 32;
    }

    // --- 5. Kelvin → Fahrenheit
    public static double KelvinVersFahrenheit(double valeurKelvin) {
        // Astuce : on réutilise les méthodes déjà créées
        double valeurCelsius = KelvinVersCelsius(valeurKelvin);
        return CelsiusVersFahrenheit(valeurCelsius);
    }

    // --- 6. Fahrenheit → Kelvin
    public static double FahrenheitVersKelvin(double valeurFahrenheit) {
        // Astuce : conversion indirecte via Celsius
        double valeurCelsius = FahrenheitVersCelsius(valeurFahrenheit);
        return CelsiusVersKelvin(valeurCelsius);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Convertisseur de températures ===");
        System.out.print("Entrez une température en degrés Celsius : ");
        double valeurC = sc.nextDouble();

        double valeurK = CelsiusVersKelvin(valeurC);
        double valeurF = CelsiusVersFahrenheit(valeurC);

        System.out.println("\nRésultats des conversions :");
        System.out.println(valeurC + " C = " + valeurK + " K");
        System.out.println(valeurC + " C = " + valeurF + " F");

        System.out.println("\nExemples supplémentaires :");
        System.out.println("300 K = " + KelvinVersCelsius(300) + " C");
        System.out.println("32 °F = " + FahrenheitVersCelsius(32) + " C");
        System.out.println("32 °F = " + FahrenheitVersKelvin(32) + " K");

        sc.close();
    }
}
