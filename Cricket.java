class Cricket{
	public static void main (String [] cricket){
		String rohitHighestScore ="264";
		String sachinHighestScore="200";
		String mandanaHighestScore="134";
		String ackerrHighestScore="234";
		String bjClarkHighestScore="229";
	
		String highestScore []={rohitHighestScore,sachinHighestScore,mandanaHighestScore,ackerrHighestScore, bjClarkHighestScore};
				//explicity
			String ref4 = highestScore[4];
			String ref0 = highestScore[0];
			String ref2 = highestScore[2];
	
			System.out.println("Element at Index "+ref4);
			System.out.println("Element at Index "+ref0);
			System.out.println("Element at Index "+ref2);
	}


}