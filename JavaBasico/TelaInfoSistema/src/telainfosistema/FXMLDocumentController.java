/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package telainfosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.URL;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Master
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblHora;
    private Label lblIdioma;
    private Label lblTela;
    private Button btnClick;
    
    @FXML
    private void clicouBotao(ActionEvent event) {
        Date relogio = new Date();
        Locale idioma = Locale.getDefault();
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
                
        lblHora.setText(relogio.toString());
        lblIdioma.setText(idioma.getDisplayLanguage());
        lblTela.setText(d.width + " x " + d.height);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
