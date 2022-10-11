class RiceTester{
	public static void main(String args[]){
		Rice rice =new Rice();
		rice.name ="Basmati";
		rice.price =45;
		rice.toGetProteins();
			System.out.println(rice.name +" "+rice.price);
			
		Rice rice1 =new Rice();
		rice1.name ="Jasmine";
		rice1.price =35;
		rice1.toGetProteins();
			System.out.println(rice1.name +" "+rice1.price);
			
		Rice rice2 =new Rice();
		rice2.name ="White";
		rice2.price =40;
		rice2.toGetProteins();
			System.out.println(rice2.name +" "+rice2.price);
	
		Rice rice3 =new Rice();
		rice3.name ="Red";
		rice3.price =25;
		rice3.toGetProteins();
			System.out.println(rice3.name +" "+rice3.price);
	}
}