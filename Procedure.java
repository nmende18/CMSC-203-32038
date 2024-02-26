
public class Procedure {

	// attributes of the class procedure
	private String nameOfProcedure;
	private String dateOfProcedure;
	private String nameOfPractitioner;
	private double chargeForProcedure;
	
	// default constructor
	public Procedure() {
		
	}
	// constructor with two parameters
	public Procedure(String nameProcedure, String dateProcedure) {
		nameOfProcedure = nameProcedure;
		dateOfProcedure = dateProcedure;
	}
	// constructor with all parameters
	public Procedure(String nameProcedure, String dateProcedure, String namePractitioner, double chargeProcedure) {
		nameOfProcedure = nameProcedure;
		dateOfProcedure = dateProcedure;
		nameOfPractitioner = namePractitioner;
		chargeForProcedure = chargeProcedure;
	}
	// accesor for each attributes.
	public String getNameOfProcedure() {
		return nameOfProcedure;
	}
	public String getDateOfProcedure() {
		return dateOfProcedure;
	}
	public String nameOfPractitioner() {
		return nameOfPractitioner;
	}
	public double getchargeForProcedure() {
		return chargeForProcedure;
	}
	// mutator for each attributes.
	public void setNameOfProcedure(String nameProcedure) {
		nameOfProcedure = nameProcedure;
	}
	public void setDateOfProcedure(String dateProcedure) {
		dateOfProcedure = dateProcedure;
	}
	public void setNameOfPractitioner(String namePractitioner) {
		nameOfPractitioner = namePractitioner;
	}
	public void setChargeForProcedure(double chargeProcedure) {
		chargeForProcedure = chargeProcedure;
	}
	public String toString() {
		return "Procedure: " + nameOfProcedure + "\n" + "ProcedureDate = " + dateOfProcedure +
				"\n" + "Practitioner = " + nameOfPractitioner + "\n"  + 
				"Charge = " + chargeForProcedure;
	}
	
}
