class AtomBergRenesa{
	static String modelName           ="Renesa";
	static String brandColor          ="Golden Oak";
	static boolean reversibleRotation =false;
	static boolean remote             =true;
	static String powerRequirement    ="AC 110-285V DC";
	static String bladeMaterial       ="Aluminium";
	static float operationalCurrent   =1.16f;
	static int    numberOfBlades      =3;
	static int    packOf              =1;

	public static void main(String args[]){
	
		System.out.println("Model Name          :"+modelName);
		System.out.println("Brand Color         :"+brandColor);
		System.out.println("Reversible Rotation :"+reversibleRotation);
		System.out.println("Remote              :"+remote);
		System.out.println("Power Requirement   :"+powerRequirement);
		System.out.println("Blade Material      :"+bladeMaterial);
		System.out.println("Operational Current :"+operationalCurrent);
		System.out.println("Number Of Blades    :"+numberOfBlades);
		System.out.println("Pack Of             :"+packOf);
	}
}