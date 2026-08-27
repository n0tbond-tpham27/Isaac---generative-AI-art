package org.example;


/**
 * MyPicture.java
 * --------------
 * Write the code to draw your scene here. Most of your changes should go inside
 * the drawPicture method below, unless you're defining additional methods or
 * variables to help organize your code.
 *
 * If you want to enhance the functionality of the drawing library itself (e.g. add
 * a new shape function), put that in SimpleGraphics.java instead.
 */
public class MyPicture {

    public static void drawPicture(double width, double height) {
        // Fill the background
        
        String[] colors = {"red", "orange", "yellow", "green", "blue", "#c7c1c1", "white"};
        

        SimpleGraphics.fillBackground("black");

        SimpleGraphics.drawMoon(width - 80, 70, 40, "#f4f1c9");

        for(int i = 0; i < (colors.length -1); i++) {

            int random = (int)(Math.random()*150);
            int random2 = (int)(Math.random()*400);

            SimpleGraphics.drawStreamer(50 + i * 100, 350, random, random2, colors[i], colors[i + 1]);
        }

        
    }

    public static void main(String[] args) {
        // Launch the window; only edit the starting canvas dimensions if you'd like to.
        SimpleGraphics.start(MyPicture::drawPicture, 600, 400);
    }
}
