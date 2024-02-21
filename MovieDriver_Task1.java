import java.util.Scanner;
public class MovieDriver_Task1 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the name of a movie");
		String movie = keyboard.nextLine();
		
		System.out.println("Enter the rating of the movie");
		String rating = keyboard.nextLine();
		
		System.out.println("Enter the number of tickets sold for this movie");
		int numOfTickets = keyboard.nextInt();
		
		System.out.println("Goodbye");
		

	}

}
