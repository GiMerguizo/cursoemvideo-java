package horadosistema;

import java.awt.*;
import java.util.Date;
import java.util.Locale;

public class HoraDoSistema {
    public static void main(String[] args) {
        Date relogio = new Date();
        Locale idioma = Locale.getDefault();
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();

        // Hora do sistema
        System.out.println("A hora do sistema é:");
        System.out.println(relogio);
        System.out.println();

        // Idioma
        System.out.println("Idioma do Sistema Operacional: ");
        System.out.println(idioma.getDisplayLanguage() + " - " + idioma.getLanguage());
        System.out.println();

        // Resolução
        System.out.println("Resolução da Tela: " + d.width + " x " + d.height);

    }
}