public abstract class Animal{
	
	String name;
	int legs;

	public int getLegs(){
		return legs;
	}

	public String toString(){
		String nameLegs = name + " legs: " + legs;
		return nameLegs;
	}
}
