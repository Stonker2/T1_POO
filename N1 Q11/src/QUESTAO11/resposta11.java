package QUESTAO11;
import java.util.Scanner;
import java.lang.Math;
public class resposta11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor digite um n�mero: ");
		double a = sc.nextDouble();
		System.out.println("Oquadrado do n�mero �:");
		System.out.println(Math.pow(a,  2));
		System.out.println("O n�mero ao cubo �: ");
		System.out.println(Math.pow(a,  3));
		System.out.println("A ra�z quadrada: ");
		System.out.println(Math.sqrt(a));
		System.out.println("A ra�z c�bica �: ");
		System.out.println(Math.cbrt(a));
	}
}
