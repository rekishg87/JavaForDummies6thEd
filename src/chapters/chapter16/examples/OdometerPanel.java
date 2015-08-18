package chapters.chapter16.examples;

import javax.swing.JPanel;
import java.awt.*;

/**
 * Created by Rekish on 8/18/2015.
 */
public class OdometerPanel extends JPanel {
    private static final long serialVersionUID = 1L;

    long hitCount = 239472938472L;

    public void paint(Graphics myGraphics) {
        myGraphics.setFont(new Font("Monospaced", Font.PLAIN, 24));
        myGraphics.drawString
                ("You are visitor number "
                 + Long.toString(hitCount++), 50, 50);
    }
}
