package chapters.chapter14.drawings;

import java.awt.Graphics;

/**
 * Created by Rekish on 8/18/2015.
 */
public class Drawing {
    protected int x = 40, y = 40, width = 40, height = 40;

    public void paint(Graphics g) {
        g.drawOval(x, y, width, height);
    }
}
