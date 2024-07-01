import java.util.Scanner;

public class MoodHappy {
    public static void main(String[] args) {

    }

    public static void happy() {
        Scanner scanner = new Scanner(System.in);
        boolean validFilmGenre = true;
        boolean validHappy = false;
        System.out.println("Do you feel happy? I am glad to hear that!");
        System.out.println("Please choose the Film genre you would like to watch");
        System.out.println("1. Thriller");
        System.out.println("2. Action");
        System.out.println("3. Crime");

        do {
            try {
                int i = scanner.nextInt();
                if (i == 1) {
                    validHappy = true;
                    System.out.println("I recommend you to watch: Captain Phillips");
                } else if (i == 2) {
                    validHappy = true;
                    System.out.println("I recommend you to watch: Matrix 3");
                } else if (i == 3) {
                    validHappy = true;
                    System.out.println("I recommend you to watch: American Gangster ");
                }
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters are not allowed! Please try again.");
            }
        } while (!validHappy);
    }

    public static void bored(){
        boolean validFilmGenre = true;
        System.out.println("Oh, bored? Let's have sum fun!");
        System.out.println("Which genre would you try? Please choose a number");
        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Horror");
    }
}
