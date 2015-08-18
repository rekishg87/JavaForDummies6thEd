package chapters.chapter14.drawings;

import java.awt.Graphics;

/**
 * Created by Rekish on 8/18/2015.
 */
public class DrawingWideBB extends Drawing {
    int width = 100, height = 30;

    @Override
    public void paint(Graphics g) {
        g.drawOval(x, y, width, height);
    }
}
