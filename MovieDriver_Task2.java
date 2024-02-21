import java.util.Scanner;

public class MovieDriver_Task2 {

	public static void main(String[] args) {

	Scanner keyboard = new Scanner(System.in);
	char chance;
	do {
	System.out.println("Enter the name of a movie");
	String movie = keyboard.nextLine();
	
		
	System.out.println("Enter the rating of the movie");
	String rating = keyboard.nextLine();
	
	System.out.println("Enter the number of tickets sold for this movie");
	int numOfTickets = keyboard.nextInt();
	keyboard.nextLine();
	System.out.println("Concussion " + "("
	+ rating + ")" + " : Tickets Sold: " + numOfTickets);
	System.out.println("Do you want to enter another?  (y or n)");
	chance = keyboard.next().charAt(0);
	keyboard.nextLine();
	}while(chance == 'y');
	System.out.println("Goodbye");
	

	}

}
