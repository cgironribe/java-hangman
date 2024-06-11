import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String secret_word = "MEANWHILE";
        int attempts = 10;
        boolean guessed = false;
        char[] guessed_letters = new char[secret_word.length()];
        for(int i = 0; i < guessed_letters.length;i++){
            guessed_letters[i] = '_';

        }

        while(guessed == false && attempts > 0){
            System.out.println("Word to guess: " + String.valueOf(guessed_letters));
            System.out.println("Write a letter: ");
            char letter = scanner.next().charAt(0);
            char letter_upper = Character.toUpperCase(letter);


            for (int i = 0; i < secret_word.length();i++){
                if(secret_word.charAt(i)== letter_upper){
                    guessed_letters[i] = letter_upper;
                }
            }
            if (String.valueOf(guessed_letters).equals(secret_word)){
                System.out.println("You guessed the secret word! '" + secret_word + "'");
                guessed = true;
            }

            if (secret_word.contains(String.valueOf(letter_upper))){
                System.out.println("The letter: " + letter_upper + "is in the mystery word!");
            }
            else{
                attempts--;
                    System.out.println("The letter "+ letter_upper + " does not appear in the mystery word.");
                    System.out.println("You have now: " + attempts + " attempts left.");

                }
            }


        if (attempts == 0){
            System.out.println("I am afraid you wasted all your attempts. Nice try.");
            System.out.println("Game over");
        }

        scanner.close();
    }
}