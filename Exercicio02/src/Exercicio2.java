import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        // Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
        // Formula conversor temperatura: (°C * (9/5) ) +32 = °F

        final double fator = 9.0/5.0;
		final double ajuste = 32;
		
        Scanner teclado = new Scanner(System.in);
        
            System.out.println("Digite uma temperatura em Celsius: ");
            String celsius0 = teclado.next().replace("," , ".");

            double celsius = Double.parseDouble(celsius0);
            double fahrenheit = ( celsius * fator ) + ajuste;
            System.out.println("A conversao de: " + celsius0 + "°C para °fahrenheit e:" + fahrenheit + "°F");
            
        teclado.close();

    }
}
