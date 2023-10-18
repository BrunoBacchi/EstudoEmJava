import java.util.Scanner;

public class exercicioseis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double A,B,C;
		double pi = 3.14159;
		
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		System.out.printf("\nTRIANGULO: %.3f%n", + A * C / 2);
		System.out.printf("\nCIRCULO: %.3f%n", pi * Math.pow(C, 2));
		System.out.printf("\nTRAPEZIO: %.3f%n", + (A + B) * C / 2);
		System.out.printf("\nQUADRADO: %.3f%n", Math.pow(B, 2));
		System.out.printf("\nRETANGULO: %.3f%n", + A * B);
		
		sc.close();
	}

}
