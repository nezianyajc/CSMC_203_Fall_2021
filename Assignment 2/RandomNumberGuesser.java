import java.util.Scanner;

public class RandomNumberGuesser {

    public static void main(String[] args) {
        int guess, randomNum, count, nextGuess, highGuess, lowGuess;
        String playAgain, userName;
        boolean flag;
        Scanner guessObj = new Scanner(System.in);
        RNG rng = new RNG();
        count = RNG.getCount();
        randomNum = rng.rand();
        flag = true;

        System.out.println("Welcome to Random Number Guesser! Please enter your name.");
        userName = guessObj.nextLine();

        System.out.println(randomNum);
        System.out.println(userName + " please select a number between 0 and 100");
        guess = guessObj.nextInt();
        guessObj.nextLine();
        nextGuess = 0;
        lowGuess = 0;
        highGuess = 0;

        while (flag == true) {

            if (guess == randomNum) {
                System.out.println("You guessed correctly. It took you  " + count + " tries. Play again? yes or no ");
                playAgain = guessObj.nextLine();
                if (playAgain.contains("yes")) {
                    randomNum = rng.rand();
                    count = 0;
                    System.out.println(randomNum);
                    System.out.println(userName + " please select a number between 0 and 100");
                    guess = guessObj.nextInt();
                    guessObj.nextLine();

                } else if (playAgain.contains("no")) {
                    System.out.println(userName + " thanks for playing...");
                    flag = false;
                }

            } else if (guess != randomNum) {

                if (guess > randomNum && count <= 1) {

                    System.out.println("Your guess is too high");
                    System.out.println("Enter your next guess between 0 and " + guess);
                    highGuess = guessObj.nextInt();
                    guessObj.nextLine();

                } else if (guess < randomNum && count <= 1) {
                    System.out.println(count);
                    System.out.println("Your guess is too low");
                    System.out.println("Enter your next guess between " + guess + " and 100");
                    lowGuess = guessObj.nextInt();
                    guessObj.nextLine();

                }

                if (guess > randomNum && count >= 1) {
                    System.out.println("Your number of guesses is " + count);
                    if (count == 1) {
                        System.out.println("Please enter your first guess");
                        nextGuess = guessObj.nextInt();
                        guessObj.nextLine();

                    } else if (count > 1) {
                        System.out.println("Please enter your next guess");
                        nextGuess = guessObj.nextInt();
                        guessObj.nextLine();
                        if (nextGuess > guess) {
                            lowGuess = guess;
                            RNG.inputValidation(nextGuess, lowGuess, 100);
                        } else if (nextGuess < guess) {
                            highGuess = guess;
                            RNG.inputValidation(nextGuess, 0, highGuess);
                        }

                    }

                    if (nextGuess > guess) {
                        lowGuess = guess;
                        RNG.inputValidation(nextGuess, lowGuess, 100);
                    } else if (nextGuess < guess) {
                        highGuess = guess;
                        RNG.inputValidation(nextGuess, 0, highGuess);
                    }

                    if (nextGuess == randomNum) {
                        System.out.print("Congratulations you guessed correctly. Try again? 'yes' or 'no' ");
                        playAgain = guessObj.nextLine();
                        if (playAgain.contains("yes")) {
                            randomNum = rng.rand();
                            count = 0;
                            System.out.println(userName + " please select a number between 0 and 100");
                            guess = guessObj.nextInt();
                            guessObj.nextLine();
                        } else if (playAgain.contains("no")) {
                            System.out.println(userName + " thanks for playing...");
                            flag = false;

                        }
                    }
                    RNG.inputValidation(nextGuess, 0, highGuess);

                } else if (guess < randomNum && count >= 1) {
                    System.out.println("Your number of guesses is " + count);
                    if (count == 1) {
                        System.out.println("Please enter your first guess");
                        nextGuess = guessObj.nextInt();
                        guessObj.nextLine();

                    } else if (count > 1) {
                        System.out.println("Please enter your next guess");
                        nextGuess = guessObj.nextInt();
                        guessObj.nextLine();
                        if (nextGuess > guess) {
                            lowGuess = guess;
                            RNG.inputValidation(nextGuess, lowGuess, 100);
                        } else if (nextGuess < guess) {
                            highGuess = guess;
                            RNG.inputValidation(nextGuess, 0, highGuess);
                        }

                    }

                    if (nextGuess > guess) {
                        lowGuess = guess;
                        RNG.inputValidation(nextGuess, lowGuess, 100);
                    } else if (nextGuess < guess) {
                        highGuess = guess;
                        RNG.inputValidation(nextGuess, 0, highGuess);
                    }

                    if (nextGuess == randomNum) {
                        System.out.print("Congratulations you guessed correctly. Try again? 'yes' or 'no' ");
                        playAgain = guessObj.nextLine();
                        if (playAgain.contains("yes")) {
                            randomNum = rng.rand();
                            count = 0;
                            System.out.println(userName + " please select a number between 0 and 100");
                            guess = guessObj.nextInt();
                            guessObj.nextLine();
                        } else if (playAgain.contains("no")) {
                            System.out.println(userName + " thanks for playing...");
                            flag = false;
                        }
                    }
                    RNG.inputValidation(nextGuess, lowGuess, 100);
                }
            }
            count++;
        }

    }
}
