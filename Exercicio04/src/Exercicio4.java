import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        // Criar um programa que leia um valor e apresente os resultados ao quadrado e
        // ao cubo do valor.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira um valor:");
        String valor0 = teclado.next().replace(",", ".");

        double valor = Double.parseDouble(valor0);
        double quadrado = Math.pow(valor, 2);
        double cubo = Math.pow(valor, 3);

        System.out.println(valor0 + " ao quadrado e: " + quadrado + "\nao cubo e: " + cubo);

        teclado.close();
    }
}
