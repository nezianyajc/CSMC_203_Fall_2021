import java.util.Scanner;

public class RandomNumberGuesser {

    public static void main(String[] args) {
        int guess, randomNum, count, nextGuess, highGuess, lowGuess;
        String playAgain, userName;
        boolean flag;
        Scanner guessObj = new Scanner(System.in);
        RNG rng = new RNG();
        count = rng.getCount();
        randomNum = rng.rand();
        flag = true;

        System.out.println("Welcome to Random Number Guesser! Please enter your name.");
        userName = guessObj.nextLine();

        System.out.println(randomNum);
        System.out.println(userName + " please select a number between 0 and 100");
        guess = guessObj.nextInt();
        nextGuess = 0;
        lowGuess = 0;
        highGuess = 0;

        while (flag == true) {

            if (guess == randomNum) {
                System.out.println("You guessed correctly. It took you  " + count + " tries. Play again? ");
                playAgain = guessObj.nextLine();

            } else if (guess != randomNum) {

                if (guess > randomNum && count < 2) {
                    highGuess = guess;
                    System.out.println(count);
                    System.out.println("Your guess is too high");
                    System.out.println("Enter your next guess between 0 and " + guess);
                    nextGuess = guessObj.nextInt();

                } else if (guess < randomNum && count < 2) {
                    lowGuess = guess;
                    System.out.println(count);
                    System.out.println("Your guess is too low");
                    System.out.println("Enter your next guess between " + guess + " and 100");
                    nextGuess = guessObj.nextInt();

                }

                if (guess > randomNum && count > 1) {
                    RNG.inputValidation(nextGuess, lowGuess, highGuess);
                    System.out.println("The code reached here");

                } else if (guess > randomNum && count > 1) {
                    RNG.inputValidation(nextGuess, lowGuess, highGuess);
                    System.out.println("The code reached here too");

                }
            }
            count++;
        }

    }
}
