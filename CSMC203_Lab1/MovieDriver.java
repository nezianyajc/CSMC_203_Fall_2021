import java.util.Scanner;

public class MovieDriver {

    public static void main(String[] args) {
        String title, rating, movieTheater, continueGame;
        int soldTickets, moreRatings;

        moreRatings = 0;
        continueGame = "";
        Movie movie = new Movie();
        Scanner movieObj = new Scanner(System.in);

        while (moreRatings != 1) {

            System.out.println("Please enter the title of a movie.");
            title = movieObj.nextLine();
            movie.setTitle(title);
            System.out.println(movie.getTitle() + " is your movie title");

            System.out.println("Please enter the movie's rating: G, PG, PG-13, or R.");
            rating = movieObj.nextLine();
            movie.setRating(rating);
            System.out.println("The movie is rated " + movie.getRating());

            System.out.println("What is the name of the theater?");
            movieTheater = movieObj.nextLine();
            System.out.println("Please enter the number of tickets sold at " + movieTheater);
            soldTickets = movieObj.nextInt();
            movieObj.nextLine();
            movie.setSoldTickets(soldTickets);

            System.out.println(movieTheater + " sold " + movie.getSoldTickets());
            System.out.println(movie.toString());

            System.out.println("Would you like to rate another movie? Please enter yes or no");
            continueGame = movieObj.nextLine();

            if (continueGame.contains("yes")) {
                moreRatings = 2;
            }
            if (continueGame.contains("no")) {
                System.out.println(continueGame);
                moreRatings = 0;
            }

        }
        movieObj.close();
    }

}
