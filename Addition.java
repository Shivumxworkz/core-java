class Addition{
/*public static void main(String as[]){
	add (78,65);
	add (343,34);// calling a method 
	add(32,423);
	add(2344,8);
	}*/	// add is a method
	//add method declaration
	public static void add(int a, int b){
		System.out.println(a+b);
	}
	// method overloading
	public static void add(int a, int b, int c){
		System.out.println(a+b+c);
	}
}