class SunglassTester{
	public static void main(String args[]){
		Sunglass glass =new Sunglass();
		glass.name="Dewey";
		glass.color="Orange";
		glass.price=4000;
		glass.toGetProtect();
			System.out.println(glass.name +" "+glass.color +" "+glass.price);
			
		Sunglass glass1 =new Sunglass();
		glass1.name="Freddie";
		glass1.color="Black";
		glass1.price=3000;
		glass1.toGetProtect();
			System.out.println(glass1.name +" "+glass1.color +" "+glass1.price);
				
		Sunglass glass2 =new Sunglass();
		glass2.name="Selenite";
		glass2.color="Blue";
		glass2.price=3500;
		glass2.toGetProtect();
			System.out.println(glass2.name +" "+glass2.color +" "+glass2.price);
			
		Sunglass glass3 =new Sunglass();
		glass3.name="Grange";
		glass3.color="Brown";
		glass3.price=6000;
		glass3.toGetProtect();
			System.out.println(glass3.name +" "+glass3.color +" "+glass3.price);	
	}
}
