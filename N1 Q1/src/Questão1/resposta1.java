package Quest�o1;
import java.util.Scanner;

public class resposta1 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
		int num2;
		int num3;
		int num4;
		System.out.println("digite o 1� n�mero a ser somado:");
		num1 = sc.nextInt();
		System.out.println("digite o 2� n�mero a ser somado:");
		num2 = sc.nextInt();
		System.out.println("digite o 3� n�mero a ser somado:");
		num3 = sc.nextInt();
		System.out.println("digite o 4� n�mero a ser somado:");
		num4 = sc.nextInt();
		int soma = (num1 + num2 + num3 + num4);
		System.out.println(soma);
		
	}
}

	
