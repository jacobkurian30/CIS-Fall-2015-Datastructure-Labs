package faces2;

import java.awt.Color;

/**
 *
 * @author rolf
 */
public class EllipseFace extends AbstractFace {

    EllipseFace(int x, int y, int size) {
        super(x, y, size);
    }

    @Override
    public void drawFaceShape(Color c) {
        sg.drawFilledEllipse(x, y, size, size / 2, c, 1.0, "");
    }
//    public void happyExpression(Color c){
//        sg.drawFilledEllipse(x, y, size, size / 2, c, 1.0, "");
//    }
}
