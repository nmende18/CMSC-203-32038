/*
 * Class: CMSC203 
 * Instructor: 
 * Description: (A program using classes to display patient's information and procedures)
 * Due: 02/27/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Napoleon Mendez
*/

public class PatientDriverApp {

	public static void main(String[] args) {
		
			System.out.println("Patient info: ");
			// creating a patient object
			Patient patient = new Patient("Kale", "Lucas", "Kartz", "145 Ferrara Street",
					"TheThorn", "FL", "8534", " 964-321-9843", "Santa", "985-9024-4385");
			
			// creating procedure objects
			Procedure procedure1 = new Procedure("X-Ray", "04/07/2019");
			Procedure procedure2 =  new Procedure("STD", "03/02/2019", "Dr.Kutler", 456.02);
			Procedure procedure3 = new Procedure("Broken Bone Repair", "07/01/2019", "Dr Martz", 145.03);
			
			double total;
			// displaying information
			displayPatient(patient);
			System.out.println();
			displayProcedure(procedure1);
			displayProcedure(procedure2);
			displayProcedure(procedure3);
			total = calculateTotalCharges(procedure1, procedure2, procedure3);
			System.out.println("Total charges: " + "$" + total);
			System.out.println();
			// student information
			System.out.println("Student Name: Napoleon Mendez");
			System.out.println("MC#: M21137391");
			System.out.println("Due Date: 02/27/2024");
			
	}
	// method to display patient information
	public static void displayPatient(Patient patient) {
		System.out.println("  Name: " + patient.buildFullName());
		System.out.println("  Address: " + patient.buildAddress());
		System.out.println("  EmergencyContact: " + patient.buildEmergency());
	}
	// method to display patient's procedures
	public static void displayProcedure(Procedure procedure) {
		System.out.println("\tProcedure: " + procedure.getNameOfProcedure());
		System.out.println("\tProcedureDate = " + procedure.getDateOfProcedure());
		System.out.println("\tPractitioner = " + procedure.nameOfPractitioner());
		System.out.println("\tCharge = " + procedure.getchargeForProcedure());
		System.out.println();
	}
	// method to get total of procedure's charges
	public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
		return procedure1.getchargeForProcedure() + procedure2.getchargeForProcedure() + procedure3.getchargeForProcedure();
		
	}
		
	
}

