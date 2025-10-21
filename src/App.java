import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        // Ensimmäinen muutos, tässä määritellään muuttujat.
        String answer = "Emma";
        String yritys = "";
        int aKerta = 0;
        // Toinen muutos, while loop pyörii kunnes yritys vasta answeria.
        while (yritys != answer) {

            System.out.println("Guess my name (type stop to exit)");
            yritys = in.nextLine();
            aKerta++;
            // Kolmas muutos, if lauseet laskevat saatiinko oikein ja arvausten määrän.
            if (yritys.equals("stop")) {
                System.out.println("You guessed " + (aKerta - 1) + " times.");
                break;
            }

            if (yritys.equals(answer)) {
                System.out.println("Congratulations!");
                System.out.println("You guessed " + aKerta + " times.");
                break;
            }
        }
        in.close();
    }

}