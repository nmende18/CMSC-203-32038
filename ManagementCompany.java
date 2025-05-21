/*
 * Class: CMSC203 
 * Instructor:
 * Description: (A property management company manages individual properties)
 * Due: 04/02/2024
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Napoleon Mendez
*/
public class ManagementCompany {
	
	private String name;
	private String taxID;
	private double mgmFee;
	public static final int MAX_PROPERTY = 5;
	public static final int MGMT_WIDTH = 10;
	public static final int MGMT_DEPTH = 10;
	private Property[] properties;
	private Plot plot;
	private int numOfProperties;
	
	//Setters and Getters;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setTaxID(String taxID) {
		this.taxID = taxID;
	}
	public String getTaxID() {
		return taxID;
	}
	public void setMgmFee(double mgmFee) {
		this.mgmFee = mgmFee;
	}
	public double getMgmFee() {
		return mgmFee;
	}
	public void setPlot(int x, int y, int depth, int width) {
		this.plot = new Plot(x, y, depth, width);
	}
	public Plot getPlot() {
		return plot;
	}
	public void setProperties(Property[] properties) {
		this.properties = properties;
	}
	public Property[] getProperties() {
		return properties;
	}
	
	public ManagementCompany() {
		this.name = "";
		this.taxID = "";
		this.mgmFee = 0;
		this.plot = new Plot(0,0, MGMT_WIDTH, MGMT_DEPTH);
		this.properties = new Property[MAX_PROPERTY];
		this.numOfProperties = 0;
	}
	public ManagementCompany(String name, String taxID, double mgmFee) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		this.properties = new Property[MAX_PROPERTY];
	
	}
	public ManagementCompany(ManagementCompany otherCompany) {
		this.name = otherCompany.name;
		this.taxID = otherCompany.taxID;
		this.mgmFee = otherCompany.mgmFee;
	}
	public int addProperty(String name, String city, double rent, String owner) {
		Property property = new Property(name, city, rent, owner);
		return addProperty(property);
	}
	public int addProperty(String name, String city, double rent, String owner,
			int x, int y, int width, int depth) {
		Property property = new Property(name, city, rent, owner);
		return addProperty(property);
	}
	
	public boolean isPropertiesFull() {
		return numOfProperties == MAX_PROPERTY;
	}
	public void removeLastProperty() {
		if(numOfProperties > 0) {
			properties[numOfProperties - 1] = null;
			numOfProperties--;
		}
	}
	public Property getHighestRentPropperty() {
		if(numOfProperties == 0) {
			return null;
		}
		Property highestRentProperty = properties[0];
		for(int i = 1; i <numOfProperties; i++) {
			if(properties[i].getRentAmount() > highestRentProperty.getRentAmount()) {
				highestRentProperty = properties[i];
			}
		}
		return highestRentProperty;
		
	}
	public double getTotalRent() {
		double rent = 0;
		for(int i = 0; i< numOfProperties; i++) {
		rent += properties[i].getRentAmount();
		}
		return rent;
	}
	
	public int getPropertiesCount() {
		return numOfProperties;
	}
	public boolean isManagementFeeValid() {
		return mgmFee >= 0 && mgmFee <= 100;
	}
	
	public int addProperty(Property property) {
		if(property == null) {
			return -2;
		}
		if(isPropertiesFull()) {
			return -1;
		}
	
		if(!plot.encompasses(property.getPlot())) {
			return -3;
		}
		for(int i = 0; i < numOfProperties; i++) {
			if(properties[i].getPlot().overlaps(property.getPlot())) {
				return -4;
			}
		}
		properties[numOfProperties] = property;
		numOfProperties++;
		
		return numOfProperties - 1;
		
	}
	
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("List of the properties for ").append(name).append(", taxID: ").append(taxID).append("\n");
		string.append("______________________________________\n");
		for(int i = 0; i < numOfProperties; i++) {	
			
			string.append(properties[i]).append("\n");
			
		}
		string.append("_______________________________________\n");
		string.append("\nTotal management Fee: ").append(getTotalRent()).append("\n");
		
		return string.toString();
		
	
	}
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	

}
