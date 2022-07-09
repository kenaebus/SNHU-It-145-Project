import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	public static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    
    // Instance variables (if needed)

    public static void main(String[] args) {
    	char option;
    	
    	initializeDogList();
    	initializeMonkeyList();
    		
    	
    // Do while menu loop that takes user input, validates, and executes menu option
    	displayMenu();
    	option = scanner.next().charAt(0);
    	
    	do {
    			if (option == '1') {
    				intakeNewDog(scanner);
    			}
    			else if (option == '2') {
    				intakeNewMonkey(scanner);
    			}
    			else if (option == '3') {
    				reserveAnimal(scanner);
    			}
    			else if (option == '4') {
    				printAnimals(option);
    				break;
    			}
    			else if (option == '5') {
    				printAnimals(option);
    				break;
    			}
    			else if (option == '6') {
    				printAnimals(option);
    				break;
    			}
    			else {
    				System.out.println("You have entered an invalid input");
    			}
    		} while (option != 'q');
    	}
    	
    	

	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.


    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", true, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", false, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Albert", "male", "8", "9.5", "06-12-2019", "Capuchin", "18.4", "18.1", "17.6", "United States", "in service", false, "Costa Rica");
        Monkey monkey2 = new Monkey("Ada", "female", "6", "1.2", "04-18-2020", "Tamarin", "10.1", "9.9", "13.2", "Canada", "Phase 4", true, "Brazil");
        Monkey monkey3 = new Monkey("Galileo", "male", "7", "7.8", "11-22-2019", "Guenon", "26.2", "21.2", "20.3", "United States", "Phase 3", false, "Congo");
    	
    	monkeyList.add(monkey1);
    	monkeyList.add(monkey2);
    	monkeyList.add(monkey3);
    }


	// Take input of new dog if it doesn't exist in the dogList ArrayList
    public static void intakeNewDog(Scanner scanner) {
    	
    	initializeDogList();
    	
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {  // If a dog bye the name inputed exists
            	System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        		
        	// Grab data for new Dog
        	System.out.println("What is the dog's breed?");
        	String breed = scanner.nextLine();
        	
        	System.out.println("What is the dog's gender?");
        	String gender = scanner.nextLine();
        	
        	System.out.println("What is the dog's age?");
        	String age = scanner.nextLine();
        	
        	System.out.println("What is the dog's weight?");
        	String weight = scanner.nextLine();
        	
        	System.out.println("What is the dog's aquisition date?");
        	String date = scanner.nextLine();
        	
        	System.out.println("Where was the dog aquired?");
        	String country = scanner.nextLine();
        	
        	System.out.println("What is the dog's training status?");
        	String status = scanner.nextLine();
        	
        	System.out.println("Is the dog reserved?");
        	boolean isReserved = scanner.nextBoolean();
        	
        	System.out.println("Which country is the dog in service?");
        	String serviceCountry = scanner.nextLine();
        
        	Dog dog4 = new Dog(name, breed, gender, age, weight, date, country, status, isReserved, serviceCountry);
        	
        	dogList.add(dog4);
        	System.out.println("Your entry has been added to the dogList");
        	
    }

    
   

	// Take input of new monkey if it doesn't exist in the monkeyList ArrayList
        public static void intakeNewMonkey(Scanner scanner) {
            
        	initializeMonkeyList();
        	
        	System.out.println("What is the monkey's name?");
        	String name = scanner.nextLine();    //Input of name
        	for (Monkey monkey : monkeyList) {
        		if (monkey.getName().equalsIgnoreCase(name)) {    // If a monkey by the name inputed exists
        			System.out.println("\n\nThis monkey is already in our system\n\n");
        	        return; //returns to menu
        		}
        	}
        		
        		// Grab data of new Monkey
        		System.out.println("What is the monkey's tail length?"); 
        		String tailLength = scanner.nextLine();
        		
        		System.out.println("What is the monkey's species?");
        		String mSpecies = scanner.nextLine();
        		
        		System.out.println("What is the monkey's height?");  
        		String height = scanner.nextLine();
        		
        		System.out.println("What is the monkey's body length?");  
        		String bodyLength = scanner.nextLine();
        		
        		System.out.println("What is the monkey's gender?");
        		String gender = scanner.nextLine();
        		
        		System.out.println("What is the monkey's age?");
        		String age = scanner.nextLine();
        		
        		System.out.println("What is the monkey's weight?");
        		String weight = scanner.nextLine();
        		
        		System.out.println("When was the monkey aquired?");  
        		String date = scanner.nextLine();
        		
        		System.out.println("Where was the monkey aquired?");
        		String country = scanner.nextLine();
        		
        		System.out.println("What is the monkey's training status?");
        		String trainingStatus = scanner.nextLine();
        		
        		System.out.println("Is the monkey reserved?"); 
        		boolean isReserved = scanner.nextBoolean();
        		
        		System.out.println("Which country is the monkey in service?");
        		String serviceCountry = scanner.nextLine();
        		
        	
        		Monkey monkey4 = new Monkey(name, tailLength, mSpecies, height, bodyLength, gender, age, weight, date, country, trainingStatus, isReserved, serviceCountry);
        			
        		monkeyList.add(monkey4);
        		System.out.println("Your entry has been added to the monkeyList");
        }

        
        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
        	scanner.nextLine();
        	System.out.println("Enter animal type (dog or monkey): ");
        	String animalType = scanner.nextLine();
          
            if (animalType.equalsIgnoreCase("monkey")) { 
            	System.out.println("Enter monkey's species: ");
            	String monkeySpecies = scanner.nextLine();
            	System.out.println("Enter monkey's service country");
            	String InServiceCountry = scanner.nextLine();
            	
            	// If there is a monkey with entered species or entered country to be in service for, set monkey to be reserved.
            		for (Monkey monkey : monkeyList) {
            			if (monkey.getSpecies().equalsIgnoreCase(monkeySpecies) || monkey.getInServiceLocation().equalsIgnoreCase(InServiceCountry)) {
            				monkey.setReserved(true);
            				monkey.setInServiceCountry(InServiceCountry);
            				System.out.println("Monkey is reserved.");
            				return;
            			}
            			
            		}
            		System.out.println("The monkey entered is not registered.");
            }
            else if (animalType.equalsIgnoreCase("dog")) {
            	System.out.println("Enter dog's breed: ");
            	String dogBreed = scanner.nextLine();
            	System.out.println("Enter dog's service country");
            	String InServiceCountry = scanner.nextLine();
            	
            	// If there is a dog with entered species or entered country to be in service for, set dog to be reserved.
            		for (Dog dog : dogList) {
            			if (dog.getBreed().equalsIgnoreCase(dogBreed) || dog.getInServiceLocation().equalsIgnoreCase(InServiceCountry)) {
            				dog.setReserved(true);
            				dog.setInServiceCountry(InServiceCountry);
            				System.out.println("Dog is reserved.");
            				return;
            			}
            		
            				
            		}
            		System.out.println("The dog entered is not registered.");
            }  
            else {
            	System.out.println("Invalid choice, please choose again");
            }
        }

        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 

        public static void printAnimals(char option) {
        		if (option == '4') {  // Input of 4 will print list of dogs
        			
        			System.out.println("\n\n");
        	        System.out.println("\t\t\t\tList of Dogs");
        	        
        			for (Dog dog : dogList) {
        				System.out.println("Name: " + dog.getName());
        				System.out.println("Status: " + dog.getTrainingStatus());
        				System.out.println("Acquisition country: " + dog.getAcquisitionLocation());
        				System.out.println("Reserved: " + dog.getReserved());
        				
        				System.out.println();
        			}
        			
        			
        		}
        		else if (option == '5') { // Input of 5 will print list of cats
        
        			System.out.println("\n\n");
        	        System.out.println("\t\t\t\tList of Monkeys");
        	        
        			for (Monkey monkey : monkeyList) {
        				System.out.println("Name: " + monkey.getName());
        				System.out.println("Status: " + monkey.getTrainingStatus());
        				System.out.println("Acquisition country: " + monkey.getAcquisitionLocation());
        				System.out.println("Reserved: " + monkey.getReserved());
        				
        				System.out.println();
        			}
        		}
        		else if (option == '6') { // Input of 6 will print all animals that are in service but not reserved
        			System.out.println("\n\n");
        	        System.out.println("\t\t\t\tList of Non-Reserved");
        	        
        	        // Print all dogs that are "in service" and is not reserved
        	        for (Dog dog : dogList) {
        	        	if (dog.getTrainingStatus().equals("in service") && dog.getReserved() == false) {
        	        		System.out.println("Name: " + dog.getName());
            				System.out.println("Status: " + dog.getTrainingStatus());
            				System.out.println("Acquisition country: " + dog.getAcquisitionLocation());
            				System.out.println("Reserved: " + dog.getReserved());
            				
            				System.out.println();
        	        		
        	        	}
        	        	
        	        }
        	        
        	        // Print all monkeys that are "in service" and is not reserved
        	        for (Monkey monkey : monkeyList) {
        	        	if (monkey.getTrainingStatus().equals("in service") && monkey.getReserved() == false) {
        	        		System.out.println("Name: " + monkey.getName());
            				System.out.println("Status: " + monkey.getTrainingStatus());
            				System.out.println("Acquisition country: " + monkey.getAcquisitionLocation());
            				System.out.println("Reserved: " + monkey.getReserved());
            				
            				System.out.println();
        	        	}
        	        	
        	        }
        			
        			
        		}
        		
        		
        		
        		
        	}
        	
        }
        

