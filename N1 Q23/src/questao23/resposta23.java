package questao23;

import java.util.Scanner;
import java.text.DecimalFormat;

public class resposta23 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        DecimalFormat inteiro = new DecimalFormat ("0.00000");
        System.out.println("Por favor digite um n�mero: ");
        double num = sc.nextDouble();
        System.out.println("A parte inteira do n�mero �: " + inteiro.format(num));
        double calc = (int) Math.round(num - 0.5d);
        double f = num - calc;
        System.out.println("A parte fracion�ria do n�mero �: " + inteiro.format(f));
        System.out.println("O n�mero arredondado �: " + Math.round(num));
    }
}