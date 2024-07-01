import java.util.Scanner;

public class MoodBored {
    public static void main(String[] args) {

    }

    public static void bored() {
        Scanner scanner = new Scanner(System.in);
        boolean validFilmGenre = true;
        boolean validBored = false;
        System.out.println("Oh, bored? Let's have sum fun!");
        System.out.println("Which genre would you try? Please choose a number");
        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Horror");

        do {
            try {
                int i = scanner.nextInt();
                if (i == 1) {
                    validBored = true;
                    System.out.println("I recommend you to watch: Don't look UP");
                } else if (i == 2) {
                    validBored = true;
                    System.out.println("I recommend you to watch: Ocean's Twelve");
                } else if (i == 3) {
                    validBored = true;
                    System.out.println("I recommend you to watch: Hannibal");
                }
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters are not allowed! Please try again.");
            }
        } while (!validBored);
    }


}
