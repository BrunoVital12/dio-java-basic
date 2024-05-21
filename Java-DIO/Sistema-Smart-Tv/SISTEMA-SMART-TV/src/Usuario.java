public class Usuario {
    public static void main(String[] args) throws Exception {
        
        // Cria uma nova instância da classe SmartTv, ou seja, uma nova TV inteligente.
        SmartTv smartTv = new SmartTv();

        // Imprime o status inicial da TV: se está ligada, qual é o canal atual e o volume.
        System.out.println("Tv ligada? " + smartTv.ligada);  // false, porque a TV começa desligada.
        System.out.println("Canal atual: " + smartTv.canal);  // 1, porque a TV começa no canal 1.
        System.out.println("Volume atual: " + smartTv.volume);  // 25, porque a TV começa com volume 25.

        // Aumenta o volume da TV em 1 unidade.
        smartTv.aumentarVolume();

        // Liga a TV.
        smartTv.ligar();

        // Imprime o novo status da TV: se está ligada.
        System.out.println("Novo status - Tv ligada? " + smartTv.ligada);  // true, porque acabamos de ligar a TV.

        // Muda o canal da TV para o canal 13.
        smartTv.mudarCanal(13);

        // Imprime o canal atual da TV.
        System.out.println("Canal atual: " + smartTv.canal);  // 13, porque acabamos de mudar para o canal 13.
    }
}

