// Shadowing concept

class circle 
{
	public double radius = 2.2;
}
class paramPassing2 
{
	public void m1()
	{
		circle cirObj = new circle();
		System.out.println("Before: circle radius is " + cirObj.radius);
		modifyData(cirObj);
		System.out.println("After: circle radius is " + cirObj.radius);
	}
	public void modifyData(circle cir1)
	{
		cir1.radius = 5.5;
		System.out.println(cir1);
		cir1 = new circle();
		cir1.radius = 7.7;
		System.out.println(cir1);
	}	
	public static void main(String[] args) 	
	{
		paramPassing2 Obj = new paramPassing2();
		Obj.m1();
	}
}
