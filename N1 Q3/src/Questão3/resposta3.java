package Quest�o3;
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class resposta3 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
DecimalFormat df = new DecimalFormat("0.00");
System.out.println("Por favor digite seu sal�rio:");
float sal�rio;
sal�rio = sc.nextInt();
float novosal�rio;
novosal�rio = sal�rio + (sal�rio * 25 / 100);
System.out.println("Seu novo sal�rio �:" + novosal�rio + "!");

	}

}
