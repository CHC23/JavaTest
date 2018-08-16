package ThisTest;

public class ThisTest 
{
	int i,j,k;
	
	ThisTest(int i,int j) 
	{

		this.i=i;
		this.j=j;
		System.out.println(i);
		System.out.println(j);
	}
	
	int sum(int a,int b) 
	{
		int sum=a+b;
		return sum;
	}
	
	public static void main(String[] args) 
	{
		int p;
		ThisTest chc=new ThisTest(10,100);
		System.out.println(chc.sum(10, 20));
		p=chc.printN();
		System.out.println(p);
	}
	
	int printN()
	{
		return i+j;
	}
}
