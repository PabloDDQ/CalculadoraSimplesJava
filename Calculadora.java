import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operador, continuar;
        double num1, num2;

        do {
            do {
                System.out.print("Digite o operador que deseja utilizar + (Soma), - (Subtração), * (Multiplicação), / (Divisão), ** (Potenciação): ");
                operador = scanner.nextLine();

                if (operador.equals("+") || operador.equals("-") || operador.equals("*") || operador.equals("/") || operador.equals("**")) {
                    System.out.println("Operador digitado: " + operador);
                } else {
                    System.out.println("O operador '" + operador + "' não existe nesse programa.");
                }
            } while (!(operador.equals("+") || operador.equals("-") || operador.equals("*") || operador.equals("/") || operador.equals("**")));

            System.out.print("Digite o primeiro número: ");
            num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            num2 = scanner.nextDouble();
            scanner.nextLine();

            if (operador.equals("+")) {
                double resultado = soma(num1, num2); 
                System.out.println("O resultado da soma de " + num1 + " e " + num2 + " é: " + resultado);
            }

            else if (operador.equals("-")) {
                double resultado = subtracao(num1, num2); 
                System.out.println("O resultado da subtração de " + num1 + " e " + num2 + " é: " + resultado);
            }

            else if (operador.equals("*")) {
                double resultado = multiplicacao(num1, num2); 
                System.out.println("O resultado da multiplicação de " + num1 + " e " + num2 + " é: " + resultado);
            }

            else if (operador.equals("/")) {
                if (num2 != 0) {
                    double resultado = divisao(num1, num2); 
                    System.out.println("O resultado da divisão de " + num1 + " por " + num2 + " é: " + resultado);
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
            }

            else if (operador.equals("**")) {
                double resultado = potenciacao(num1, num2); 
                System.out.println("O resultado da potenciação de " + num1 + " elevado a " + num2 + " é: " + resultado);
            }

            System.out.print("Deseja realizar outra operação? (S/N): ");
            continuar = scanner.nextLine();

            if (continuar.equalsIgnoreCase("N")) {
                System.out.println("Programa encerrado.");
                break;
            }

        } while (continuar.equalsIgnoreCase("S"));

        scanner.close();
    }

    public static double soma(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public static double divisao(double num1, double num2) {
        return num1 / num2;
    }

    public static double potenciacao(double num1, double num2) {
        return Math.pow(num1, num2);
    }
}
