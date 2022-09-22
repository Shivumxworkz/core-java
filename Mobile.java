class Mobile{
	static String brandName;
	static boolean isConnected;
		public static boolean onOrOff(){
				System.out.println("inside onOrOff()");
		if(isConnected==false){
		   isConnected=true;
				System.out.println("mobile is on...");
		} else if(isConnected==true){
				isConnected=false;
				System.out.println("mobile is off...");
		}System.out.println("end of onOrOff()");
		return isConnected;
		}

}