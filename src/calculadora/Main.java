// Classe Main.java
package calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Calculadora!");
        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int escolha = scanner.nextInt();

        double resultado;
        switch (escolha) {
            case 1:
                resultado = Calculadora.adicao(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = Calculadora.subtracao(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = Calculadora.multiplicacao(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                try {
                    resultado = Calculadora.divisao(num1, num2);
                    System.out.println("Resultado: " + resultado);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Opção inválida");
        }

        scanner.close();
    }
}
