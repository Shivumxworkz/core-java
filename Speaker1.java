class Speaker1{
	static String brand;
	static String color;
	static double price;
	static boolean isConnected;
	static int minVolume;
	static int maxVolume =8;
	static int currentVolume;
	//functionality
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
	 public static void increaseVolume(){
	 System.out.println("inside increseVolume()");
	 // false ==true
	 
	 if(isConnected ==true){
	 if (currentVolume<maxVolume){
		currentVolume=currentVolume+1;
			System.out.println("The Current Volume is :"+currentVolume);
	 }else {
			System.out.println("The max Volume is Reached.....");
	  }
	 }else {
			System.out.println("gube.... first speaker on maadu....");
	  }
	 System.out.println("end of  increseVolume()");
	 }
 }