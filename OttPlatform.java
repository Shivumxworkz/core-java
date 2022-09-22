class OttPlatform{
		static long[] priceOfKannadaMovies ={1000,150,150,20000000l};
		static long[] priceOfHindiMovies ={1500,100,150,250l};
		static int priceOfTeluguMovies[] ={2500,500,200,100};
		static 	String kannadaMovies[] ={"KGF Franchise","Om","Sampathige Sawaal","Googly"};
		static  String hindiMovies[] ={"3 idiots","DDLJ","PK","Bajarangi Bhaijaan"};
		static  String teluguMovies[] ={"Bahubali","Pushpa","Dj","Sahoo"};

		
		public static void main(String a[]){
			System.out.println("List of kannada Movies");
			System.out.println(kannadaMovies[0] + "\n"+kannadaMovies[1] +"\n"+kannadaMovies[2] +"\n"+kannadaMovies[3]);
			System.out.println("***********************");	
			System.out.println(priceOfKannadaMovies[0] +" "+priceOfKannadaMovies[1] +" "+priceOfKannadaMovies[2] +" "+priceOfKannadaMovies[3]);
			
			
	System.out.println("--------------------");	
		System.out.println("List of hindi Movies");
		System.out.println(hindiMovies[0] + "\n"+hindiMovies[1] +"\n"+hindiMovies[2] +"\n"+hindiMovies[3]);
		System.out.println("************************");
		System.out.println(priceOfHindiMovies[0] +" "+priceOfHindiMovies[1] +" "+priceOfHindiMovies[2] +" "+priceOfHindiMovies[3]);
		
	System.out.println("---------------------");	
		System.out.println("List of Telugu Movies");
		System.out.println(teluguMovies[0] + "\n"+teluguMovies[1] +"\n"+teluguMovies[2] +"\n"+teluguMovies[3]);
		System.out.println("***************************");
		System.out.println(priceOfTeluguMovies[0] +" "+priceOfTeluguMovies[1] +" "+priceOfTeluguMovies[2] +" "+priceOfTeluguMovies[3]);
		}

}