import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String plano;

            System.out.println("Insira o seu plano (B, M ou T): ");
            plano = scanner.next();

            switch (plano) {
                case "T":{
                    System.out.println("5GB Youtube");
                }
                case "M":{
                    System.out.println("Whatsapp e Instagram grátis");
                }
                case "B":{
                    System.out.println("100 minutos de ligação.");
                    break;
                }
                default:{
                    System.out.println("Plano invalido. ");
                    break;
                }
            }
                scanner.close();
    }
}

