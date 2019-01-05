package faces2;

import static faces2.AbstractFace.sg;
import java.util.Random;
import java.awt.Color;
import simplegui.SimpleGUI;

/**
 *
 * @author rolf
 */
public class Faces2 {
    // public stat

    public static void main(String[] args) {
        SimpleGUI sgMain = new SimpleGUI(false);
        sg = sgMain;
        sg.setBackgroundColor(new Color(85, 24, 56));

        int numFaces = 16;
        AbstractFace[] faces = new AbstractFace[numFaces];
        int f = 0;

        welcome();

        faces[f++] = new playGame(0, 0, 100);

        thankyou();

    }

    //Welcome message
    public static void welcome() {
        int width = sg.getWidth();
        int height = sg.getHeight();
        // sg.setBackgroundColor(new Color(5,24,56));
        int newh = width / 22;
        int neww = height / 5;
        Color c = new Color(50, 100, 56);
        sg.drawFilledEllipse(width / 22, height / 5, 600, 300, c, 1, null);
//String  (You have to guess the secret face here);
        sg.setFont("SansSerif", "Bold", 28);
        sg.drawText("Welcome To Our Guessing Game.   ", 100, 240, Color.yellow, 1.0, null);
        sg.setFont("SansSerif", "Bold", 14);

        sg.drawText("You have to guess the secret face here.", 100, 260, Color.yellow, 1.0, null);
        sg.drawText("Press any key to start ", 100, 280, Color.yellow, 1.0, null);
        char start = sg.keyReadChar();
        // sg.pauseProgram(8000);

        sg.eraseAllDrawables();
        sg.pauseProgram(1000);
    }
    // thank you message

    public static void thankyou() {
        sg.setFont("SansSerif", "Bold", 28);
        sg.drawText("Thank you for playing ", 10, 40, Color.yellow, 1.0, null);
        char start = sg.keyReadChar();
        sg.eraseAllDrawables();

    }

}
