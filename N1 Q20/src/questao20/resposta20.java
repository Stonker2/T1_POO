package questao20;


import java.util.Scanner;
import java.text.DecimalFormat; 
public class resposta20 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Digite o �ngulo: ");
        double �ngulo = sc.nextDouble();
        System.out.println("Digite a altura da parede: ");
        double parede = sc.nextDouble();
        double rad = (�ngulo * (3.14/180));
        double escada = (�ngulo/ Math.sin(rad));
        System.out.println("O tamanho da escada �: " + df.format(escada));
        
    }
}
