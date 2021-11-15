
public class Tiger extends Animal{

	
	//INHERITED METHODS
	public void makeNoise() {
		System.out.println("grrrrr");
	}
	
	public void habitat() {
		System.out.println("jungle");
	}
	
	
	//TIGER METHOD
	
	public void speed() {
		System.out.println("98mph");
	}
	
	public void food() {
		System.out.println("I eat meat");
		
	}
	
	//TIGER VARIABLES
	
	private boolean stripes;
	private String prey;
	
	//TIGER CONSTRUCTOR
	public Tiger(String colour, boolean vaccinated, int lifeExpectancy, boolean stripes, String prey) {
		super(colour, vaccinated, lifeExpectancy);
		this.stripes = stripes;
		this.prey = prey;
	}
	
	//STRIPES GETTER SETTER

	public boolean isStripes() {
		return stripes;
	}

	public void setStripes(boolean stripes) {
		this.stripes = stripes;
	}

	
	//PREY GETTER SETTER
	public String getPrey() {
		return prey;
	}

	public void setPrey(String prey) {
		this.prey = prey;
	}

	
	//OVERRIDE METHOD
	@Override
	public String toString() {
		return "Tiger [stripes=" + stripes + ", prey=" + prey + "]";
	}
	
	
	
	
	
	
}
