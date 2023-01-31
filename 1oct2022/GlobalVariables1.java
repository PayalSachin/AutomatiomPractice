class Globalvariables1
static int pincode=1005;
double salary=45000;
static int empID=1005;
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts!");
		int age=25;
		System.out.println("Local variable age: "+age);
		System.out.println("SGV pincode: "+pincode);
		System.out.println("SGV pincode with std: "+Globalvariables1.pincode);
		/*GlobalVariables1 g1;
		g1=new GlobalVariables1();
		*/GlobalVariables1 g1= new GlobalVariables1();
		System.out.println("with g1,NSGV salary: "+g1.salary);
		pincode=1007;
		System.out.println("SGV pincode: "+pincode);
		GlobalVariables1 g2=new GlobalVariables1();
		System.out.println("with g2,NSGV salary: "+g2.salary);
		System.out.println("Program Ends");

	}
}
