package Ejercicio14;
import java.util.Scanner;

public class ejercicio14 {
	public static void main(String[] args) {
		/*	Declaramos las variables	*/
		double numero, cuadrado, cubo;
		
		/*	Leemos las entradas	*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el número: ");
		
		/*	Asignamos los valores según los cálculos correspondientes	*/
		numero = sc.nextDouble();
		cuadrado = Math.pow(numero,2);
		cubo = Math.pow(numero,3);
		
		/*	Imprimimos la respuesta	*/
		System.out.println("El cuadrado de "+ numero + " es: " + cuadrado);
		System.out.println("El cubo de "+ numero + " es: " + cubo);
		
		/*	Cerramos el scanner	*/
		sc.close();
	}
}
