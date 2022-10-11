class ConventionhallTester{
	public static void main(String args[]){
		Conventionhall convention =new Conventionhall();
		convention.name="S.M.J";
		convention.color="blue";
		convention.price=40000;
		convention.toGetMarry();
			System.out.println(convention.name +" "+convention.color +" "+convention.price);
			
		Conventionhall convention1 =new Conventionhall();
		convention1.name="J.s.s Mangalamantapa";
		convention1.color="White";
		convention1.price=120000;
		convention1.toGetMarry();
			System.out.println(convention1.name +" "+convention1.color +" "+convention1.price);
			
		Conventionhall convention2 =new Conventionhall();
		convention2.name="Yathri Bhavana";
		convention2.color="orange";
		convention2.price=60000;
		convention2.toGetMarry();
			System.out.println(convention2.name +" "+convention2.color +" "+convention2.price);
			
		Conventionhall convention3 =new Conventionhall();
		convention3.name="Nakshthra convention hall";
		convention3.color="White";
		convention3.price=70000;
		convention3.toGetMarry();
			System.out.println(convention3.name +" "+convention3.color +" "+convention3.price);
			
		Conventionhall convention4 =new Conventionhall();
		convention4.name="Shravana convention hall";
		convention4.color="Green";
		convention4.price=35000;
		convention4.toGetMarry();
			System.out.println(convention4.name +" "+convention4.color +" "+convention4.price);
	}
}