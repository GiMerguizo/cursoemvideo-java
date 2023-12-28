public class Violao {
    String modelo;
    String cor;
    String tamanho;
    String tipoCorda;
    String som;

    void tocar() {
        System.out.println("Praticando!");
    }

    void status() {
        System.out.println("--- Violão ---");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Tipo de corda: " + this.tipoCorda);
        System.out.println("Tipo de violão: " + this.som);
    }

    void guardar() {
        System.out.println("Poxa! Pendurado :(");
    }

}
