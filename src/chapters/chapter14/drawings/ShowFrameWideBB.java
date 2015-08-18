package chapters.chapter14.drawings;

import chapters.chapter14.drawings.Drawing;
import chapters.chapter14.frames.ArtFrame;

/**
 * Created by Rekish on 8/18/2015.
 */
public class ShowFrameWideBB {

    public static void main(String args[]) {
        Drawing drawing = new Drawing();
        drawing.width = 100;
        drawing.height = 30;

        ArtFrame artFrame = new ArtFrame(drawing);
        artFrame.setSize(200, 100);
        artFrame.setVisible(true);
    }
}
