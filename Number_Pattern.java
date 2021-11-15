
public class Number_Pattern {

	public static void main(String[] args) 
	{
		Number_Pattern p = new Number_Pattern();
		
		p.print_pattern_one();
		System.out.println();
		
		p.print_pattern_two();
		System.out.println();

		p.print_pattern_three();
		System.out.println();

		p.print_pattern_four();
		System.out.println();

		p.print_pattern_five();
		System.out.println();

		p.print_pattern_six();
		System.out.println();

		p.print_pattern_seven();
		System.out.println();

		p.print_pattern_eight();
		System.out.println();
		
		p.print_pattern_nine();
		System.out.println();
		
		p.print_pattern_ten();
		System.out.println();
		
		p.print_pattern_eleven();
		System.out.println();

		p.print_pattern_twelve();
		System.out.println();
		
		p.print_pattern_thirteen();
		System.out.println();
		
		p.print_pattern_fourteen();
		System.out.println();
		
	}
	
	
	void print_pattern_one() {
		for (int j = 1; j <= 6; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print(i + " ");
			}
			System.out.println();

		}
		for (int k = 5; k >= 1; k--) {
			for (int i = 1; i <= k; i++) {
				System.out.print(i + " ");

			}
			System.out.println();

		}

	}
	
	void print_pattern_two() 
	{
	

		for(int j=1; j<=6;j++)
		{
		for(int i =1;i<=j;i++)
		{
		System.out.print(i+" ");
		
		}
		System.out.println();
		}	
		
	}
	
	void print_pattern_three() 
	{
	

		for(int j = 6;j>=1;j--)
		{
			for(int i = 1; i<j; i++)
			{
				System.out.print(" "+" ");
			}
			
			
			  for(int i = 1; i<=7-j; i++)
			  { 
				  System.out.print(7-j + "   ");
			  
			  }
			 
			System.out.println();
			
		}
	

		}
			 
		

void print_pattern_four()
{
	
	for(int j=1;j<=6;j++)
	{
	for(int i =1;i<=j;i++)
	{
		System.out.print(i+" ");
		
	}
	for(int  i =j-1;i>=1;i--)
	{
		System.out.print(i+" ");
	}
	System.out.println();
	}



}



void print_pattern_five()
{
	for(int j =1;j<=7;j++)
	{
	for(int i =1;i<=j;i++)
	{
		System.out.print(i+" ");
	}
	for(int i =1;i<=7-j;i++)
	{
		System.out.print(i+" ");
	}
	System.out.println();
}
}



void print_pattern_six()
{
	 for (int j = 1; j<= 6; j++) 
     {
         for (int i = j; i >= 1; i--)
         {
             System.out.print(i+" ");
         }
          
         System.out.println();
     }
      
}

void print_pattern_seven()
{
	
	for(int j =1;j<=5;j++)
	{
		for(int i =5;i>=j;i--)
		{
			System.out.print(i+" ");
		}
	System.out.println();
	}
	for(int k =5;k>=1;k--)
	{
	
	for(int i =5;i>=k;i--)
	{
		System.out.print(i+" ");
	}
	System.out.println();
	}
	
}


void print_pattern_eight()
{
	
	for(int j =5;j>=1;j--)
	{
		for(int i =1;i<=j;i++)
		{
			System.out.print(i+" ");
		}
	System.out.println();
	}
	
	for(int k =1;k<=5;k++)
	{
	
	for(int i =1;i<=k;i++)
	{
		System.out.print(i+" ");
	}
	System.out.println();
	}
	
}

void print_pattern_nine()
{
	

	for (int j = 1; j <= 6; j++) 
	{
		for (int i = 1; i <= j; i++) 
		{
			System.out.print(" " + " ");
		}
		for (int i = 6; i >= j; i--) 
		{
			System.out.print(i + " ");
		}
		for (int i = j; i <= 6; i++) 
		{
			System.out.print(i + " ");
		}
		for (int i = 1; i <= j; i++) 
		{
			System.out.print(" " + " ");
		}
		System.out.println();

	}

	for (int k = 6; k >= 1; k--)
	{
		for (int i = 1; i <= k; i++) 
		{
			System.out.print(" " + " ");
		}

		for (int i = 6; i >= k; i--) 
		{

			System.out.print(i + " ");
		}
		for (int i = k; i <= 6; i++)
		{
			System.out.print(i + " ");
		}
		for (int i = 1; i <= k; i++) 
		{
			System.out.print("" + " ");
		}

		System.out.println();

	}


}

void print_pattern_ten()
{
	

	for (int j = 1; j <= 6; j++) {
		for (int i = 1; i <= j; i++) {
			System.out.print(i+" ");
		}
		for (int i = 6; i >= j; i--) {
			System.out.print(" " + " ");
		}
		for (int i = j; i <= 6; i++) {
			System.out.print(" " + " ");
		}
		for (int i = j; i >=1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

	for (int k = 6; k >= 1; k--) 
	{
		for (int i = 1; i <= k; i++) 
		{
			System.out.print(i+" ");
		}

		for (int i = 6; i >= k; i--) 
		{

			System.out.print(" " + " ");
		}
		for (int i = k; i <= 6; i++)
		{
			System.out.print(" " + " ");
		}
		for (int i = k; i >=1; i--) 
		{
			System.out.print(i + " ");
		}

		System.out.println();

	}
}
	
	void print_pattern_eleven()
	{

		for (int j = 6; j >=1; j--)
		{
			for (int i = 6; i >=j; i--) 
			{
				System.out.print(i+" ");
			}
			for (int i = 1; i <= j; i++) 
			{
				System.out.print(" " + " ");
			}
			for (int i = j; i >=1; i--) {
				System.out.print(" " + " ");
			}
			for (int i = j; i<=6; i++) 
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}

		for (int k = 1; k <=6; k++) 
		{
			for (int i = 6; i >=k; i--) 
			{
				System.out.print(i+" ");
			}

			for (int i = 1; i <= k; i++) 
			{

				System.out.print(" " + " ");
			}
			for (int i = k; i >=1; i--)
			{
				System.out.print(" "+ " ");
			}
			for (int i = k; i<=6; i++) 
			{
				System.out.print(i + " ");
			}

			System.out.println();

		}
}

void print_pattern_twelve()
{
	for (int j = 1; j <= 6; j++)
	{
		for (int i = j; i <= 6; i++) 
		{
			if (i == 6) 
			{
				System.out.print(i);
			} else
				System.out.print(" " + " ");
		}
		for (int i = 1; i <= j; i++) 
		{
			System.out.print(" " + " ");
		}
		for (int i = 1; i <= j; i++) 
		{
			System.out.print(" " + " ");
		}
		for (int i = 6; i >= j; i--) 
		{
			if (i == 6) 
			{
				System.out.print(i);
			} else
				System.out.print(" " + " ");
		}
		for (int i = j; i <= 6; i++) 
		{
			if (i == 6) 
			{
				System.out.print(i);

			} else
				System.out.print(" " +" ");
		}
		for (int i = 1; i <= j; i++) 
		{
			System.out.print(" "+" " );
		}
		for (int i = 1; i <= j; i++) 
		{

			System.out.print(" " +" " );
		}
		for (int i = 6; i >= j; i--) 
		{
			if (i == 6)
			{
				System.out.print(i);
			} else
				System.out.print(" " +" ");
		}
		System.out.println();
	}

}


void print_pattern_thirteen()
{

	for (int j = 6; j >= 1; j--)
	{
		for (int i = j; i >= 1; i--) 
		{
			System.out.print(" " + " ");

		}

		for (int i = 6; i >= j; i--) 
		{
			System.out.print(i + " ");

		}
		for (int i = 10; i >= j; i--) 
		{
			System.out.print(" " + " ");

		}
		for (int i = 1; i <= j; i++)
		{
			System.out.print(" " + " ");
		}
		System.out.println();
	}

	for (int j = 1; j <= 6; j++)
	{
		for (int i = 1; i <= j; i++)
		{
			System.out.print(" " + " ");

		}

		for (int i = 6; i >= j; i--)
		{
			System.out.print(i + " ");

		}
		for (int i = 6; i >= j; i--) 
		{
			System.out.print(" " + " ");
		}
		for (int i = 1; i <= j; i++) 
		{
			System.out.print(" " + " ");
		}

		System.out.println();
	}
}



void print_pattern_fourteen()
{
	
	for (int j = 10; j >= 5; j--) {
		for (int i = j; i >= 5; i--) {
			if (i % 2 == 0) {
				System.out.print("0" + " ");
			} else
				System.out.print("1" + " ");
		}
		for (int i = 10; i >= j; i--) {

			if (i % 2 == 0) {
				System.out.print("0" + " ");
			} else
				System.out.print("1" + " ");
		}
		System.out.println();
	}
}

}




