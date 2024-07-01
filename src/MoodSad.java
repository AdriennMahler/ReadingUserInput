import java.util.Scanner;

public class MoodSad {
    public static void main(String[] args) {

    }

    public static void sad() {
        Scanner scanner = new Scanner(System.in);
        boolean validFilmGenre = true;
        boolean validSad = false;
        System.out.println("Are you sad? I am sorry to hear that!");
        System.out.println("I would like to suggest you some Film genres to cheer you up! Please choose a number");
        System.out.println("1. Comedy");
        System.out.println("2. Romance");
        System.out.println("3. Family");
        do {
            try {
                int i = scanner.nextInt();
                if (i == 1) {
                    validSad = true;
                    System.out.println("I recommend you to watch: Miss Undercover");
                } else if (i == 2) {
                    validSad = true;
                    System.out.println("I recommend you to watch: Sex and the City 2");
                } else if (i == 3) {
                    validSad = true;
                    System.out.println("I recommend you to watch: Madagascar");
                }
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters are not allowed! Please try again.");
            }
        } while (!validSad);
    }


}
