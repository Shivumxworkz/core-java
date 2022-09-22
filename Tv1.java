class Tv1{
	static String brand;
	static String color;
	static double price;
	static boolean isConnected;
	static int minVolume;
	static int maxVolume=10;
	static int currentVolume;
	
		public static boolean onOrOff(){
				System.out.println("inside onOrOff()");
			
		if(isConnected==false){
		  isConnected=true;
			System.out.println("Tv1 is turned on...");
		}else if (isConnected==true){
		  isConnected=false;
				System.out.println("Tv1 is turned off...");
		}
				System.out.println("inside onOrOff()");
			return isConnected;
		}
		public static void increaseVolume(){
				System.out.println("Inside of increaseVolume()");
			
		if(isConnected==true){
		if(currentVolume<maxVolume){
		   currentVolume =currentVolume +1;
				System.out.println("Current Volume is :"+currentVolume);
		}else {
				System.out.println("Max Volume is Reached...");
		}
		}else{
				System.out.println("Loo, First Tv on maadu");
		}
			System.out.println("End of increaseVolume()");
		}public static void decreaseVolume(){
				System.out.println("Inside of decreaseVolume()");
			
		if(isConnected==true){
		if(currentVolume>minVolume){
		   currentVolume =currentVolume -1;
				System.out.println("Current Volume is :"+currentVolume);
		}else {
				System.out.println("Min Volume is Reached...");
		}
		}else{
				System.out.println("Loo, First Tv on maadu");
		}
			System.out.println("End of decreaseVolume()");
		}
}