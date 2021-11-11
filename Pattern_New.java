package forLoopLearning;

public class Pattern_New {

	public static void main(String[] args)
	{
		Pattern_New p =new Pattern_New();
		p.print_pattern_one();
		p.print_pattern_Two();
		p.print_pattern_Three();
		p.print_pattern_four();
		p.print_pattern_five();
	
	}

	void print_pattern_one() 
	{
		for(int no=1;no<=5;no++)
		{
		for(int i=1;i<=no;i++)
		{
		System.out.print(i +" ");
		}
		System.out.println();
		}	
	}
		

	
	void print_pattern_Two() 
	{for(int j =5;j>=1;j--)
	{
		for(int i=j;i<=5;i++)
		{
		System.out.print(i+" ");
		}
		System.out.println();
	}
	}

	void print_pattern_Three()
	{
		for(int j=5;j>=1;j--)
		{
			
	for(int i=5;i>=j;i--)
	{
	System.out.print(i +" ");
	}
	System.out.println();
	}	
		
}
	void print_pattern_four()
	{
		for(int j=1;j<=5;j++)
		{
		for(int i=1;i<=j;i++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
		}	
	
	}

	void print_pattern_five()
	{
		for(int j=5;j>=1;j--)
		{
		for(int i =5;i>=j;i--)
		{
			System.out.print(j+" ");
		}
		System.out.println();
		}	
		}
		
	}
	
	
	
	
	

