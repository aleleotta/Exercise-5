package exercise5;
import java.util.*;

public class Exercise5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Declaración de scanner
		Double radius; //Declaración de variables
		Double result;
		
		System.out.println("Introduce the radius: "); //Se pide el radio.
		radius = sc.nextDouble(); //Se introduce el radio al usuario.
		result = Math.PI*radius*2; //Calculo: r*2*3.14
		System.out.println("Circumference: " + result); //Output de resultado final.
		sc.close(); //Cierre de scanner
	}
}
