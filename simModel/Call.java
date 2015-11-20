public class Call {
	//Set to BASIC when the contract type is basic and PREMIUM if contract is premium
	String contractType;
	
	//Set to the time the service call is received by the dispatch system
	int timeRequested;
	
	//Set to the time the service employee arrives at the customer’s location
	int arrivalTime;
	
	//Set to either TYPE1000, TYPE2000, TYPE3000, TYPE4000 based on the equipment 
	//type that a service request has been made
	String equipmentType;

}
