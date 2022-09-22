class SwiggyTester{
	public static void main(String swiggy[]){
		/*String ref=Swiggy.takeOrder("pizza");
		System.out.println("Finally, you are order is Ready..."+ref);*/
		System.out.println(Swiggy.takeOrder("pizza"));
		System.out.println(Swiggy.takeOrder("Pastries",7));
		System.out.println("Finally, you are order is Ready...");
	}
}