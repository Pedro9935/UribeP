
import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[]) {
		//DECLARACION DE VARIABLE PARA LEER EL LIMITE DE DIGITOS
		Scanner Limite = new Scanner(System.in);
		//DECLARACION DE VARIABLES
		int a=0, b=1, c, l, i=0;
		//DAR VALOR A LA VARIABLE L CON SCANNER
		System.out.print("¿Cuantos digitos desea imprimir?");
		l= Limite.nextInt();
		//CICLO WHILE
		while(i<l) {
			c=a;
			a=b+a;
			b=c;
			System.out.println(b);
			i++;
			
		}
	}

}
