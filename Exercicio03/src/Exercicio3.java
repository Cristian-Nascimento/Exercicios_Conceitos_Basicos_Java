import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        // Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
        // Formula do calculo IMC é IMC = peso / altura^2
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira a sua altura");
        String altura0 = teclado.next().replace("," , ".");

        System.out.println("Insira o seu peso");
        String peso0 = teclado.next().replace("," , ".");

        double altura = Double.parseDouble(altura0);
        double peso = Double.parseDouble(peso0);
        
        double altura1 = Math.pow(altura, 2);
        double imc = peso / altura1;
        System.out.println("O calculo do seu IMC foi de:" + imc);
       
        teclado.close();
    }
    
}
