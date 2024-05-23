public class IfSimples {
    public static void main(String[] args) {
        double saldo = 7.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo: " + saldo);

        }else
        System.out.println("Saldo insuficiente");

    }
}
