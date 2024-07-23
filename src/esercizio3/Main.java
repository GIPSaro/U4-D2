package esercizio3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String stringa;

        do {
            System.out.println("Inserisci la tua stringa (o ':q' per uscire):");
            stringa = in.nextLine();

            if (!stringa.equals(":q")) {
                String[] arrayChar = stringa.split("");
                System.out.println(String.join(",", arrayChar));
            }

        } while (!stringa.equals(":q"));

        in.close();
        System.out.println("Programma terminato.");
    }
}
