class Swiggy{
	/*public static String takeOrder(String item){
	//String item ="Pastries";
	if(item=="pizza"){
		System.out.println("Thank you for ordering:"+item);
	}if(item=="Burger"){
		System.out.println("Thank yu for ordering:"+item);
	}if(item=="Mosaranna"){
		System.out.println("Thank you for ordering:"+item);
	}if(item=="South Indian meals"){
		System.out.println("Thank you for ordering:"+item);
	}if(item=="French Fries"){
		System.out.println("Thank you for ordering:"+item);
	}if(item=="Sandwitch"){
		System.out.println("Thank you for ordering:"+item);
	}if(item=="Pastries"){
		System.out.println("Thank you for ordering:"+item);
	}
		return item;
	}*/
	public static double takeOrder(String item){
	//String item ="Pastries";
	if(item=="pizza"){
		System.out.println("Thank you for ordering:"+item);
		return 90.00;
	}if(item=="Burger"){
		System.out.println("Thank yu for ordering:"+item);
		return 70.50;
	}if(item=="Mosaranna"){
		System.out.println("Thank you for ordering:"+item);
		return 25.25;
	}if(item=="South Indian meals"){
		System.out.println("Thank you for ordering:"+item);
		return 135.00;
	}if(item=="French Fries"){
		System.out.println("Thank you for ordering:"+item);
		return 45.50;
	}if(item=="Sandwitch"){
		System.out.println("Thank you for ordering:"+item);
		return 60.90;
	}if(item=="Pastries"){
		System.out.println("Thank you for ordering:"+item);
		return 80.00;
	}
	
	return 0.00;
	}


	public static double takeOrder(String item, int quantity){
	//String item ="Pastries";
	if(item=="pizza"){
		System.out.println("Thank you for ordering:"+item);
		return 90.00*quantity;
	}if(item=="Burger"){
		System.out.println("Thank yu for ordering:"+item);
		return 70.50*quantity;
	}if(item=="Mosaranna"){
		System.out.println("Thank you for ordering:"+item);
		return 25.25*quantity;
	}if(item=="South Indian meals"){
		System.out.println("Thank you for ordering:"+item);
		return 135.00*quantity;
	}if(item=="French Fries"){
		System.out.println("Thank you for ordering:"+item);
		return 45.50*quantity;
	}if(item=="Sandwitch"){
		System.out.println("Thank you for ordering:"+item);
		return 60.90*quantity;
	}if(item=="Pastries"){
		System.out.println("Thank you for ordering:"+item);
		return 80.00*quantity;
	}
	
	return 0.00;
	}
}