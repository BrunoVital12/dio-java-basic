import java.util.Scanner;

public class Calculadora {
    
public static void main (String [] args) {
    System.out.println("\n\n----------------------------------------------------");
    double resultado = 0;
    Scanner lerTeclado = new Scanner(System.in);
    System.out.println("Informe um numero: ");
    double num1 = lerTeclado.nextDouble(); 
    System.out.println("\nInforme outro numero: ");
    double num2 = lerTeclado.nextDouble();

    System.out.println("\nEscolha a opção:\n1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão");
    int escolha = lerTeclado.nextInt();
    switch (escolha) {
        case 1:{
            resultado = num1 + num2;
            break;
        }
        case 2:{
            resultado = num1 - num2;
            break;
        }
        case 3:{
            resultado = num1 * num2;
            break;
        }
        case 4:{
            resultado = num1 / num2;
            break;
        }
        default:
            System.out.println("Escolha invalida");
            break;
    }    

    System.out.print("\nResultado: " + resultado);
    System.out.println("\n----------------------------------------------------");

    lerTeclado.close();
}
}  