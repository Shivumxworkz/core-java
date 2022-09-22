class Garage{
	static void getVehicleNos(String[] vehicleNos){
		System.out.println("Inside of getVehicleNos()");
		System.out.println("Size of Vehicle Nos:"+vehicleNos.length);
		System.out.println("List of Vehicle Nos are");
	for(int i=0; i<vehicleNos.length; i++){
			System.out.println(vehicleNos[i]);
	}
		System.out.println("End of getVehicleNos()");
	}

}