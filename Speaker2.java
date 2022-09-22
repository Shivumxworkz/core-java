class Speaker2{
	static String brand;
	static String color;
	static double price;
	static boolean isConnected;
	static int minVolume;
	static int maxVolume;
	static int currentVolume=8;
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
		}
	 public static void decreaseVolume(){
	 System.out.println("inside decreseVolume()");
	 // false ==true
	 
	 if(isConnected ==true){
	 if (currentVolume>minVolume){
		currentVolume=currentVolume-1;
			System.out.println("The Current Volume is :"+currentVolume);
	 }else {
			System.out.println("The min Volume is Reached.....");
	  }
	 }
	 else {
			System.out.println("gube.... first speaker on maadu....");
	  }
	 
	 System.out.println("end of  decreseVolume()");
	
	 }
 }