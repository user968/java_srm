class A66 
{
	public static void main(String[] args) 
	{
		int i=0;
		int j=i++ + test1(i++) + i + ++i + test1(++i)+i;
		System.out.println(i);
		System.out.println(j);
	}
	static int test1(int i)
	{
		return ++i;
	}
}
