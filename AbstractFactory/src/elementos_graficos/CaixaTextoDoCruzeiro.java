/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package elementos_graficos;

import java.awt.Font;
import javax.swing.JTextField;

/**
 *
 * @author Paulo
 */
public class CaixaTextoDoCruzeiro extends JTextField {

    @Override
    public Font getFont() {
        return new Font(Font.MONOSPACED, Font.BOLD, 16);
    }
    
}
