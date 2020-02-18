
public class Apartment extends Residential{
private int numRentableUnits;
private double avgUnitSize;
private boolean parkingAvailable;

	public Apartment() {
		numRentableUnits = 0;
		avgUnitSize = 0;
		parkingAvailable = false;
	}// Close empty Apartment class

	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		numRentableUnits = 0;
		avgUnitSize = 0;
		parkingAvailable = false;
	} // Close preferred Apartment class

	@Override
	public void draw() {
		System.out.println("Drawing code for Apartment: "); 
	
	}// Close draw class

	@Override
	public String displayData() {
		StringBuilder data = new StringBuilder();
		data.append(super.displayData());
		data.append("\nNumber of Rentable Units: " + numRentableUnits);
		data.append("\nAverage Size of a Unit: " + avgUnitSize);
		data.append("\nParking Space Available: " + parkingAvailable);
		return data.toString();
	} // Close displayData class

	
	// getters and setters
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

	/**
	 * @return the avgUnitSize
	 */
	public double getAvgUnitSize() {
		return avgUnitSize;
	}

	/**
	 * @param avgUnitSize the avgUnitSize to set
	 */
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}

	/**
	 * @return the parkingAvailable
	 */
	public boolean isParkingAvailable() {
		return parkingAvailable;
	}

	/**
	 * @param parkingAvailable the parkingAvailable to set
	 */
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}

}// close class
