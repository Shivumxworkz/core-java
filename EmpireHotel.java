class EmpireHotel{
		static String type ="5 Star Hotel";
		static String address ="Mahalakshmi Puram,702,Dr MC Modi Hospital Road, West of Chord Road 2nd Stage,Nagapura,Bengaluru,karnataka 560086";
		static String managerNames[] ={"Manthesh Sajjan","Kisan Naidu","Gunasheela Shetty","Neha Prakash","Shashidhar","Rashmitha Poojary","Jishita Singh","Dinesh Nagaraju","Akshita Chauhan","Vijai Kumar"};
		static int noOfManagers =10;
		static String foodMenu[] ={"Tawa Chicken","Chicken Tandoori Masala","Kadai Chicken Boneless","Kadai Mutton","Mutton Coconut Fry Boneless","Mutton Onion Roast","Kadai Fish","Mutton Raan","Grilled Chicken Biriyani","Coin Paratha","Black Pomfret","Pepper Dry","Rumali Roti","Lemon Chicken","Prawns Chilly"};
	
	public static void main(String args[]){
			System.out.println("Welcome to Empire Hotel" +"\n"+"------------------------" +"\n"+"Type :"+type +"\n"+"----------------------" +"\n"+"Address :"+address +"\n"+"____________________");
		for(int m=0; m<managerNames.length; m++){
			System.out.println(managerNames[m]);
		}	
			System.out.println("No of Managers "+noOfManagers +"\n"+"_______________" +"\n"+"Items Names" +"\n"+"--------------------");
		for(int f=0; f<foodMenu.length; f++){
			System.out.println(foodMenu[f]);
		}	
			System.out.println("*****************************************");
	}
}