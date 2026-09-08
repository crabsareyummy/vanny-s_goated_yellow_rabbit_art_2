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
        SimpleGraphics.fillBackground("white");

        SimpleGraphics.drawSparkleGlow(300, 240, 160, "#ffffd0");

        // 3. Lotus flowers peaking up from the bottom corners & center
        // Left flower
        SimpleGraphics.drawLotusFlower(60, 360, 35, "#ffb7c5", "#fff275"); 
        // Middle flower (bottom center)
        SimpleGraphics.drawLotusFlower(300, 380, 30, "#ffb7c5", "#fff275"); 
        // Right flower
        SimpleGraphics.drawLotusFlower(540, 350, 40, "#ffb7c5", "#fff275");

        SimpleGraphics.drawRabbitLeaf(300, 340, 180, 50, "#76b852");

        SimpleGraphics.drawRabbitEars(300, 150, 25, 90, "#fff5e1", "pink");

        SimpleGraphics.drawRabbitBody(300, 290, 150, 130, "#fff5e1");

        SimpleGraphics.drawRabbitHead(300, 210, 160, 140, "#fff5e1"); 

        SimpleGraphics.drawStar(200, 200, 20, "#fff275");
        SimpleGraphics.drawStar(250, 250, 20, "#fff275");
        SimpleGraphics.drawStar(300, 300, 20, "#fff275");
        SimpleGraphics.drawStar(350, 350, 20, "#fff275");
        SimpleGraphics.drawStar(400, 400, 20, "#fff275");

        
       
    }

    public static void main(String[] args) {
        // Launch the window; only edit the starting canvas dimensions if you'd like to.
        SimpleGraphics.start(MyPicture::drawPicture, 600, 400);
    }
}
