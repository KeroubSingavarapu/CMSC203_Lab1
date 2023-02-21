import java.util.Scanner;

public class MovieDriver {
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);

		String title, rating, choice;
		int tickets;

		do {

			Movie movie = new Movie();

			System.out.println("Enter the name of the move: ");

			title = userInput.nextLine();

			movie.setTitle(title);

			System.out.println("\nEnter the rating of the movie: ");

			rating = userInput.nextLine();

			movie.setRating(rating);

			System.out.println("\nEnter the number of tickets sold for this movie: ");

			tickets = userInput.nextInt();

			movie.setSoldTickets(tickets);
			
			userInput.nextLine();
			
			System.out.println("\n" + title + " (" + rating + "). " + "Tickets Sold: " + tickets);

			System.out.println("\nDo you want to enter a new movie? (yes or no)");

			choice = userInput.nextLine();
			
			System.out.println("");

		} while(choice.equalsIgnoreCase("yes"));
		
		System.out.println("Goodbye.");
		
	}
}