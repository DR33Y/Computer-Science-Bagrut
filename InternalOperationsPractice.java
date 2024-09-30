public class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void makeSound() {
		System.out.println("Animal Sound");
	}
}
-----------------------------------------------
public class Tester {         
  public static void main(String[] args) {
    Animal a1 = new Animal("Dog");
  	a1.makeSound();
  }
}
