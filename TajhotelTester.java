class TajhotelTester{
	public static void main(String args[]){
	 Tajhotel taj =new Tajhotel();
	 taj.location ="Opposite Kempegowda International Airport, Devanahalli, Bengalore, 560300, India";
	 taj.uniqueDining="Masla Klub";
	 taj.items="Maguro";
		taj.toGetMeals();
				System.out.println(taj.location +" "+taj.uniqueDining +" "+taj.items);
	
	 Tajhotel taj1 =new Tajhotel();
	 taj1.location ="Racecourse Road,Bengalore, 560300, India";
	 taj1.uniqueDining="Masla Klub, Blue Ginger";
	 taj1.items="Maguro,Unagi";
		taj1.toGetMeals();
				System.out.println(taj1.location +" "+taj1.uniqueDining +" "+taj1.items);
	
	 Tajhotel taj2 =new Tajhotel();
	 taj2.location ="MG Road, Bengalore, 560300, India";
	 taj2.uniqueDining="Masla Klub, Blue Ginger, Lounge Bar";
	 taj2.items="Maguro,Unagi,Shitake";
		taj2.toGetMeals();
				System.out.println(taj2.location +" "+taj2.uniqueDining +" "+taj2.items);
	
	 Tajhotel taj3 =new Tajhotel();
	 taj3.location ="Yeshwantpur, Bengalore, 560300, India";
	 taj3.uniqueDining="Masla Klub, Blue Ginger, Lounge Bar, Tamarind";
	 taj3.items="Maguro,Unagi,Shitake,Aspara";
		taj3.toGetMeals();
				System.out.println(taj3.location +" "+taj3.uniqueDining +" "+taj3.items);
	
	 Tajhotel taj4 =new Tajhotel();
	 taj4.location ="West End, Bengalore, 560300, India";
	 taj4.uniqueDining="Masla Klub, Blue Ginger, Lounge Bar, Tamarind, soi and sake";
	 taj4.items="Maguro,Unagi,Shitake,Aspara, Ikura Zucchini,Crispy California";
		taj4.toGetMeals();
				System.out.println(taj4.location +" "+taj4.uniqueDining +" "+taj4.items);
	
	}
}