import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Digite o operador +(Somar), *(Multiplicar), /(Dividir), -(Subtrair), **(Potenciação): ");
            String operacao_digitada = scanner.nextLine();

            System.out.println("Operação escolhida: " + operacao_digitada);

            System.out.print("Digite o primeiro número: ");
            Double num1 = scanner.nextDouble();
            
            System.out.print("Digite o segundo número: ");
            Double num2 = scanner.nextDouble();

            if (operacao_digitada.equals("+")) {
                System.out.print("O resultado da soma de " + num1 + " e " + num2 + " é de : ");
                sum(num1, num2);

            } else if (operacao_digitada.equals("-")) {
                System.out.print("O resultado da subtração de " + num1 + " e " + num2 + " é de : ");
                sub(num1, num2);

            } else if (operacao_digitada.equals("*")) {
                System.out.print("O resultado da multiplicação de " + num1 + " e " + num2 + " é de : ");
                mult(num1, num2);

            } else if (operacao_digitada.equals("/")) {

                if (num2 == 0) {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                } else {
                    System.out.print("O resultado da divisão de " + num1 + " e " + num2 + " é: ");
                    div(num1, num2);
                }
                
            } else if (operacao_digitada.equals("**")) {
                System.out.print("O resultado da potenciação de " + num1 + " e " + num2 + " é de : ");
                pot(num1, num2);
            }

            System.out.print("Deseja realizar outra operação? (S/N): ");
            continuar = scanner.next();
            scanner.nextLine();

        } while (continuar.equalsIgnoreCase("S" )); // Continuar se o usuário digitar 's' ou 'S'

        scanner.close(); // Fechar o scanner
    }

    // FUNÇÕES OU MÉTODOS DO CÓDIGO
    static void sum(double num1, double num2) {
        System.out.println(num1 + num2);
    }

    static void sub(double num1, double num2) {
        System.out.println(num1 - num2);
    }

    static void mult(double num1, double num2) {
        System.out.println(num1 * num2);
    }

    static void div(double num1, double num2) {
        System.out.println(num1 / num2);
    }

    static void pot(double num1, double num2) {
        System.out.println(Math.pow(num1, num2));
    }
}
