public class SmartTv {
    // Atributos da TV: ligada, canal e volume.
    boolean ligada = false;  // A TV começa desligada.
    int canal = 1;  // A TV começa no canal 1.
    int volume = 25;  // A TV começa com volume 25.

    // Método para ligar a TV.
    public void ligar() {
        ligada = true;  // Define que a TV está ligada.
    }

    // Método para desligar a TV.
    public void desligar() {
        ligada = false;  // Define que a TV está desligada.
    }

    // Método para aumentar o volume da TV.
    public void aumentarVolume() {
        volume++;  // Incrementa o volume em 1.
        System.out.println("Aumentando o volume para: " + volume);  // Imprime o novo volume.
    }

    // Método para diminuir o volume da TV.
    public void diminuirVolume() {
        volume--;  // Decrementa o volume em 1.
        System.out.println("Diminuindo o volume para: " + volume);  // Imprime o novo volume.
    }

    // Método para aumentar o canal da TV.
    public void aumentarCanal() {
        canal++;  // Incrementa o canal em 1.
    }

    // Método para diminuir o canal da TV.
    public void diminuirCanal() {
        canal--;  // Decrementa o canal em 1.
    }

    // Método para mudar o canal da TV para um canal específico.
    public void mudarCanal(int novoCanal) {
        canal = novoCanal;  // Define o canal para o novo canal especificado.
    }
}
