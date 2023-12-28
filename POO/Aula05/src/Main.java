public class Main {
    public static void main(String[] args) {
        /* ContaBanco c1 = new ContaBanco();
        ContaBanco c2 = new ContaBanco();

        c2.abrirConta("CC");
        c2.pagarMensal();

        System.out.println(c1.imprimir());
        System.out.println(c2.imprimir());
         */

        // Criando a conta do Jubileu
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");

        // Criando a conta da Creuza
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");


        p1.depositar(100);
        p2.depositar(500);

        p2.sacar(100);
        p1.sacar(1000);

        p1.sacar(150);
        p1.fecharConta();

        p1.estadoAtual();
        p2.estadoAtual();
    }
}