import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sigla;

        System.out.println("Insira a sigla (P, M OU G): ");
        sigla = scanner.next();

        switch (sigla) {
            case "M":{
                System.out.println("MEDIO");
                break;
            }
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }     
            default:{
                System.out.println("Tamanho invalido.");
            }

            
                    
            
                scanner.close();
        }
    }
}
