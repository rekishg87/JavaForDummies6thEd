package chapters.chapter16.examples;

import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Graphics;

/**
 * Created by Rekish on 8/18/2015.
 */
public class DummiesPanel extends JPanel {
    private static final long serialVersionUID = 1L;

    public void paint(Graphics myGraphics) {

        myGraphics.drawRect(50, 60, 220, 75);
        myGraphics.setFont
                (new Font("Dialog", Font.BOLD, 24));
        myGraphics.drawString("Java For Dummies", 55, 100);
    }
}
