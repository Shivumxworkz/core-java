class ShowRoom{
	public static void getCars (String cars[]){
		System.out.println("Inside of get Cars");
		System.out.println("Size of Cars:"+cars.length);
		System.out.println("List of Cars are");
	for(int i=0; i<cars.length; i++){
		System.out.println(cars[i]);
	}System.out.println("End of get Cars");
		}
		static void getBikes(String bikes[]){
			System.out.println("**********************");
			System.out.println("Inside of Get Bikes");
			System.out.println("Size of Bikes:"+bikes.length);
			System.out.println("List of Bikes are");
		for(int i=0; i<bikes.length; i++){
			System.out.println(bikes[i]);
		}
				System.out.println("End of Get Bikes");
		}
}