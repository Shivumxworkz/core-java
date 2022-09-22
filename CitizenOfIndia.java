class CitizenOfIndia{
	public static void showTheResponsibility(){
	System.out.println("invocked showTheResponsibility()");
	int age=16;
	char gender='F';
	//And operator '&&'= both case is satisfy
	// or operator'||'= one case is satisfy
	if(age>=10&&age<16){
		System.out.println("Responsibility is go to school");
		return;
	}if(age>16){
		System.out.println("Responsibility is go to college");
	}if(age==16){
		System.out.println("Responsibility is take good marks in sslc");
	}if(age==21){
		System.out.println("girls are legally marry");
	}if(age<21){
		System.out.println("boys cannot legally marry");
	}if(gender=='M'){
		System.out.println("men will be men");
	}
	System.out.println("End of showTheResponsibility()");
	}
}