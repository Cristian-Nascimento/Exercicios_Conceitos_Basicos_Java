import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        // Criar um programa que leia o valor da base e da altura de um triângulo e
        // calcule a área.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o valor da base:");
        String base0 = teclado.next().replace(",", ".");

        System.out.println("Insira o valor da altura:");
        String altura0 = teclado.next().replace(",", ".");

        double base = Double.parseDouble(base0);
        double altura = Double.parseDouble(altura0);

        double area = (base * altura) / 2;

        System.out.println("Area do triangulo e: " + area);

        teclado.close();
    }
}
