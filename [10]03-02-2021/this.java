class Demo 
{
	int value;
	Demo()
	{
		this(10);
		System.out.println("No arg constructor = " + value);
	}	
	Demo(int value) 
	{
		this.value = value;
		System.out.println("One arg constructor = " + value);
	}
	void display() 
	{
		int value = 20;
		System.out.println("display = " + value + " " + this.value);
	}

	public static void main(String []args) 
	{
		Demo ob = new Demo();
		ob.display();
	}
}
