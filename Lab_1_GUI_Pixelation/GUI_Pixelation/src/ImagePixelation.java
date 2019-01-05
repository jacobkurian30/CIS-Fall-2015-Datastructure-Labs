// Jacob Kurian
// 09/03/2015
// Lab 1

import java.awt.Color;
import simplegui.*;

public class ImagePixelation {

    public static void main(String[] args) {
        DrwImage im = new DrwImage("land.jpg");
        SimpleGUI sg = new SimpleGUI(im.getWidth(), im.getHeight(), false);
// getting width and height of the image
        int width = im.getWidth();
        int height = im.getHeight();
        sg.drawImage(im, 0, 0, width, height, null);

        int gridSize = 16;
        // to remove the extra boxes at the last corner
        sg.eraseAllDrawables();
        pixImage(im, sg, gridSize);
           
    }


    
// Method to get Pixelate image

    public static void pixImage(DrwImage im, SimpleGUI sg, int gridSize) {
        for (int row = 0; row < im.getHeight() - gridSize ; row += gridSize) {
            for (int column = 0; column < im.getWidth() - gridSize; column += gridSize) {
           Color AverageCol = ComputeAvgColor(im,row, gridSize, column);
            sg.setColorAndTransparency(AverageCol, 1.0);
        //  This is method to draw the dots
            //  sg.drawDot(row, column, 1);
            
           sg.drawFilledBox(column, row, gridSize, gridSize);

            }

        }
    }

    // method for average color
    public static Color ComputeAvgColor(DrwImage im, int row, int gridSize, int column) {
        int colorR = 0, colorG = 0, colorB = 0;

        //Loops for average color
        for (int r = row; r < row+ gridSize -1  ; r = r + 1){
        for (int c = column; c < column + gridSize -1; c = c + 1) {
             
                RGB rgb = im.getPixelRGB(c, r);
              // calculating th total colr
                colorR += rgb.r;
                colorG += rgb.g;
                colorB += rgb.b;
            }
        }
        // getting the average of the color
        int AvR = colorR /(gridSize * gridSize);
        int AvB = colorB / (gridSize * gridSize);
        int AvG = colorG /(gridSize * gridSize);
        
            return new Color(AvR, AvG, AvB);

    } 
}
