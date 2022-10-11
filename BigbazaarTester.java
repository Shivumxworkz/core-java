class BigbazaarTester{
	public static void main(String args[]){
		Bigbazaar big =new Bigbazaar();
		big.name ="Bombay Big Bazaar";
		big.location ="Tharasu Road, Maruthi Extension, Rajajinagar, bengaluru, karnataka 560021";
		big.ratings=4.0*;
		big.toGetOffers();
			System.out.println(big.name +" "+big.location +" "+big.ratings);
			
		Bigbazaar bigbazaar =new Bigbazaar();
		bigbazaar.name ="Food Big Bazaar";
		bigbazaar.location ="In Central soul space spirit, Belandur Village,Sirajpura Ring Road,Marathahalli,Bengaluru east, Sarjapura, bengaluru, karnataka 560021";
		bigbazaar.ratings=4.1*;
		bigbazaar.toGetOffers();
			System.out.println(bigbazaar.name +" "+bigbazaar.location +" "+bigbazaar.ratings);
			
		Bigbazaar bigbazaar1 =new Bigbazaar();
		bigbazaar1.name ="Reliance Big Bazaar";
		bigbazaar1.location ="Salapuria Gateway, J.p.Nagar, bengaluru, karnataka 560021";
		bigbazaar1.ratings=3.9*;
		bigbazaar1.toGetOffers();
			System.out.println(bigbazaar1.name +" "+bigbazaar1.location +" "+bigbazaar1.ratings);
			
		Bigbazaar bigbazaar2 =new Bigbazaar();
		bigbazaar2.name ="Happy Big Bazaar";
		bigbazaar2.location ="Parappana Agrahara, bengaluru, karnataka 560021";
		bigbazaar2.ratings=4.3*;
		bigbazaar2.toGetOffers();
			System.out.println(bigbazaar2.name +" "+bigbazaar2.location +" "+bigbazaar2.ratings);
	}
}