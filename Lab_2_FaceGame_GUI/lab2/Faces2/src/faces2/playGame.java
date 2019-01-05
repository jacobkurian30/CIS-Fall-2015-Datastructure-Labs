package faces2;

import java.util.Random;

import java.awt.Color;

public class playGame extends AbstractFace {

    playGame(int x, int y, int size) {
        super(x, y, size);

    }

    @Override
    public void drawFaceShape(Color c) {
        int sum = 0;

        for (int e = 0; e < 1; e++) {
            sg.drawText("First try is a trial for You", 10, 40, Color.yellow, 1.0, null);
            break;
        }
        //for (int x =0; x<1; ++x){
        int count = 0;
        while (count < 5) {
            // For the Random Number generator
            Random randomGenerator = new Random();
            int randomInt = randomGenerator.nextInt(6);

            sg.drawText("Enter the face shape: 'b' for box and 'e' for eclipse!", 10, 60, Color.yellow, 1.0, null);
            String shape = sg.keyReadString();
            sg.drawText("Enter the emotion: frown (f), smile (m), serious(r) ", 10, 80, Color.yellow, 1.0, null);
            String emotion = sg.keyReadString();
            // Switch case for get the box or ellipse 
            switch (shape.toLowerCase()) {
                case "b": {
                    // Nested switch ro user user input for emotion
                    switch (emotion.toLowerCase()) {
                        case "m": {

                            if (randomInt == 0) {
                                sg.drawText("You are Right! The secrete face is BoxSmile", 10, 100, Color.yellow, 1.0, null);
                                sum = sum + 1;
                            } else {
                                sg.drawText("wrong !!!!", 10, 100, Color.yellow, 1.0, null);
                            }
                        }
                        break;

                        case "f": {
                            if (randomInt == 1) {
                                sg.drawText("You are Right! The secrete face is BoxSad", 10, 100, Color.yellow, 1.0, null);
                                sum = sum + 1;
                            } else {
                                sg.drawText("wrong", 10, 100, Color.yellow, 1.0, null);
                            }
                        }
                        break;

                        case "r": {

                            if (randomInt == 2) {
                                sg.drawText("You are Right! The secrete face is BoxSerious", 10, 100, Color.yellow, 1.0, null);
                                sum = sum + 1;

                            } else {
                                sg.drawText("wrong", 10, 100, Color.yellow, 1.0, null);
                            }
                        }
                        break;

                    }

                }
                break;
                case "e": {
                    switch (emotion.toLowerCase()) {

                        case "h": {
                            if (randomInt == 3) {
                                sg.drawText("You are Right! The secrete face is Ellipse Happy", 10, 100, Color.yellow, 1.0, null);
                                sum = sum + 1;
                            } else {
                                sg.drawText("wrong", 10, 100, Color.yellow, 1.0, null);
                            }
                        }
                        break;
                        case "f": {
                            if (randomInt == 4) {
                                sg.drawText("You are Right! The secrete face is Ellipse Frowny face ", 10, 100, Color.yellow, 1.0, null);
                                sum = sum + 1;
                            } else {
                                sg.drawText("wrong", 10, 100, Color.yellow, 1.0, null);
                            }
                        }
                        break;
                        case "r": {
                            if (randomInt == 5) {
                                sg.drawText("You are Right! The secrete face is Ellipse Serious face ", 10, 100, Color.yellow, 1.0, null);
                                sum = sum + 1;
                            } else {
                                sg.drawText("wrong", 10, 100, Color.yellow, 1.0, null);
                            }
                        }
                    }

                }
            }

            // face geberator 
            sg.drawText("The winning point: " + sum + "%", 10, 320, Color.yellow, 1.0, null);
            int numFaces = 16;
            AbstractFace[] faces = new AbstractFace[numFaces];
            int f = 0;

            if (randomInt == 0) {
                faces[f++] = new Boxhappy(100, 150, 100);
            }
            if (randomInt == 1) {
                faces[f++] = new BoxSad(100, 150, 100);

            }
            if (randomInt == 2) {

                faces[f++] = new BoxSerious(100, 150, 100);
            }
            if (randomInt == 3) {

                faces[f++] = new ElipHappy(100, 150, 100);
            }
            if (randomInt == 4) {

                faces[f++] = new ElipSad(100, 150, 100);
            }
            if (randomInt == 5) {

                faces[f++] = new ElipSerious(100, 150, 100);
            }

            sg.pauseProgram(2000);
            sg.eraseAllDrawables();
            count++;
        }
    }
}
