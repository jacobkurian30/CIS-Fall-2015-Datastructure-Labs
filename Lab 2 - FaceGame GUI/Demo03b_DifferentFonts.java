/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demos;

import java.awt.Color;
import simplegui.SimpleGUI;

public class Demo03b_DifferentFonts {

    public static void main(String[] args) {
        SimpleGUI sg = new SimpleGUI(800, 600, false);
        sg.setTitle("Demo3b: Fonts");

        sg.setFont("SansSerif", "Plain", 14);
        sg.drawText("SansSerif, Plain, 14", 10, 20, Color.black, 1.0, null);
        sg.setFont("SansSerif", "Italic", 14);
        sg.drawText("SansSerif, Italic, 14", 10, 40, Color.black, 1.0, null);
        sg.setFont("SansSerif", "Bold", 14);
        sg.drawText("SansSerif, Bold, 14", 10, 60, Color.black, 1.0, null);
        sg.setFont("SansSerif", "boldItalic", 14);
        sg.drawText("SansSerif, Bold and Italic, 14", 10, 80, Color.black, 1.0, null);
        sg.setFont("Serif", "Plain", 20);
        sg.drawText("Serif, Plain, 20", 10, 110, Color.blue, 1.0, null);
        sg.setFont("Monospaced", "Bold", 30);
        sg.drawText("Monospaced, Bold, 30", 10, 150, Color.red, 1.0, null);
    }
}
