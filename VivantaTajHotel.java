class VivantaTajHotel
{
	public static void main(String a[]){
	 String type = "5 Star Hotel";
	 String address = "Commercial Street Tasker Town Shivajinagar";
	 String[] managerNames ={"Akshata","Lakshmi","Sangeetha","Ganesha","Shivu"};
	 int noOfManagers  =5;
	 String[] foodMenu ={"Crispy Chicken","Classic Chicken","Makhani Chicken","Chicken Whopper","Mutton Whopper","Crunchy Volcano","Spicy Grill Chicken","Big Smocky","King Egg","Veg Whopper","Chicken Whopper Jr","Crispy wrapper","Double Patty Crispy Chicken","Masala Chicken","Arabic Whopper"};

		System.out.println("Welcome to Vivanta Taj Hotel" +"\n"+"_________________________________" +"\n"+"Type :"+type +"\n"+"Address :"+address +"\n"+"------------------------------");
		for (int m=0; m<managerNames.length; m++){
			System.out.println(managerNames[m]);
		}
			System.out.println("Number of Managers is "+noOfManagers +"\n"+"----------------------");
		for	 (int f=0; f<foodMenu.length; f++){
			System.out.println(foodMenu[f]);
		}
			System.out.println("**************************");
	}
}