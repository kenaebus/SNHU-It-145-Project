
public class Monkey extends RescueAnimal{
	
	//Instance Variables
	private String tailLength;
	private String species;
	private String height;
	private String bodyLength;
	
	// Constructor
	public Monkey(String name, String tailLength, String species, String height, String bodyLength, String gender, String age,
		    String weight, String acquisitionDate, String country,
			String trainingStatus, boolean reserved, String inServiceCountry) {
		
		setTailLength(tailLength);
		setSpecies(species);
		setHeight(height);
		setBodyLength(bodyLength);
		setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(country);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
	}
	
	// Accessor Methods
	public String getTailLength(){
		return tailLength;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public String getHeight() {
		return height;
	}
	
	public String getBodyLength() {
		return bodyLength;
	}
	
	
	// Mutator methods
	public void setTailLength(String length) {
		this.tailLength = length;
	}
	
	public void setSpecies(String monkeySpecies) {
		this.species = monkeySpecies;
	}
	
	public void setHeight(String monkeyHeight) {
		this.height = monkeyHeight;
	}
	
	public void setBodyLength(String bodLength) {
		this.bodyLength = bodLength;
	}
	
	
	
	
	

}
