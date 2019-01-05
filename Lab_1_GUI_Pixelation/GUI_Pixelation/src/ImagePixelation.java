// Jacob Kurian
// 09/03/2015
// Lab 1
import java.awt.Color;
import simplegui.*;

public class ImagePixelation {

    public static void main(String[] args) {
        DrwImage image = new DrwImage("land.jpg");
        SimpleGUI simpleGui = new SimpleGUI(image.getWidth(), image.getHeight(), false);
// getting width and height of the image
        int imageWidth = image.getWidth();
        int imageHeight = image.getHeight();
        simpleGui.drawImage(image, 0, 0, imageWidth, imageHeight, null);

        int gridSize = 16;
        // to remove the extra boxes at the last corner
        simpleGui.eraseAllDrawables();
        pixelateImage(image, simpleGui, gridSize);

    }

// Method to get Pixelate image
    public static void pixelateImage(DrwImage image, SimpleGUI simpleGui, int gridSize) {
        for (int row = 0; row < image.getHeight() - gridSize; row += gridSize) {
            for (int column = 0; column < image.getWidth() - gridSize; column += gridSize) {
                Color AverageCol = ComputeAvgColor(image, row, gridSize, column);
                simpleGui.setColorAndTransparency(AverageCol, 1.0);
                simpleGui.drawFilledBox(column, row, gridSize, gridSize);
            }

        }
    }

    // method for average color
    public static Color ComputeAvgColor(DrwImage image, int row, int gridSize, int column) {
        int colorR = 0, colorG = 0, colorB = 0;

        //Loops for average color
        for (int r = row; r < row + gridSize - 1; r = r + 1) {
            for (int c = column; c < column + gridSize - 1; c = c + 1) {

                RGB rgb = image.getPixelRGB(c, r);
                // calculating th total colr
                colorR += rgb.r;
                colorG += rgb.g;
                colorB += rgb.b;
            }
        }
        // getting the average of the color
        int AvR = colorR / (gridSize * gridSize);
        int AvB = colorB / (gridSize * gridSize);
        int AvG = colorG / (gridSize * gridSize);

        return new Color(AvR, AvG, AvB);

    }
}
