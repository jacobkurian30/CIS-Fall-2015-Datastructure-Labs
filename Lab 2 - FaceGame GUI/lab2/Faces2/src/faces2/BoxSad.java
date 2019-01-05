package faces2;

import static faces2.AbstractFace.sg;
import java.awt.Color;
import simplegui.DrwImage;

/**
 *
 * @author jacob
 */
public class BoxSad extends BoxFace {

    BoxSad(int x, int y, int size) {
        super(x, y, size);
    }

    @Override
    public void drawFaceShape(Color c) {

        DrwImage im = new DrwImage("sad.png");
        int centerX = x + size / 2;
        int centerY = y + size / 4;
        int eyeRadius = size / 10;
//
        sg.drawFilledBox(x, y, size, size / 2, c, 1.0, "");

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

        // sg.drawLine(leftEyeX + eyeRadius, mouthY +eyeRadius, rightEyeX, mouthY + eyeRadius , Color.red, 1.0, eyeRadius / 3, "");
//sg.drawLine(rightEyeX, mouthY  + eyeRadius, rightEyeX-eyeRadius, mouthY-(eyeRadius) + eyeRadius, Color.red, 1.0, eyeRadius/2, null);
//sg.drawLine(leftEyeX + eyeRadius , mouthY + eyeRadius, rightEyeX-eyeRadius, mouthY-(eyeRadius) + eyeRadius, Color.red,1.0, eyeRadius/2,"");
        sg.drawImage(im, leftEyeX + ((eyeRadius * 2 * 2 * 2 * 1.5) / 25), mouthY - (eyeRadius / 3), eyeRadius * 3, eyeRadius * 2, null);

    }

}
