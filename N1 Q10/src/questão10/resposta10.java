package questão10;

import java.util.Scanner;
import java.text.DecimalFormat;
public class resposta10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Digite o raio do círculo: ");
        double π = 3.1415;
        double a = (π * π);
        double R = sc.nextDouble();
        double F = (π * (R * R));
        System.out.println("A área do círculo é: ");
        System.out.println(df.format(F) + "°" + "graus");
        
    }
    
}