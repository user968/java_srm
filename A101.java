class A101 
{
	static int x=test();
	static int test()
	{
		System.out.println("A:"+x);
		return 10;
	}
	public static void main(String[] args) 
	{
		System.out.println("B:"+x);
	}
}
