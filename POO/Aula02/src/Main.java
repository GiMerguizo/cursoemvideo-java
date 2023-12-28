public class Main {
    public static void main(String[] args) {
        /* Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();

        c1.status();
        c1.rabiscar();
        c1.destampar();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar(); */

        System.out.println("Exercicio");
        Violao v1 = new Violao();

        v1.modelo = "Shelby";
        v1.tipoCorda = "Aço";
        v1.cor = "Bege";
        v1.tamanho = "Médio";
        v1.som = "Elétrico";
        v1.status();
        v1.tocar();
        v1.guardar();

        System.out.println("\n--- Música ---");
        Musica m1 = new Musica();
        m1.nome = "Mova-se";
        m1.cantor = "Biorki";
        m1.duracao = 4.27f;
        m1.estilo = "Trap";
        m1.status = false;

        m1.dados();
        m1.verStatus();

        m1.play();
        m1.verStatus();
        m1.pause();
        m1.verStatus();

    }
}