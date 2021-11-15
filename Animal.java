
public class Animal implements Zoo {
	
	private String colour;
	private boolean vaccinated;
	private int lifeExpectancy;
	
	
	//CONSTRUCTOR
	public Animal(String colour, boolean vaccinated, int lifeExpectancy) {
		super();
		this.colour = colour;
		this.vaccinated = vaccinated;
		this.lifeExpectancy = lifeExpectancy;
	}
	
 
	//METHODS
	public void makeNoise() {
		
	}
	
	public void habitat() {
		
	}
	

	
	//COLOUR GETTER SETTER
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
    //VACCINATED GETTER SETTER
	public boolean getVaccinated() {
		return vaccinated;
	}

	public void setVaccinated(boolean vaccinated) {
		this.vaccinated = vaccinated;
	}

	//LIFEEXPECTANCY GETTER SETTER
	public int getLifeExpectancy() {
		return lifeExpectancy;
	}

	public void setLifeExpectancy(int lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}


	
	//OVERRIDE METHOD
	@Override
	public String toString() {
		return "Animal [colour=" + colour + ", vaccinated=" + vaccinated + ", lifeExpectancy=" + lifeExpectancy + "]";
	}
	
	
	
	
	

}
