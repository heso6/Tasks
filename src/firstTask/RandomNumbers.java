package firstTask;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

    public static void main(String[] args) {

        int numberToGuess = getnumberToGuess();
        System.out.println(numberToGuess);
        System.out.println("„Proszę zgadnij liczbę z zakresu 0-99”");


        for (int i = 5; i >= 1; i--) {
            int userNumber = getNumberFromUser();

            if (userNumber == numberToGuess) {
                System.out.println("Zgadłeś!");
                break;

            } else if (userNumber < numberToGuess) {
                System.out.println("Podałeś za małą liczbę");
            } else {
                System.out.println("Podałeś za duża liczbę");
            }

            if (i - 1 == 0) {
                System.out.println("Niestety nie udało Ci się zgadnąć, poprawna odpowiedź to: " + numberToGuess);
            } else {
                System.out.println("Pozostało Ci jeszcze " + (i - 1) + " prób");
            }
        }


    }

    public static int getNumberFromUser() {
        System.out.println("podaj liczbę!");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public static int getnumberToGuess() {
        int numberToGuess = new Random().nextInt(100);
        return numberToGuess;
    }

}




