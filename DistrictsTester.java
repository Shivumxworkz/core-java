class DistrictsTester{
	public static void main(String args[]){
		Districts dis =new Districts();
		dis.name ="Mysuru";
		dis.noOfTaluk =5;
		dis.population =3001127;
		dis.area ="6854km2";
		dis.toGetInformation();
			System.out.println(dis.name +" "+dis.noOfTaluk +" "+dis.population +" "+dis.area);
		
		Districts dis1 =new Districts();
		dis1.name ="Chamarajanagara";
		dis1.noOfTaluk =4;
		dis1.population =443671;
		dis1.area ="5101km2";
		dis1.toGetInformation();
			System.out.println(dis1.name +" "+dis1.noOfTaluk +" "+dis1.population +" "+dis1.area);
	
		Districts district =new Districts();
		district.name ="Mangalore";
		district.noOfTaluk =5;
		district.population =736000;
		district.area ="170km2";
		district.toGetInformation();
			System.out.println(district.name +" "+district.noOfTaluk +" "+district.population +" "+district.area);
	}
}