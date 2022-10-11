class SoapTester{
	public static void main(String args[]){
		Soap soap=new Soap();
		soap.name="Mysuru Sandal";
		soap.color="Cream";
		soap.shape="Rectangle";
		soap.price=50.90;
		soap.toGetFresh();
		System.out.println(soap.name +" "+soap.color +" "+soap.shape +" "+soap.price);
	
		Soap soap1= new Soap();
		soap1.name="Fiama";
		soap1.color="pink";
		soap1.shape="Ovel";
		soap1.price=30.00;
		soap1.toGetFresh();
		System.out.println(soap1.name +" "+soap1.color +" "+soap1.shape +" "+soap1.price);
	
		
	}
}