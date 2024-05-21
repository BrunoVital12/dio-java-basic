public class BooleanEx {
    public static void main(String[] args){

        int numero1 = 1;
        int numero2 = 2;

        //if  numero1 == numero2, retorna false ou true.
        boolean simNao = numero1 == numero2;

        System.out.println("Numero 1 é igual ao numero 2? " + simNao);

        //if numero1 !=(diferente) numero2, retorna false ou true.
        simNao = numero1 != numero2;

        System.out.println("Numero 1 é diferente ao numero 2? " + simNao);

        //if numero1 maior que numero2, retorna false ou true.
        simNao = numero1 > numero2;

        System.out.println("Numero 1 é maior que o numero 2? " + simNao);
    }

}
