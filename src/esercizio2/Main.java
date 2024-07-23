package esercizio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Inserisci un numero compreso tra 0 e 3: ");
        int num = scanner.nextInt();
        String numeroInChars;

        switch (num){
            case 0:
            numeroInChars = "zero";
            break;
            case 1:
                numeroInChars ="uno";
                break;
            case 2:
                numeroInChars ="due";
                break;
            case 3:
                numeroInChars ="tre";
                break;
            default:
                System.out.println("Il numero non è compreso tra 0 e 3!!");
                scanner.close();
                return;

        }
        System.out.println(numeroInChars);
        scanner.close();
    }
}
