import java.util.*;
class HomeWork{
	public static void main(String[] hw){
		Scanner scanner=new Scanner(System.in);
		int number =scanner.nextInt();
		boolean num=false;
		/*if(number %2==0){
			System.out.println("The Number is Even:"+number);
		}else{
			System.out.println("The Number is Odd:"+number);
		}*/
		
		
		/*	for(int i=2; i<number/2; i++){
				if(number%i==0){
					num=true;
					break;
				}
			}
		if(num){
			
			System.out.println("The Number is Prime:"+number);
		}
		else{
			System.out.println("The Number is Not Prime:"+number);
		
		}	*/
		
		
		for (int i=number-1;i>0; i--){
			System.out.println(i);
		}
	}
}