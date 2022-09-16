package Questão2;
import java.util.Scanner;
public class resposta2 {
	
		    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
            int n1;
            int n2;
			int n3;
			System.out.println("digite a 1° nota a ser somada:");
			n1 = sc.nextInt();
			System.out.println("digite a 2° nota a ser somada:");
			n2 = sc.nextInt();
			System.out.println("digite a 3° nota a ser somada:");
			n3 = sc.nextInt();
			int média = (n1 + n2 + n3) /3;
			System.out.println(média);
			
		}
	}