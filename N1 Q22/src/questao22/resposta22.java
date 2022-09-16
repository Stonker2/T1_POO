package questao22;

import java.util.Scanner;
import java.text.DecimalFormat;
public class resposta22 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat ("0.00");
        System.out.println("Digite o seu salário: ");
        double vlr_slr = sc.nextDouble();
        System.out.println("Digite a quantidade de quilowatts gastos na sua casa: ");
        double qnt_kw = sc.nextDouble();
        double vlr_kw = vlr_slr / 5;
        double vlr_reais = (vlr_kw * qnt_kw);
        double desconto = vlr_reais * 15/100;
        double vlr_desconto = vlr_reais - desconto;
        System.out.println("O valor a ser pago por KW é: " + vlr_kw);
        System.out.println("O valor total a ser pago é: " + vlr_reais);
        System.out.println("Com o desconto o valor é:" + vlr_desconto);
        
    }