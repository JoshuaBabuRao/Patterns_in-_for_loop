


public class Patterns {

	public static void main(String[] args) {

		Patterns p = new Patterns();
		p.print_Pattern_One();
		p.print_Pattern_Two();
		p.print_Pattern_Three();
		p.print_Pattern_Four();
		p.print_Pattern_Five();
		p.print_Pattern_Six();
		p.print_Pattern_Seven();
		p.print_Pattern_eight();

	}

	void print_Pattern_One() {
		for (int j = 5; j >= 1; j--) {
			for (int i = 1; i <= j; i++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

	void print_Pattern_Two() {
		for (int j = 5; j >= 1; j--) {
			for (int i = 1; i <= j; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

	void print_Pattern_Three() {

		for (int j = 5; j >= 1; j--) {
			for (int i = j; i >= 1; i--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	void print_Pattern_Four() {
		for (int no = 5; no >= 1; no--) {

			for (int i = no; i >= 1; i--) {
				System.out.print(no + " ");
			}
			System.out.println();
		}
	}

	void print_Pattern_Five() {

		for (int no = 1; no <= 5; no++) {
			for (int i = no; i <= 5; i++) {
				System.out.print(no + " ");
			}
			System.out.println();
		}
	}

	void print_Pattern_Six() {
		for (int no = 5; no >= 1; no--) {
			for (int i = 1; i <= no; i++) {
				System.out.print((6 - no) + " ");

			}
			System.out.println();
		}
	}

	void print_Pattern_Seven() {

		for (int no = 1; no <= 5; no++) {
			for (int i = no; i <= 5; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	void print_Pattern_eight() {
		for (int no = 5; no >= 1; no--) {
			for (int i = no; i >= 1; i--) {

				System.out.print(i + " ");
			}

			System.out.println();
		}
	}
}
