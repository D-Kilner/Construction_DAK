
public class Building {

	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subGroup;
	
	public Building() {
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0.0;
		occupancyGroup = "";
		subGroup = "";
		
	}//close empty argument Building class
	
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subGroup = subGroup;
		
	}//close preferred building constructor
	
	public void draw() {
		System.out.println("Drawing code for Building: "); 
	
	}// close draw class
	
	public String displayData() {
		StringBuilder data = new StringBuilder();
		data.append("\nProject Name: " + projectName);
		data.append("\nComplete Address: " + completeAddress);
		data.append("\nTotal Square Feet: " + totalSquareFeet);
		data.append("\nOccupancy Group: " + occupancyGroup);
		data.append("\nSubgroup: " + subGroup);
		return data.toString();
	}// close displayData

	//getters and setters
	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	/**
	 * @return the completeAddress
	 */
	public String getCompleteAddress() {
		return completeAddress;
	}

	/**
	 * @param completeAddress the completeAddress to set
	 */
	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}

	/**
	 * @return the totalSquareFeet
	 */
	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}

	/**
	 * @param totalSquareFeet the totalSquareFeet to set
	 */
	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}

	/**
	 * @return the occupancyGroup
	 */
	public String getOccupancyGroup() {
		return occupancyGroup;
	}

	/**
	 * @param occupancyGroup the occupancyGroup to set
	 */
	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}

	/**
	 * @return the subGroup
	 */
	public String getSubGroup() {
		return subGroup;
	}

	/**
	 * @param subGroup the subGroup to set
	 */
	public void setSubGroup(String subGroup) {
		this.subGroup = subGroup;
	}
	
	
}//close class
