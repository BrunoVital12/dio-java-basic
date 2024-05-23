import java.util.Scanner;

public class Ternário {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota;
        double nota2;
        System.out.println("Insira a sua nota: ");
        nota = scanner.nextDouble();

		String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);

        System.out.println("Insira a sua outra nota: ");
        nota2 = scanner.nextDouble();

        String resultado2 = nota2 >= 7 ? "Aprovado" : nota2 >= 5 && nota2 <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado2);

        scanner.close();
    }
}
