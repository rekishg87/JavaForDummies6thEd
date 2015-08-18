package chapters.chapter14.examples;


import chapters.chapter14.drawings.DrawingWideBB;
import chapters.chapter14.frames.ArtFrame;

/**
 * Created by Rekish on 8/18/2015.
 */
public class ShowFrame {

    public static void main(String args[]) {
        ArtFrame artFrame = new ArtFrame(new DrawingWideBB());

        artFrame.setSize(200, 100);
        artFrame.setVisible(true);
    }
}
