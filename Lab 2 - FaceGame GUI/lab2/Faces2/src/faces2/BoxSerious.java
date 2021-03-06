package faces2;

import static faces2.AbstractFace.sg;
import java.awt.Color;
import simplegui.DrwImage;

public class BoxSerious extends BoxFace {

    BoxSerious(int x, int y, int size) {
        super(x, y, size);
    }

    @Override
    public void drawFaceShape(Color c) {
        sg.drawFilledBox(x, y, size, size / 2, c, 1.0, "");

        // DrwImage im = new DrwImage("lips.png");
        // place the eyes and mouth dependign on position and facesize
        int centerX = x + size / 2;
        int centerY = y + size / 4;
        int eyeRadius = size / 10;

        // nose in center
        sg.drawFilledEllipse(centerX - eyeRadius / 2 / 4, centerY - eyeRadius / 2 / 3, eyeRadius / 4, eyeRadius / 3, Color.red, 1.0, "");

        // eyes
        int leftEyeX = centerX - size / 7 - eyeRadius / 2;
        int rightEyeX = centerX + size / 7 - eyeRadius / 2;
        int eyeY = centerY - size / 7;
        sg.drawFilledEllipse(leftEyeX, eyeY, eyeRadius, eyeRadius, Color.red, 1.0, "");
        sg.drawFilledEllipse(rightEyeX, eyeY, eyeRadius, eyeRadius, Color.red, 1.0, "");

        // mouth
        int mouthY = centerY + size / 12;

        sg.drawLine(leftEyeX + eyeRadius, mouthY, rightEyeX, mouthY, Color.red, 1.0, eyeRadius / 3, "");

    }

}
