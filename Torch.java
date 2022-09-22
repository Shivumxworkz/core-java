class Torch{
	static boolean isConnected;
	static int minBrightness;
	static int maxBrightness=3;
	static int currentBrightness;
		public static boolean onOrOff(){
			System.out.println("inside onOrOff");
		if (isConnected==false){
			isConnected=true;
			System.out.println("tourch is on.");
		}else if (isConnected==true){
			isConnected=false;
			System.out.println("tourch is off.");
		}
		System.out.println("end of onOrOff");
		return isConnected;
		}	public static void pressingButton(){
				System.out.println("Inside of pressingButton()");
			if(isConnected==true){
			if(currentBrightness<maxBrightness){
			  currentBrightness=currentBrightness+1;
				System.out.println("Current Brightness is :"+currentBrightness);
			}else {
				System.out.println("max Brightness is Reached..");
			}
			}else {
				System.out.println("gube.. First tourch on maadu...");
			}	
				System.out.println("End of pressingButton()");
		} 
}