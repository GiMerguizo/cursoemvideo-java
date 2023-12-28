package aula04;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        /*
        c1.setModelo("Bic");
        c1.setPonta(0.5f);

        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta() + ".");
         */
        c1.status();
        Caneta c2 = new Caneta("NIC", "Amarelo", 0.4f);
        c2.status();
    }
}