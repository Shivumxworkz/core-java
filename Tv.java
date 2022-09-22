class Tv{
	
	public static boolean onOrOff(){
		boolean isConnected=true;
			System.out.println("inside onOrOff()");
		if(isConnected ==false){
			  isConnected=true;
				System.out.println("Tv is turned on..");
			}else if(isConnected ==true){
			  isConnected=false;
				System.out.println("Tv is turned off..");
			}
			System.out.println("end of onOrOff");
			return isConnected;
	}

}