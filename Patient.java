
public class Patient {

	// attributes
	private String firstName;
	private String middleName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private String zipCode;
	private String phoneNumber;
	private String nameEmergency;
	private String phoneEmergency;
	
	// default constructor
	public Patient() {
		
	}
	// constructor with only 3 parameters
	public Patient(String name, String middle, String last) {
		firstName = name;
		middleName = middle;
		lastName = last;
	}
	// constructor with all the parameters
	public Patient(String name, String middle, String last, String street, String cityPatient, String statePatient, String zip, String phone, String nameContact, String phoneContact) {
		firstName = name;
		middleName = middle;
		lastName = last;
		streetAddress = street;
		city = cityPatient;
		state = statePatient;
		zipCode = zip;
		phoneNumber = phone;
		nameEmergency = nameContact;
		phoneEmergency = phoneContact;
	}
	// Accesors for each attribute.
	public String getFirstName() {
		return firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public String getLastname() {
		return lastName;
	}
	public String getSreetAddress() {
		return streetAddress;
	}
	public String city() {
		return city;
	}
	public String state() {
		return state;
	}
	public String zipCode() {
		return zipCode;
	}
	public String phoneNumber() {
		return phoneNumber;
	}
	public String nameEmergency() {
		return nameEmergency;
	}
	public String phoneEmeegency() {
		return phoneEmergency;
	}
	// Mutator for each attribute.
	public void setFirstName(String name) {
		firstName = name;
	}
	public void setMiddleName(String middle) {
		middleName = middle;
	}
	public void setLastName(String last) {
		lastName = last;
	}
	public void setstreetAddress(String street) {
		streetAddress = street;
	}
	public void setCity(String cityPatient) {
		city = cityPatient;
	}
	public void setState(String statePatient) {
		state = statePatient;
	}
	public void setZipCode(String zip) {
		zipCode = zip;
	}
	public void setPhoneNumber(String phone) {
		phoneNumber = phone;
	}
	public void setNameEmergency(String nameContact) {
		nameEmergency = nameContact;
	}
	public void setPhoneEmergency(String phoneContact) {
		phoneEmergency = phoneContact;
	}
	
	// methods.
	public String buildFullName() {
		return firstName + " " + middleName + " " + lastName;
	}
	public String buildAddress() {
		return streetAddress + " " + city + " " + state + " " + zipCode;
	}
	public String buildEmergency() {
		return nameEmergency + " " + phoneEmergency;
	}
	public String toString() {
		return "Name: " + buildFullName() + "\n" + "Address: " + buildAddress() +
				"\n" + "Phone number: " + phoneNumber + "\n" + "EmergencyContact: " +
				buildEmergency();
	}
	
}
