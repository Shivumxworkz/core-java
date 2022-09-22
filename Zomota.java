class Zomota{
	public static String takeOrder(String item){
	String items[]={"pizza","Burger","Sandwitch","Mosaranna","French Fries","Pastries"};
	for(int i=0; i<items.length;i++){
		if(items[i]==item){
		System.out.println("Final orders are Ready "+items[i]);
		}	
	}return item;
	}
}