package esercizio4;

import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("Inserisci numero:");
            int numero = in.nextInt();

            for (int i = numero; i >= 0 ; i--) {
                System.out.println(i);
            }

            in.close();
        }

    }
