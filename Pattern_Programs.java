package patternPrograms;

public class Pattern_Programs

{

	public static void main(String[] args) {
		Pattern_Programs p = new Pattern_Programs();

		
		 p.print_pattern_one(); System.out.println();
		 
		 
		  p.print_pattern_two(); System.out.println();
		  
		  p.print_pattern_three(); System.out.println();
		  
		  p.print_pattern_four(); System.out.println();
		  
		  p.print_pattern_five(); System.out.println();
		  
		  p.print_pattern_six(); System.out.println();
		  
		  p.print_pattern_seven(); System.out.println();
		  
		  p.print_pattern_eight(); System.out.println();
		  
		  p.print_pattern_nine(); System.out.println();

		 


	}

	void print_pattern_one() 
	{
		for (int j = 1; j <= 10; j++) 
		{
			for (int i = 1; i <= j; i++)
			{
				System.out.print(" " + "*");
						}
			System.out.println();

		}
		for (int k = 9; k >= 1; k--) 
		{
			for (int i = 1; i <= k; i++) 
			{
				System.out.print(" " + "*");
				
			}
			System.out.println();

		}

	}

	void print_pattern_two() {
		for (int j = 10; j >= 1; j--) {
			for (int i = j; i >= 1; i--) {
				System.out.print(" " + " ");

			}

			for (int i = 10; i >= j; i--) {
				System.out.print("@" + " ");

			}
			for (int i = 10; i >= j; i--) {
				System.out.print("@" + " ");

			}

			System.out.println();

		}

	}

	void print_pattern_three() {

		for (int j = 10; j >= 1; j--) {
			for (int i = j; i >= 1; i--) {
				System.out.print(" " + " ");

			}

			for (int i = 10; i >= j; i--) {
				System.out.print("@" + " ");

			}
			for (int i = 10; i >= j; i--) {
				System.out.print("#" + " ");

			}
			System.out.println();
		}

		for (int j = 1; j <= 10; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print(" " + " ");

			}

			for (int i = 10; i >= j; i--) {
				System.out.print("$" + " ");

			}
			for (int i = 10; i >= j; i--) {
				System.out.print("&" + " ");
			}

			System.out.println();
		}
	}

	void print_pattern_four() {
		for (int j = 10; j >= 1; j--) {
			for (int i = j; i >= 1; i--) {
				System.out.print(" " + " ");

			}

			for (int i = 10; i >= j; i--) {
				if (i == 10) {
					System.out.print("@" + " ");
				} else
					System.out.print(" " + " ");

			}
			for (int i = 10; i >= j; i--) {
				if (i == j) {
					System.out.print("#" + " ");
				} else
					System.out.print(" " + " ");

			}
			System.out.println();
		}

		for (int j = 1; j <= 10; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print(" " + " ");

			}

			for (int i = 10; i >= j; i--) {
				if (i == 10) {
					System.out.print("$" + " ");
				} else
					System.out.print(" " + " ");

			}
			for (int i = 10; i >= j; i--) {
				if (i == j) {
					System.out.print("&" + " ");
				} else
					System.out.print(" " + " ");

			}

			System.out.println();
		}

	}

	void print_pattern_five() {

		for (int j = 10; j >= 1; j--) {
			for (int i = j; i >= 1; i--) {
				System.out.print("@" + " ");

			}

			for (int i = 10; i >= j; i--) {
				System.out.print(" " + " ");

			}
			for (int i = 10; i >= j; i--) {
				System.out.print(" " + " ");

			}
			for (int i = 1; i <= j; i++) {
				System.out.print("#" + " ");
			}
			System.out.println();
		}

		for (int j = 1; j <= 10; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print("$" + " ");

			}

			for (int i = 10; i >= j; i--) {
				System.out.print(" " + " ");

			}
			for (int i = 10; i >= j; i--) {
				System.out.print(" " + " ");
			}
			for (int i = 1; i <= j; i++) {
				System.out.print("&" + " ");
			}

			System.out.println();
		}
	}

	void print_pattern_six() {
		for (int j = 1; j <= 10; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print(" " + "*");
			}
			for (int i = 10; i >= j; i--) {
				System.out.print("@" + " ");
			}
			for (int i = j; i <= 10; i++) {
				System.out.print("~" + " ");
			}
			for (int i = 1; i <= j; i++) {
				System.out.print("&" + " ");
			}
			System.out.println();

		}

		for (int k = 10; k >= 1; k--) {
			for (int i = 1; i <= k; i++) {
				System.out.print(" " + "^");
			}

			for (int i = 10; i >= k; i--) {

				System.out.print("#" + " ");
			}
			for (int i = k; i <= 10; i++) {
				System.out.print("+" + " ");
			}
			for (int i = 1; i <= k; i++) {
				System.out.print("?" + " ");
			}

			System.out.println();

		}

	}

	void print_pattern_seven() {

		for (int j = 0; j <= 9; j++) {
			for (int i = 0; i <= j; i++) {
				System.out.print(i + " ");
			}
			for (int i = 9; i >= j; i--) {
				System.out.print(i + " ");
			}
			for (int i = j; i <= 9; i++) {
				System.out.print(i + " ");
			}
			for (int i = 0; i <= j; i++) {
				System.out.print(i + " ");
			}
			System.out.println();

		}

		for (int k = 9; k >= 0; k--) {
			for (int i = 0; i <= k; i++) {
				System.out.print(i + " ");
			}

			for (int i = 9; i >= k; i--) {

				System.out.print(i + " ");
			}
			for (int i = k; i <= 9; i++) {
				System.out.print(i + " ");
			}
			for (int i = 0; i <= k; i++) {
				System.out.print(i + " ");
			}

			System.out.println();

		}

	}

	void print_pattern_eight() {
		for (int j = 20; j >= 10; j--) {
			for (int i = j; i >= 10; i--) {
				if (i % 2 == 0) {
					System.out.print("0" + " ");
				} else
					System.out.print("1" + " ");
			}
			for (int i = 20; i >= j; i--) {

				if (i % 2 == 0) {
					System.out.print("0" + " ");
				} else
					System.out.print("1" + " ");
			}
			System.out.println();
		}

	}

	void print_pattern_nine() 
	{
		for (int j = 1; j <= 10; j++) 
		{
			for (int i = j; i <= 10; i++)
			{
				if (i == 10) 
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
			for (int i = 10; i >= j; i--)
			{
				if (i == 10)
{
					System.out.print(i);
				} else
					System.out.print(" " + " ");
			}
			for (int i = j; i <= 10; i++)
			{
				if (i == 10) 
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
			for (int i = 10; i >= j; i--)
			{
				if (i == 10)
{
					System.out.print(i);
				} else
					System.out.print(" " + " ");
			}
			System.out.println();
		}

	}
}
