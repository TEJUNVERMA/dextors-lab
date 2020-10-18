package pack1;

public class example 
{
	public static void main(String[] args)
	{
		int a=1;
		run e = new run(a);
		System.out.print(e.add());
		
	}

}
class run
{
	private int k;
	run(int a)
	{
		this.k = a;
	}
	public int add()
	{
		return k+2;
		
	}
}