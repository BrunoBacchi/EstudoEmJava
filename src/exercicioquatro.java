import java.util.Scanner;

public class exercicioquatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero, hora, salario;
		
		Scanner sc = new Scanner (System.in);
		
		numero = sc.nextDouble();
		hora = sc.nextDouble();
		salario = sc.nextDouble();
		
		System.out.println("NUMBER = " + numero);
		System.out.println("SALARY = " + hora * salario);
		
		sc.close();
	}

}
