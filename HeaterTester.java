class HeaterTester{
	public static void main (String heater[]){
		Heater.brandName		="Crompton";
		Heater.color			="White";
		Heater.type	 			="Instant";
		Heater.suitableFor		="High Rise Building";
		Heater.timer 			=false;
		Heater.automaticShutOff =true;
		Heater.rustResistant 	=true;
		Heater.price		    =2799.60;
			System.out.println(Heater.brandName);
			System.out.println(Heater.color);
			System.out.println(Heater.type);
			System.out.println(Heater.suitableFor);
			System.out.println(Heater.timer);
			System.out.println(Heater.automaticShutOff);
			System.out.println(Heater.rustResistant);
			System.out.println(Heater.price);
	}

}