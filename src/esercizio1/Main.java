package esercizio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una stringa");
        String inputString = scanner.nextLine();

        System.out.println(("La lunghezza della stringa è pari? " + stringaPariDispari(inputString)));

        System.out.println("Inserisci un anno");
        int inputYear = scanner.nextInt();

        System.out.println("L'anno inserito è bisestile? " + annoBisestile((inputYear)));
        scanner.close();
    }
    public static boolean stringaPariDispari(String stringa){
        if(stringa.length() % 2 == 0){
            return true;

        }else{
            return false;
        }
    }
    public static boolean annoBisestile(int anno){
        if((anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0)){
            return true;
        } else{
            return false;
        }
    }
}