/*
 * Class: CMSC203 32038
 * Instructor:Ashique Tanveer
 * Description: (A property management company manages individual properties)
 * Due: 04/02/2024
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Napoleon Mendez
*/

public class Property {
	
	private String propertyName;
	private String city;
	private double rentAmount;
	private String owner;
	private Plot plot;
	
	// Getter/Setter methods
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setRentalAmount(double rentalAmount) {
		this.rentAmount = rentalAmount;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getPropertyName() {
		return propertyName;
	}
	public String getCity() {
		return city;
	}
	public double getRentAmount() {
		return rentAmount;
	}
	public String getOwner() {
		return owner;
	}
	// toString method
	public String toString() {
		return propertyName + "," + city + "," + owner + "," + rentAmount;
	}
	
	public Property() {
		
	}
	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
	}
	public Property(String propertyName, String city, double rentAmount, String owner, 
			int x, int y, int width, int depth) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot(x, y, width, depth);
	}
	public Property(Property otherProperty) {
		this.propertyName = otherProperty.propertyName;
		this.city = otherProperty.city;
		this.rentAmount = otherProperty.rentAmount;
		this.owner = otherProperty.owner;
	}
	public Plot getPlot() {
		return plot;
	}
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
