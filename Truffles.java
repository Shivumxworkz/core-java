class Truffles{
	public static void main(String args[]){
		String type ="Restaurant";
		String address ="#93-A, 4th B Cross-Appek Building, 5th Block, Koramangala Industrial Area, Bangalore-560095";
		String managerNames[] ={"Vaibhav Mohan","Gaurav Arora","Raj","Chethan","Mahendra","Ganesh","Varun","Larisa Pereira","Sana Sheikh","Prasun Paul","Isaac Moses"};
		int noOfManagers =11;
		String foodMenu[] ={"Very Veggie","Tandoori Panner Steak","Veg Paprika","Crunchy Chicken Salad","Omlette","Fries","Roast Chicken","Classic Chicken Steak","Chicken Marengo","Creamy Cheese Sauce","Italian Pasta","Irish COld Coffee","Very Vanilla","Ice Tea","Frozen Mango","Choco Mocha"};
	
			System.out.println("Welcome to Truffles Restaurant" +"\n"+"--------------" +"\n"+"Type :"+type +"\n"+"----------" +"\n"+"Address :"+address +"\n"+"-----------");
		for(int m=0; m<managerNames.length; m++){
			System.out.println(managerNames[m]);
		}	System.out.println("No of Manager Names :"+managerNames +"\n"+"-----------");
		for(int f=0; f<foodMenu.length; f++){
			System.out.println(foodMenu[f]);
		}	System.out.println("************************");
	}
}