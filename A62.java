class A62 
{
	public static void main(String[] args) 
	{
		int i=0;
		int j=i++ + test(i) + i;
		System.out.println(i);
		System.out.println(j);
	}
	static int test(int i)
	{
		return i++;
	}
}
