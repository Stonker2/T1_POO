package Questão3;
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class resposta3 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
DecimalFormat df = new DecimalFormat("0.00");
System.out.println("Por favor digite seu salário:");
float salário;
salário = sc.nextInt();
float novosalário;
novosalário = salário + (salário * 25 / 100);
System.out.println("Seu novo salário é:" + novosalário + "!");

	}

}
