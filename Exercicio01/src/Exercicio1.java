import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        // Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
        // Formula conversor temperatura: (°F - 32 ) * 5/9 = °C
        final double fator = 5.0/9.0;
		final double ajuste = 32;
		
        Scanner teclado = new Scanner(System.in);
        
            System.out.println("Digite uma temperatura em fahrenheit: ");
            String fahrenjeit0 = teclado.next().replace("," , ".");

            double fahrenheit = Double.parseDouble(fahrenjeit0);
            double celsius = ( fahrenheit - ajuste ) * fator;
            System.out.println("A conversao de: " + fahrenjeit0 + "°F para celsius: " + celsius +"°C");
            
        teclado.close();
    }
}
