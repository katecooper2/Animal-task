
public class Shark extends Animal{

	public Shark(String colour, boolean vaccinated, int lifeExpectancy) {
		super(colour, vaccinated, lifeExpectancy);
		// TODO Auto-generated constructor stub
	}

	

	//INHERITED METHODS
	public void makeNoise() {
		System.out.println("da na... da na... da na da na da na");
	}

	public void habitat() {
		System.out.println("sea");
	}
	
	
	//SHARK METHODS
	
	public void fins() {
		System.out.println("true");
	}
	
	public void bodyFeatures() {
		System.out.println("I have no legs");
	}
	

	//SHARK VARIABLES
	
	private String length;
	private boolean swim;
	
	//CONSTRUCTOR
	public Shark(String colour, boolean vaccinated, int lifeExpectancy, String length, boolean swim) {
		super(colour, vaccinated, lifeExpectancy);
		this.length = length;
		this.swim = swim;
	}



	//LENGTH GETTER SETTER
	public String getLength() {
		return length;
	}



	public void setLength(String length) {
		this.length = length;
	}



	//SWIM GETTER SETTER
	public boolean isSwim() {
		return swim;
	}



	public void setSwim(boolean swim) {
		this.swim = swim;
	}



	//OVERRIDE METHOD
	@Override
	public String toString() {
		return "Shark [length=" + length + ", swim=" + swim + "]";
	}
	
	
	
	
	
}
