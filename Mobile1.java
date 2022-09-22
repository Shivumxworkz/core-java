class Mobile1{
	static String brand;
	static String color;
	static double price;
	static boolean isConnected;
	static int minVolume;
	static int maxVolume=8;
	static int currentVolume;
		public static boolean onOrOff(){
			System.out.println("Inside of onOrOff()");
		if(isConnected==false){
		   isConnected=true;
			System.out.println("Mobile is on..");
		}else {
			System.out.println("mobile is off...");
		}
			System.out.println("Inside of onOrOff()");
			return isConnected;
	}	public static void increaseVolume(){
			System.out.println("Inside of increaseVolume()");
		
	if(isConnected==true){
	if(currentVolume<maxVolume){
	   currentVolume=currentVolume+1;
			System.out.println("The Current Volume is :"+currentVolume);
	 }else {
			System.out.println("The Max volume is Reached...");
	 }
	 }else {
			System.out.println("gube.. First Mobile on madu..");
	 }	
			System.out.println("Inside of increaseVolume()");
	 }	public static void decreaseVolume(){
			System.out.println("Inside of decreaseVolume()");
		
	if(isConnected==true){
	if(currentVolume>minVolume){
	   currentVolume=currentVolume-1;
			System.out.println("The Current Volume is :"+currentVolume);
	 }else {
			System.out.println("The Min volume is Reached...");
	 }
	 }else {
			System.out.println("gube.. First Mobile on madu..");
	 }	
			System.out.println("Inside of decreaseVolume()");
	 }
}