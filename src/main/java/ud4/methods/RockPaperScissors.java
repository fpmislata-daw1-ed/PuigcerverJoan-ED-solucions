package ud4.methods;

import java.util.Locale;
import java.util.Scanner;

class RockPaperScissors {
    static Scanner in = new Scanner(System.in).useLocale(Locale.US);

    public static String readPlayerChoince(int n){
        System.out.printf("Introdueix l'elecció del jugador %d (pedra/paper/tisores): \n", n);
        return in.nextLine();
    }

    public static int playRockPaperScissors(String choice1, String choice2){
        if (choice1.equals(choice2))
            return 0;

        if ((choice1.equals("pedra") && choice2.equals("tisores"))
                || (choice1.equals("paper") && choice2.equals("pedra"))
                || (choice1.equals("tisores") && choice2.equals("paper")))
            return 1;

        return 2;
    }

    public static void printWinner(int winner){
        if (winner == 0)
            System.out.println("Empat.");
        else
            System.out.printf("Guanya el jugador %d!\n", winner);
    }

    public static void main(String[] args) {
        String choice1 = readPlayerChoince(1);
        String choice2 = readPlayerChoince(2);

        int winner = playRockPaperScissors(choice1, choice2);

        printWinner(winner);
    }
}