
public class Business extends Building{
	protected int numRentableUnits;
	
	public Business() {
		super();
		numRentableUnits = 0;
	}// close empty argument 
	
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup) {
		super( projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		numRentableUnits = 0;
		
	}// close preferred method
	
	@Override
	public void draw() {
		System.out.println("Drawing code for Business "); 
		
	}//close draw class
	
	@Override
	public String displayData() {
		StringBuilder data = new StringBuilder();
		data.append(super.displayData());
		data.append("\nNumber of Rentable Units: " + numRentableUnits);
		return data.toString();
	}//close displayData method

	//getters and setters
	/**
	 * @return the numRentableUnits
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	/**
	 * @param numRentableUnits the numRentableUnits to set
	 */
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}
	
	
}//close Business class
