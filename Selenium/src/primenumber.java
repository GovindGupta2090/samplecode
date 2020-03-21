
public class primenumber {

	public static void main(String[] args) {
		
		int n=7;
		int flag=0;
		
		if (n==0 || n==1)
		{
			System.out.println("not a prime number");
		}
		else
		{
			for (int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					flag=1;
					break;
				}
			}
		}
		
		if(flag==0)
			System.out.println(n+" :is a prime number");
		else
			System.out.println(n+" :is not a prime number");		
		
	}

}
