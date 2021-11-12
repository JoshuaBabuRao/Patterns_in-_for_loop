package forLoopLearning;

public class Pattern_Star {

	public static void main(String[] args) {
		Pattern_Star p = new Pattern_Star();

		p.print_pattern_one();
		System.out.println("-----------");

		p.print_pattern_Two();
		System.out.println("-----------");

		p.print_pattern_Three();
		System.out.println("-----------");

		p.print_pattern_four();
		System.out.println("-----------");

		p.print_patetrn_five();
		System.out.println("-----------");

		p.print_patetrn_six();
	}

	private void print_pattern_one()

	{
		for (int no = 1; no <= 5; no++) {
			for (int i = 1; i <= no; i++) {
				System.out.print(i + " ");
			}
			for (int s = no; s <= 5; s++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	private void print_pattern_Two() {
		for (int j = 5; j >= 1; j--) {
			for (int i = j; i <= 5; i++) {
				System.out.print(i + " ");
			}
			for (int s = 1; s <= j; s++) {
				System.out.print("*" + " ");

			}

			System.out.println();
		}
	}

	private void print_pattern_Three() {

		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print(j + " ");
			}
			for (int s = 1; s <= 6 - j; s++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

	private void print_pattern_four() {

		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print(j + " ");
			}
			for (int s = 1; s <= 6 - j; s++) {
				System.out.print(s + " ");
			}
			System.out.println();
		}

	}

	private void print_patetrn_five() {
		for (int j = 5; j >= 1; j--) {
			for (int i = 5; i >= j; i--) {
				System.out.print(j + " ");
			}

			for (int s = 5; s >= 6 - j; s--) {
				System.out.print("*" + " ");

			}
			System.out.println();
		}
	}

	private void print_patetrn_six() {
		for (int j = 5; j >= 1; j--) {
			for (int i = 5; i >= j; i--) {
				System.out.print(j + " ");
			}

			for (int s = j; s >= 1; s--) {
				System.out.print(s + " ");

			}
			System.out.println();
		}
	}

}

/*
1 * * * * * 
1 2 * * * * 
1 2 3 * * * 
1 2 3 4 * * 
1 2 3 4 5 * 
-----------
5 * * * * * 
4 5 * * * * 
3 4 5 * * * 
2 3 4 5 * * 
1 2 3 4 5 * 
-----------
1 * * * * * 
2 2 * * * * 
3 3 3 * * * 
4 4 4 4 * * 
5 5 5 5 5 * 
-----------
1 1 2 3 4 5 
2 2 1 2 3 4 
3 3 3 1 2 3 
4 4 4 4 1 2 
5 5 5 5 5 1 
-----------
5 * * * * * 
4 4 * * * * 
3 3 3 * * * 
2 2 2 2 * * 
1 1 1 1 1 * 
-----------
5 5 4 3 2 1 
4 4 4 3 2 1 
3 3 3 3 2 1 
2 2 2 2 2 1 
1 1 1 1 1 1 

*/