/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_ducher;

/**
 *
 * @author louis
 */
public class TP2_convertisseurObjet_DUCHER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur Va = new Convertisseur();
        Va.FahrenheitVersKelvin(156);
        System.out.println(Va);
    }
    System.out.println("=== MENU CONVERTISSEUR DE TEMPERATURES ===");

        do {
            System.out.println("\nChoisissez le type de conversion :");
            System.out.println("1 - Celsius -> Kelvin");
            System.out.println("2 - Kelvin -> Celsius");
            System.out.println("3 - Fahrenheit -> Celsius");
            System.out.println("4 - Celsius -> Fahrenheit");
            System.out.println("5 - Kelvin -> Fahrenheit");
            System.out.println("6 - Fahrenheit -> Kelvin");
            System.out.println("0 - Quitter");
            System.out.print("Votre choix : ");

            choix = sc.nextInt();

            if (choix == 0) {
                System.out.println("Au revoir !");
                break;
            }

            System.out.print("Entrez la valeur à convertir : ");
            double valeur = sc.nextDouble();
            double resultat = 0;
            String uniteDepart = "", uniteArrivee = "";

            switch (choix) {
                case 1:
                    resultat = CelsiusVersKelvin(valeur);
                    uniteDepart = "°C";
                    uniteArrivee = "K";
                    break;
                case 2:
                    resultat = KelvinVersCelsius(valeur);
                    uniteDepart = "K";
                    uniteArrivee = "°C";
                    break;
                case 3:
                    resultat = FahrenheitVersCelsius(valeur);
                    uniteDepart = "°F";
                    uniteArrivee = "°C";
                    break;
                case 4:
                    resultat = CelsiusVersFahrenheit(valeur);
                    uniteDepart = "°C";
                    uniteArrivee = "°F";
                    break;
                case 5:
                    resultat = KelvinVersFahrenheit(valeur);
                    uniteDepart = "K";
                    uniteArrivee = "°F";
                    break;
                case 6:
                    resultat = FahrenheitVersKelvin(valeur);
                    uniteDepart = "°F";
                    uniteArrivee = "K";
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer !");
                    continue;
            }

            System.out.println(valeur + " " + uniteDepart + " = " + resultat + " " + uniteArrivee);

        } while (choix != 0);

        sc.close();
    }
    
}
