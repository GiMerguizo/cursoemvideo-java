public class Musica {
    String cantor;
    String nome;
    float duracao;
    String estilo;
    boolean status;

    void dados() {
        System.out.println("Cantor: " + this.cantor);
        System.out.println("Nome: " + this.nome);
        System.out.println("Duração: " + this.duracao);
        System.out.println("Estilo: " + this.estilo);
    }

    void verStatus() {
        System.out.println("Status: " + this.status);
    }

    void play() {
        this.status = true;
        System.out.println("Tocando!");
    }

    void pause() {
        this.status = false;
        System.out.println("PAUSE!");
    }
}
