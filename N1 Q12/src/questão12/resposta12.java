package quest�o12;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class resposta12 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat ("0.00");
        System.out.println("Digite dois n�meros maiores que 0: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        if (num1!=0 && num2!=0){
         System.out.println("O resultado � " + Math.pow(num1, num2));    
        }
        else {
         System.out.println("O valor dos n�meros precisa ser maior que 0!");   
        }
    }
}