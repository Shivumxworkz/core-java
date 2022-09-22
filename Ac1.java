class Ac1{
	static String brand;
	static String color;
	static double price;
	static boolean isConnected;
	static int minVolume;
	static int currentVolume;
	static int maxVolume=6;
		public static boolean onOrOff(){
				System.out.println("inside of onOrOff");
		if(isConnected==true){
		   isConnected=false;
				System.out.println("Ac is Turned off..");
		}else if(isConnected==false){
				 isConnected=true;
					System.out.println("Ac is Turned on..");
		}
			System.out.println("inside of onOrOff");
			return isConnected;
		} 
	public static void increaseVolume(){
			System.out.println("Inside of increaseVolume()");
		if(isConnected==true){
		if(currentVolume<maxVolume){
		   currentVolume=currentVolume+1;
		   System.out.println("The Current Volume is :"+currentVolume);
		}else{
			System.out.println("The Max Volume is Reached..");
		}
		}else{
			System.out.println("gube.. First Ac on madu");
		}	
			System.out.println("End of increaseVolume()");
	}public static void decreaseVolume(){
			System.out.println("Inside of decreaseVolume()");
		if(isConnected==true){
		if(currentVolume>minVolume){
		   currentVolume=currentVolume-1;
		   System.out.println("The Current Volume is :"+currentVolume);
		}else{
			System.out.println("The Min Volume is Reached..");
		}
		}else{
			System.out.println("gube.. First Ac on madu");
		}	
			System.out.println("End of decreaseVolume()");
	}
}