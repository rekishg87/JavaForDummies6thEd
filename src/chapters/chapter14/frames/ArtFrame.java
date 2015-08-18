package chapters.chapter14.frames;

import chapters.chapter14.drawings.Drawing;

import javax.swing.JFrame;
import java.awt.Graphics;

/**
 * Created by Rekish on 8/18/2015.
 */
public class ArtFrame extends JFrame {
    private static final long serialVersionUID = 1L;

    Drawing drawing;

    public ArtFrame(Drawing drawing) {
        this.drawing = drawing;
        setTitle("Abstract Art");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        drawing.paint(g);
    }
}
