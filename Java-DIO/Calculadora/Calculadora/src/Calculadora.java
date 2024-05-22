import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        int escolha;

        while (true) {
            System.out.println("\n\n----------------------------------------------------");
            System.out.println("\nEscolha a opção:\n1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão");
            escolha = lerTeclado.nextInt();

            if (escolha == 1 || escolha == 2 || escolha == 3 || escolha == 4) {
                break; // Sai do loop se a escolha for válida
            } else {
                System.out.println("Escolha inválida. Tente novamente.");
            }
        }

        double resultado = 0;
        double num;
        boolean primeiroNumero = true;

        while (true) {
            System.out.println("Informe um número: (0 para finalizar)");
            num = lerTeclado.nextDouble();

            if (num == 0) {
                break; // Sai do loop se o usuário digitar 0
            }

            if (primeiroNumero) {
                resultado = num; // Inicializa o resultado com o primeiro número fornecido
                primeiroNumero = false;
            } else {
                switch (escolha) {
                    case 1: {
                        resultado += num;
                        break;
                    }
                    case 2: {
                        resultado -= num;
                        break;
                    }
                    case 3: {
                        resultado *= num;
                        break;
                    }
                    case 4: {
                        if (num != 0) {
                            resultado /= num;
                        } else {
                            System.out.println("Divisão por zero não é permitida.");
                        }
                        break;
                    }
                }
            }
        }

        System.out.print("\nResultado: " + resultado);
        System.out.println("\n----------------------------------------------------");

        lerTeclado.close();
    }
}
