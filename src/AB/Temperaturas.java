package AB;

public class Temperaturas {

	public static void main(String[] args) {

		int[] temperaturas = new int[7];
		double total = 0;

		temperaturas[0] = 15;
		temperaturas[1] = 12;
		temperaturas[2] = 15;
		temperaturas[3] = 15;
		temperaturas[4] = 14;
		temperaturas[5] = 25;
		temperaturas[6] = 17;

		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println(temperaturas[i]);
			total += temperaturas[i];

		}

		double media = total / 7;
		System.out.println("Media " + media);

	}

}
