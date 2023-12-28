import java.awt.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("Idioma do sistema: " + loc.getDisplayLanguage());
        System.out.println("País: " + loc.getDisplayCountry());
        System.out.println("Resolução da tela: " + d.width + " x " + d.height);
    }
}