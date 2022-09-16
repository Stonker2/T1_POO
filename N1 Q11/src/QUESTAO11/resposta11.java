package QUESTAO11;
import java.util.Scanner;
import java.lang.Math;
public class resposta11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor digite um número: ");
		double a = sc.nextDouble();
		System.out.println("Oquadrado do número é:");
		System.out.println(Math.pow(a,  2));
		System.out.println("O número ao cubo é: ");
		System.out.println(Math.pow(a,  3));
		System.out.println("A raíz quadrada: ");
		System.out.println(Math.sqrt(a));
		System.out.println("A raíz cúbica é: ");
		System.out.println(Math.cbrt(a));
	}
}
