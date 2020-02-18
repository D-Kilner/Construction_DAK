
public class Residential extends Building {
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	public Residential() {
		super();
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;
	}// close empty residential constructor
	
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;
	}// close preferred Residential constructor 
	@Override
	public void draw() {
		System.out.println("Drawing code for Residential: "); 
		
	}//close draw class
	
	@Override
	public String displayData() {
		StringBuilder data = new StringBuilder();
		data.append(super.displayData());
		data.append("\nNumber of Bedrooms: " + numBedrooms);
		data.append("\nNumber of Bathrooms: " + numBathrooms);
		data.append("\nHas a Laundry Room: " + laundryRoom);
		return data.toString();
	}//close displayData class

	/**
	 * @return the numBedrooms
	 */
	public int getNumBedrooms() {
		return numBedrooms;
	}

	/**
	 * @param numBedrooms the numBedrooms to set
	 */
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	/**
	 * @return the numBathrooms
	 */
	public int getNumBathrooms() {
		return numBathrooms;
	}

	/**
	 * @param numBathrooms the numBathrooms to set
	 */
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	/**
	 * @return the laundryRoom
	 */
	public boolean isLaundryRoom() {
		return laundryRoom;
	}

	/**
	 * @param laundryRoom the laundryRoom to set
	 */
	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}
	
}//close class
