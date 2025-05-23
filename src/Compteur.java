import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Compteur {
    public static void main(String[] args) {
        int totalMots = 0;

        try {
            File fichier = new File("TestExercice3.txt");
            Scanner lecteur = new Scanner(fichier);

            while (lecteur.hasNextLine()) {
                String ligne = lecteur.nextLine();
                ligne = ligne.trim();

                if (!ligne.isEmpty()) {
                    String[] mots = ligne.split("\\s+");
                    totalMots += mots.length;
                }
            }

            lecteur.close();

            System.out.println("Nombre total de mots : " + totalMots);

        } catch (FileNotFoundException e) {
            System.out.println("Fichier introuvable !");
        }
    }
}
