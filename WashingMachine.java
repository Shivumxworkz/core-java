class WashingMachine{
	static boolean isConnected;
	static int minSpeed;
	static int maxSpeed=5;
	static int currentSpeed;
	public static boolean onOrOff(){
		System.out.println("inside onOrOff()");
	if (isConnected ==true){
		isConnected =false;
			System.out.println("washing machine is off...");
	}else if (isConnected==false){
			  isConnected=true;
				System.out.println("Washing Machine is on...");
	}	System.out.println("end of onOrOff");
		return isConnected;
	} public static void increaseSpeed(){
			System.out.println("Inside of increaseSpeed()");
		if(isConnected==true){
		if(currentSpeed<maxSpeed){
		  currentSpeed=currentSpeed+1;
			System.out.println("Current Speed is :"+currentSpeed);
		}else{
			System.out.println("max Speed is Reached..");
		}
		}else {
			System.out.println("loo.. First Switch on madu");
		}
			
				System.out.println("End of increaseSpeed()");
		} public static void decreaseSpeed(){
			System.out.println("Inside of decreaseSpeed()");
		if(isConnected==true){
		if(currentSpeed>minSpeed){
		  currentSpeed=currentSpeed-1;
			System.out.println("Current Speed is :"+currentSpeed);
		}else{
			System.out.println("min Speed is Reached..");
		}
		}else {
			System.out.println("loo.. First Switch on madu");
		}
			
				System.out.println("End of decreaseSpeed()");
		}
}