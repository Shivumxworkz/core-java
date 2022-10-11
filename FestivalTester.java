class FestivalTester{
	public static void main(String indian[]){
	 Festival festival =new Festival();
	 festival.name="Mudukuthore Jaathre";
	 festival.celebratingMonth ="February";
	 festival.noOfDaysCelebrate =7;
	 festival.toGetEnjoy();
		System.out.println(festival.name +" "+festival.celebratingMonth +" "+festival.noOfDaysCelebrate);
	
	Festival festival1 =new Festival();
	 festival1.name="MahaShivaratri";
	 festival1.celebratingMonth ="February";
	 festival1.noOfDaysCelebrate =1;
	 festival1.toGetEnjoy();
		System.out.println(festival1.name +" "+festival1.celebratingMonth +" "+festival1.noOfDaysCelebrate);
	
	Festival festival2 =new Festival();
	 festival2.name="Deepavali";
	 festival2.celebratingMonth ="November";
	 festival2.noOfDaysCelebrate =3;
	 festival2.toGetEnjoy();
		System.out.println(festival2.name +" "+festival2.celebratingMonth +" "+festival2.noOfDaysCelebrate);
	
	Festival festival3 =new Festival();
	 festival3.name="Dassara";
	 festival3.celebratingMonth ="October";
	 festival3.noOfDaysCelebrate =9;
	 festival3.toGetEnjoy();
		System.out.println(festival3.name +" "+festival3.celebratingMonth +" "+festival3.noOfDaysCelebrate);
	
	Festival festival4 =new Festival();
	 festival4.name="Sankranthi";
	 festival4.celebratingMonth ="January";
	 festival4.noOfDaysCelebrate =1;
	 festival4.toGetEnjoy();
		System.out.println(festival4.name +" "+festival4.celebratingMonth +" "+festival4.noOfDaysCelebrate);
	}
}