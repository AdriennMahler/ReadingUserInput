import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int currentYear = 2024;

        System.out.println(getInputFromScanner(currentYear));
    }

    public static String getInputFromScanner(int currentYear) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, What's your name?");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Nice to meet you!");
        System.out.println("Welcome to the Netflix Movie Chatbot!");
        System.out.println("What year were you born?");


        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth >= " +
                    (currentYear - 125) + " and <= " + (currentYear));
            try {
                age = checkData(currentYear, scanner.nextLine());
                if (age < 0) {
                    validDOB = false;
                } else if (age < 18) {
                    System.out.println(name + "You are under 18, I am sorry, You are not allowed to go further!");
                } else
                    validDOB = true;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters are not allowed! Please try again.");
            }
        } while (!validDOB);

        System.out.println("So you are " + age + " years old.");

        boolean validMood = false;

        System.out.println("How is your mood today?");
        System.out.println("Please choose a number!");
        System.out.println("1. I am Happy");
        System.out.println("2. I feel sad...");
        System.out.println("3. I am bored");
        do {
            try {
                int i = scanner.nextInt();
                if (i == 1) {
                    validMood = true;
                    MoodHappy.happy();
                } else if (i == 2){
                    validMood = true;
                    MoodSad.sad();
                }else if (i==3){
                    validMood = true;
                    MoodBored.bored();
                }
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters are not allowed! Please try again.");
            }
        }while (!validMood);



            return "Have a nice day!";
        }

        public static int checkData ( int currentYear, String dateOfBirth){

            int dob = Integer.parseInt(dateOfBirth);
            int minimumYear = currentYear - 125;

            if ((dob < minimumYear) || (dob > currentYear)) {
                return -1;
            }
            return currentYear - dob;
        }


    }
