
public class Parrot extends Animal{

	
	//INHERITED METHODS
	public void makeNoise() {
		System.out.println("pretty polly");
	}

	public void habitat() {
		System.out.println("trees");
	}
	
	
	//PARROT METHODS
	
	public void feathers() {
		System.out.println("true");
	}
	
	public void beak() {
		System.out.println("I have a beak");
	}
	

	
	//PARROT VARIABLE
	private boolean talks;
	private String food;
	
	
	//CONSTRUCTOR
	public Parrot(String colour, boolean vaccinated, int lifeExpectancy, boolean talks, String food) {
		super(colour, vaccinated, lifeExpectancy);
		this.talks = talks;
		this.food = food;
	}

	
	//TALKS GETTER SETTER
	public boolean isTalks() {
		return talks;
	}

	public void setTalks(boolean talks) {
		this.talks = talks;
	}

	
	//FOOD GETTER SETTER
	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	
	//OVERRIDE METHOD
	@Override
	public String toString() {
		return "Parrot [talks=" + talks + ", food=" + food + "]";
	}
	
	
	
	
	
	
}
