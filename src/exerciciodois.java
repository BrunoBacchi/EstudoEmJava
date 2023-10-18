import java.util.Scanner;

public class exerciciodois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double raio, A, X;
		double pi = 3.14159;
		
		raio = sc.nextDouble();
		
		A = Math.pow(raio, 2);
		X = A * pi;
		System.out.printf("%.4f%n", X);
		
		sc.close();
	}

}
