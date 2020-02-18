/**
 * Test for building
 * @author Dalton Kilner
 * @version 1.0
 */
/*
 * Created by Dalton Kilner on January 30, 2020.
 * This is the application class used for testing the other classes within the Construction project
 */
public class Application {

	public static void main(String[] args) {
		//testing empty building class
		Building emptyBuilding = new Building();
		System.out.println("----------------------------------");
		emptyBuilding.draw();
		System.out.println(emptyBuilding.displayData());
		
		//testing complete building class
		Building completeBuilding = new Building("Project School", "2001 Newburg rd | Louisville, Kentucky 40205", 100000.64, "Assembly", "A-1");
		System.out.println();
		System.out.println("----------------------------------");
		completeBuilding.draw();
		System.out.println(completeBuilding.displayData());
		
		//testing empty Business class
		Business emptyBusiness = new Business();
		System.out.println();
		System.out.println("----------------------------------");
		emptyBusiness.draw();
		System.out.println(emptyBusiness.displayData());
		
		//testing complete Business class
		Business completeBusiness = new Business("Project Office", "264 Candy Ave", 2500.75, "Business", "B");
		completeBusiness.setNumRentableUnits(10);
		System.out.println();
		System.out.println("----------------------------------");
		completeBusiness.draw();
		System.out.println(completeBusiness.displayData());
	
		//testing empty Residential class
		Residential emptyResidential = new Residential();
		System.out.println();
		System.out.println("----------------------------------");
		emptyResidential.draw();
		System.out.println(emptyResidential.displayData());
		
		//testing complete Residential class
		Residential completeResidential = new Residential("Jones House", "139 Golden Street | Denver, Colorado 80123", 15000.50, "Residential", "R-4");
		completeResidential.setNumBedrooms(3);
		completeResidential.setNumBathrooms(2);
		completeResidential.setLaundryRoom(true);
		System.out.println();
		System.out.println("----------------------------------");
		completeResidential.draw();
		System.out.println(completeResidential.displayData());
		
		//testing empty Mall class
		Mall emptyMall = new Mall();
		System.out.println();
		System.out.println("----------------------------------");
		emptyMall.draw();
		System.out.println(emptyMall.displayData());
				
		//testing complete Mall class
		Mall completeMall = new Mall("All Star Mall", "1500 Century Lane | Dallas, Texas 75201", 25000.85, "Business", "B");
		completeMall.setNumRentableUnits(500);
		completeMall.setNumParkingSpaces(5000);
		completeMall.setMedianUnitSize(250.55);
		System.out.println();
		System.out.println("----------------------------------");
		completeMall.draw();
		System.out.println(completeMall.displayData());
	
		//testing empty Apartment class
		Apartment emptyApartment = new Apartment();
		System.out.println();
		System.out.println("----------------------------------");
		emptyApartment.draw();
		System.out.println(emptyApartment.displayData());
		
		//testing complete Apartment class
		Apartment completeApartment = new Apartment("Bridgeway Apartments", "2385 green way | St.Louis, Missouri 63101", 5000, "Residential", "R-2");
		completeApartment.setNumBedrooms(2);
		completeApartment.setNumBathrooms(2);
		completeApartment.setLaundryRoom(false);
		completeApartment.setNumRentableUnits(20);
		completeApartment.setAvgUnitSize( 250);
		completeApartment.setParkingAvailable( true);
		System.out.println();
		System.out.println("----------------------------------");
		completeApartment.draw();
		System.out.println(completeApartment.displayData());
		
		//testing empty Single Family Home class
		SingleFamilyHome emptySingleFamilyHome = new SingleFamilyHome ();
		System.out.println();
		System.out.println("----------------------------------");
		emptySingleFamilyHome.draw();
		System.out.println(emptySingleFamilyHome.displayData());
		
		//testing complete Single Family Home class
		SingleFamilyHome completeSingleFamilyHome = new SingleFamilyHome (" Miller House", " 143 rough trail | Boston, Massachucetes 02112",  5386.43, " Residential", " R-1");
		completeSingleFamilyHome.setNumBedrooms(4);
		completeSingleFamilyHome.setNumBathrooms(3);
		completeSingleFamilyHome.setLaundryRoom(true);
		completeSingleFamilyHome.setGarage(true);
		System.out.println();
		System.out.println("----------------------------------");
		completeSingleFamilyHome.draw();
		System.out.println(completeSingleFamilyHome.displayData());
	}//close main method

}//close class
