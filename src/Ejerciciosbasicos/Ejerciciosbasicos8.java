package Ejerciciosbasicos;

public class Ejerciciosbasicos8 {

	public static void main(String[] args) {
		{
			int i = 8, j = 5, k;
			float x = 0.005F, y = -0.01F, z;
			char a, b = 'p', c = 'q';

			System.out.println(k = (j == 5) ? i : j);
			System.out.println(k = (j > 5) ? i : j);
			System.out.println(z = (x >= 0) ? x : 0);
			System.out.println(z = (y >= 0) ? y : 0);
			System.out.println(a = (b < c) ? b : c);
			System.out.println(k = (j > 0) ? j : 0);
			System.out.println(k = (i > 0 && j > 0) ? 0 : 1);
			System.out.println(k = (y > 0 || x > 0) ? i + 1 : i - 1);
			System.out.println(a = (b < 'c') ? b : c);
			System.out.println(a = (b >= c) ? b : 'r');
		}
		{
			int i = 1, j = 1, k = 1, x;

			System.out.println(x = (j >= 0 && k > 1) ? ++j : k + 1);
			System.out.println(x = (j > 1 || k >= 1) ? j + 3 : k + 1);
			System.out.println(x = (j >= 1 && i <= 1) ? 10 : 20);
			System.out.println(x = (i + j > 2 || k < 1) ? 2 : 4);
			System.out.println(x = (3 / 2 > i) ? j + 5 : k);
			System.out.println(x = (3 % 2 > i) ? j++ : ++k);
			System.out.println(x = (i + 10 <= j + 10 || k == 0) ? -1 : -2);
			System.out.println(x = (i == 0 || j == 1 || k == 2) ? 0 : 5);
		}
	}
}