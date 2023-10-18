import java.util.Scanner;

public class exerciciocinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeropeca, numeropeca2;
		double valor, valor2, total, total2;
		
		Scanner sc = new Scanner(System.in);
		
		sc.nextInt();
		numeropeca = sc.nextInt();
		valor = sc.nextDouble();
	
		sc.nextInt();
		numeropeca2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		total = valor * numeropeca;
		total2 = valor2 * numeropeca2;
		
		System.out.printf("VALOR A PAGAR: %.2f%n", (total + total2));
		
		sc.close();
	}

}
