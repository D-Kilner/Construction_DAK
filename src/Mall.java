
	public class Mall extends Business{
	private double medianUnitSize;
	private int numParkingSpaces;

	public Mall() {
		super();
		medianUnitSize = 0;
		numParkingSpaces = 0;
	
}// close empty argument

	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup) {
		super( projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		medianUnitSize = 0;
		numParkingSpaces = 0;
}// close preferred class
	@Override
	public void draw() {
		System.out.println("Drawing code for Mall: "); 
}// close drawing class
	
	@Override
		public String displayData() {
			StringBuilder data = new StringBuilder();
			data.append(super.displayData());
			data.append("\nMedian unit size: " + medianUnitSize);
			data.append("\nNumber of Parking Spaces: " + numParkingSpaces);
			return data.toString();
		}//close displayData class
	
//Getters and Setters

	/**
	 * @return the medianUnitSize
	 */
	public double getMedianUnitSize() {
		return medianUnitSize;
	}

	/**
	 * @param medianUnitSize the medianUnitSize to set
	 */
	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}

	/**
	 * @return the numParkingSpaces
	 */
	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}

	/**
	 * @param numParkingSpaces the numParkingSpaces to set
	 */
	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}
	
	}//close Mall class
	
