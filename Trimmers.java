class Trimmers{
	public static void main(String[] trimmers){
	String color = "Black";
	String brand = "Philips";
	int price	 = 849;
	int working	 = 30 ;
	int warranty = 2 ;
		String property[] = {color,brand};
		int[] totalSettings = {price,working,warranty};
		String ref0 =property[0];
		String ref1 =property[1];
		int ref2    =totalSettings[0];
		int ref3	=totalSettings[1];
		int ref4	=totalSettings[2];
				System.out.println("Element at Index "+" "+ref0);
				System.out.println("Element at Index "+" "+ref1);
				System.out.println("Element at Index "+" "+ref2);
				System.out.println("Element at Index "+" "+ref4+" years");
				System.out.println("Element at Index "+"Battery Run Time "+ref3+" minutes");
	}


}