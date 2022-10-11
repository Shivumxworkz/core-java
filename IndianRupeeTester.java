class IndianRupeeTester{
	public static void main(String args[]){
		IndianRupee ind =new IndianRupee();
		ind.color ="Green";
		ind.serialNo="4112A534";
		ind.governer="Subburav";
		ind.price=20;
		ind.toGetValue();
			System.out.println(ind.color +" "+ind.serialNo +" "+ind.governer +" "+ind.price);
			
		IndianRupee india =new IndianRupee();
		ind.color ="purple";
		ind.serialNo="4112B54";
		ind.governer="Shivu";
		ind.price=200;
		ind.toGetValue();
			System.out.println(ind.color +" "+ind.serialNo +" "+ind.governer +" "+ind.price);
			
	}
}