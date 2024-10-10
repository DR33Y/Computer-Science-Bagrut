Animal Class
  -------------------------------------
  package example;

public class Animal {
	private String name;
	private double weight;
	private boolean isFriendly;
	private boolean isMammle;
	private String type;
	
	public Animal(String name, double weight, boolean isFriendly, boolean isMammle, String type) {
		this.name = name;
		if(weight > 0)
			this.weight = weight;
		this.isFriendly = isFriendly;
		this.isMammle = isMammle;
		this.type = type;
	}
	public Animal(Animal other) {
		this.name = other.name;
		this.weight = other.weight;
		this.isFriendly = other.isFriendly;
		this.isMammle = other.isMammle;
		this.type = other.type;	
	}
	
	public String getAnimalName(Animal other) {
		return other.name;
	}
	public boolean IsHaveSameWeight(Animal animal1, Animal animal2) {
		if(animal1.weight == animal2.weight)
			return true;
		else
			return false;
	}
	public boolean CheckSpecificAnimal(Animal other) {
		if(other.name.equals("Mitzi") && other.weight < 4 && other.isFriendly) 
			return true;
		else
			return false;
	}
	
	// get and set functions
	public String getName() {
		return this.name;
	}
	public double getWeight() {
		return this.weight;
	}
	public boolean getIsFriendly() {
		return this.isFriendly;
	}
	public boolean getIsMammle() {
		return this.isMammle;
	}
	public String getType() {
		return this.type;
	}
	
	public void setName(String name) {
		this.name = name;;
	}
	public void setWeight(double weight) {
		if(weight > 0)
			this.weight = weight;
	}
	public void setIsFriendly(boolean isFriendly) {
		this.isFriendly = isFriendly;
	}
	public void setIsMammle(boolean isMammle) {
		this.isMammle = isMammle;
	}
	public void aetType(String type) {
		this.type = type;
	}
}


Zoo Class
  -------------------------------------
  package example;

public class Zoo {
	private String name;
	private Animal[] animals;
	
	public Zoo(String name) {
		this.name = name;
		this.animals = new Animal[632];
	}
	
	public int getAnimalsAmount() {
		int i,sum=0;
		
		for(i=0; i< this.animals.length; i++) {
			if(animals[i] != null)
				sum++;
		}
		return sum;
	}
	public int getEmptyCages() {
		int i,sum=0;
		
		for(i=0; i<this.animals.length; i++) {
			if(animals[i] == null)
				sum++;
		}
		return sum;
	}
	public int mammlesOverOneTone() {
		int i,sum=0;
		
		for(i=0; i<this.animals.length; i++) {
			if(animals[i].getIsMammle()) {
				if(animals[i].getWeight() > 1000)
					sum++;
			}
			
		}
		return sum;
	}
	public void printAllMammlesNames() {
		int i;
		
		for(i=0; i<this.animals.length; i++) {
			if(animals[i].getIsMammle())
				System.out.println(animals[i].getName());
		}
	}
	public boolean isHaveUnfriendlyShark() {
		int i;
		
		for(i=0; i<this.animals.length; i++) {
			if(animals[i].getName().equals("Shark"))
				if(!animals[i].getIsFriendly())
					return true;
		}
		return false;
	}
	public void printAllAnimalsLessFiveToneAndFrinedlya() {
		int i;
		
		for(i=0; i<this.animals.length; i++) {
			if(animals[i].getWeight() < 5000 && animals[i].getIsFriendly())
				System.out.println(animals[i].getName());
		}
	}
}

