package questao21;

import java.util.Scanner;
import java.text.DecimalFormat;
public class resposta21 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat ("0.00");
        double x, y, z ;
        System.out.println("Por favor digite a altura em que o quadro ser� pregado: ");
        x = sc.nextDouble();
        System.out.println("Por favor digite o tamanho da escada: ");
        z = sc.nextDouble();
        y = x*x + z*z;
        double ra�z = Math.sqrt(y);
        if (z < x){
            System.out.println("O tamanho da escada tem que ser maior que o da parede!");
        }
        else {
            System.out.println("A dist�ncia em que a escada deve estar � de " + df.format(ra�z) + "m");
        }
    }
}