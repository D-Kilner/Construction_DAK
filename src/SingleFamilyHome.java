
public class SingleFamilyHome extends Residential{
private boolean garage;

	public SingleFamilyHome() {
		super();
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;
	}// Close empty SingleFamilyHome constructor class
	
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;
	}// Close preferred SingleFamilyHome constructor class
	
	@Override
	public void draw() {
		System.out.println("Drawing code for Single Family Home: ");
	}// Close draw class
	
	@Override
	public String displayData() {
		StringBuilder data = new StringBuilder();
		data.append(super.displayData());
		data.append("\nHas a garage: " + garage);
		return data.toString();
	}//close displayData class

	//Getters and Setters
	/**
	 * @return the garage
	 */
	public boolean isGarage() {
		return garage;
	}

	/**
	 * @param garage the garage to set
	 */
	public void setGarage(boolean garage) {
		this.garage = garage;
	}
	
}// close class
