
//package testfaces2;

import simplegui.*;

public class TestKeyboard {

     public static void main(String[] args) {
        SimpleGUI sg = new SimpleGUI(false);
        sg.drawText("Enter a key", 10, 20);
        char keyRead = sg.keyReadChar();
        sg.drawText("You entered: " + keyRead, 10, 80);

    }

}
