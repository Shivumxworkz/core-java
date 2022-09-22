class Speaker{
	static String brand;
	static String color;
	static double price;
	static boolean isConnected;
	
	public static boolean onOrOff(){
		System.out.println("inside onOrOff()");
	if (isConnected == false){
		isConnected = true;
System.out.println("Speaker is turned on...");
	}
	else if (isConnected == true){
		isConnected =false;
		System.out.println("Speaker is turned off...");
		}
		System.out.println("end of onOrOff");
	 return isConnected ;
	/*/public static boolean onOrOff(boolean isConnected){
		 System.out.println("inside onOrOff()");
	if (isConnected ==false){
		System.out.println("indicator light is on");
		isConnected=true;
		
	}	 
	if (isConnected ==true){
		System.out.println("indicator light is off");
		isConnected=false;
		
	}System.out.println("end of onOrOff()");
	return isConnected;*/
	}
	
}