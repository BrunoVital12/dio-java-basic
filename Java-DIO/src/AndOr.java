public class AndOr {
    public static void main (String [] args) {
        boolean condicao1=true;
        boolean condicao2=false;

        //se condicao1 E condicao2 = true
        if(condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");
        }
        
        //se condicao1=true OU condicao2=true
        if(condicao1 || condicao2){
            System.out.println("uma das condições é verdadeira");
        }

    }
}
