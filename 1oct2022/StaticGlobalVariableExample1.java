class StaticGlobalVariableExample1
static int pincode=1005;
static char grade='A';
static boolean result;
static double salary;
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts!");
		int age=25;
		System.out.println("age: "+age);
		System.out.println("pincode is: "+result);
		System.out.println("salary is: "+salary);
		System.out.println("updated SGV");
		pincode=1007;
		StaticGlobalVariableExample1.grade='B';
		result=true;
		System.out.println("Program Ends");

	}
}
